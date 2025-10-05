package com.cms.services;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.exception.CmsException;
import static com.cms.services.validation.ValidateAllInput;

public class Cmsservicesimpl implements Cmsservices {
	
	Map<String,Customer>CustomerMap=new HashMap<>(1024);

	@Override
	public Customer registerCustomer(String firstname, String lastname, String email, String password, int regAmount,
			String dob, String plan) throws CmsException {
		Customer c=ValidateAllInput(firstname,lastname,email,password,regAmount,dob,plan,CustomerMap);
		CustomerMap.put(email, c);
		
		return c;
	}
	@Override
	public void displayCustomer() {
		for(Customer c: CustomerMap.values()) {
			System.out.println(c);
			//System.out.println("inside display");
		}
	}
	@Override 
	public Customer signUp(String email,String password)throws CmsException {
		Customer c=CustomerMap.get(email);
		if(c==null) {
			throw new CmsException("Invalid email");
		}
		if (!c.getPassword().equals(password)) {
			throw new CmsException("Invalid password");
		}
		return c;
	}
	@Override
	public String changePassword(String email, String oldpass, String newpass)throws CmsException {
		 Customer valid=signUp(email,oldpass);
		 valid.setPassword(newpass);
		 return "password is changed";
	}
	@Override
	public String unsubscribe(String email)throws CmsException{
		if(CustomerMap.remove(email)!=null)
			return "Customer un subscribed";
		throw new CmsException("un subscibed failed -email doesnot exists");
	}
	@Override
	public void searchByPlanAndDate(String date, String plan) throws CmsException {
		ServicePlan myplan=ServicePlan.valueOf(plan.toUpperCase());
		LocalDate dob=LocalDate.parse(date);
		
		for(Customer c: CustomerMap.values()) {
			if(c.getPlan().equals(myplan) && c.getDob().equals(dob)) {
				System.out.println(c);
				System.out.println("searchByPlanAndDate done!!");
			}
		}
		
	};
	
	

}
