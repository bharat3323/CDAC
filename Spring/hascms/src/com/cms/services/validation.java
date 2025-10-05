package com.cms.services;

import java.time.LocalDate;
import java.util.Map;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.exception.CmsException;

public class validation {

	public static Customer ValidateAllInput(String firstname, String lastname, String email, String password, int regAmount,
			String dob, String plan,Map<String,Customer>customers)throws CmsException {
		
		CheckDupEmail(email,customers);
		return new Customer(firstname,lastname,email,password,regAmount,LocalDate.parse(dob),ServicePlan.valueOf(plan));
		
	}
	public static void CheckDupEmail(String email,Map<String,Customer>map)
			throws CmsException {
		
		if(map.containsKey(email)) {
			throw new CmsException("Duplicate email found");
		}
	}
	
	
}
