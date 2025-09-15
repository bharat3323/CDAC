package com.cms.service;

import java.time.LocalDate;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.CMSHandlingException;

/*
 * no dup customers 
(i.e if the customer tries to register using existing email
 , raise custom exception)


 */
public class CMSValidations {
//add a single method to validate all inputs
	public static Customer validateAllInputs(String firstName, 
			String lastName, String email, String password,
			int regAmount, String dob, String plan, 
			Customer[] customers) throws CMSHandlingException {
		checkForDuplicate(email, customers);
		return new Customer(firstName, lastName, email, 
				password, regAmount,
				LocalDate.parse(dob) ,ServicePlan.valueOf(plan));
	}

	// add a static method to check for dup
	public static void checkForDuplicate(String email, Customer[] custs) throws CMSHandlingException {
		 //create customer object to hold only supplied email
		Customer newCust=new Customer(email);
		for (Customer c : custs)
			if (c != null) {
				if (c.equals(newCust)) {
					throw new CMSHandlingException("Email is dup !!!!!!");
				}
			}
	}
}
