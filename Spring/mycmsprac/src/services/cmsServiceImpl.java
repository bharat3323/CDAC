package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.myscms.core.Customer;
import com.myscms.core.ServicePlan;
import com.myscms.custom_expections.CmshandlingException;


public class cmsServiceImpl implements CmsService {
	
	List<Customer>customers;
	
	public cmsServiceImpl() {
		this.customers=new ArrayList<>(1024);
		customers.add(new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000, LocalDate.of(1990, 5, 12),
				ServicePlan.SILVER));
		customers.add(new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000, LocalDate.of(1995, 8, 23),
				ServicePlan.GOLD));
		customers.add(new Customer("Rahul", "Patil", "ahul@yahoo.com", "rahul@123", 5000, LocalDate.of(1988, 1, 3),
				ServicePlan.DIAMOND));
	}

	@Override
	public String registerCustomer(String firstName, String lastname, String email, String password, int regAmount,
			String dob, String plan) {
		
		Customer c = cmsValidation.validateAllInputs(firstName,lastname, email, password, regAmount, dob, plan);
		customers.add(c);
		
		return "Registration successful !";
	}

	@Override
	public void displayCustomerDetails() {
		
		for(Customer c:customers ) {
			System.out.println(c);
		}
	}

	
	public Customer signIn(String email, String password) throws CmshandlingException{
		
		Customer c=new Customer(email);
		
		int index=customers.indexOf(c);
		if(index ==-1)
			throw new CmshandlingException("Invalid email!!!!!");
		
		Customer completedetails=customers.get(index);
		if(!completedetails.getPassword().equals(password)) {
			throw new CmshandlingException("Invalid password");
			
		}
		return completedetails;
		
	}

	@Override
	public String resetPass(String email,String oldpass,String newpass) 
			throws CmshandlingException {
		
			Customer validCustomer=signIn(email,oldpass);
			validCustomer.setPassword(newpass);
			return "password updated!!!";
		
		
	}

	@Override
	public String unsuscribe(String email) throws CmshandlingException {
		Customer c=new Customer(email);
		if(customers.remove(c))
			return "Customers unsubscribed";
		throw new CmshandlingException("Unsubscibed");
	}

	@Override
	public void searchByplanAndDate(String plan, String date) throws CmshandlingException {
		ServicePlan myPlan = ServicePlan.valueOf(plan.toUpperCase());
		System.out.println(myPlan.name());
		LocalDate dob = LocalDate.parse(date);
		for(Customer c: customers) {
			
			//System.out.println(c.getFirstName()+" "+c.getLastName());
			//c.getDob().isAfter(dob)
			if(c.getPlan().equals(myPlan) && c.getDob().equals(dob)) {
				System.out.println(c.getFirstName()+" "+c.getLastName());
			}else {
				System.out.println("in else");
			}
		}
		
	}

	@Override
	public void sortByEmail()  {
		Collections.sort(customers);
		displayCustomerDetails();
		
	}

	
	

}
