package com.cms.service;

import java.time.LocalDate;
import java.util.Map;

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
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			int regAmount, String dob, String plan,
			Map<String,Customer> customers) 
					throws CMSHandlingException {
		validateEmail(email);
		checkForDuplicate(email, customers);
		ServicePlan validPlan = parseAndValidatePlanAndAmount(plan, regAmount);
		return new Customer(firstName, lastName, email, 
				password, regAmount, LocalDate.parse(dob),
				validPlan);
	}

	// add a static method to check for dup , customer 's email
	public static void checkForDuplicate(String email, 
			Map<String,Customer> map) throws CMSHandlingException {
		 if(map.containsKey(email)) {	
			throw new CMSHandlingException("Email is dup !!!!!!");
		}

	}

	// add a static method to check if the email is well formed
	public static void validateEmail(String email) throws CMSHandlingException {
		String emailRegEx = "^[a-z][a-z0-9._-]*@[a-z]+\\.(com|org|net)$";
		if (!email.matches(emailRegEx))
			throw new CMSHandlingException("Invalid Email Format!!!!");
	}

	// add a static methd to validate a plan & reg amount
	public static ServicePlan parseAndValidatePlanAndAmount
	(String plan, int regAmount) throws IllegalArgumentException
	,CMSHandlingException{
		// parse string -> enum
		ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());
		// => parsing successful , now check if reg amount is correct or not 
		if (servicePlan.getPlanCost() != regAmount)
			throw new CMSHandlingException("Reg amount doesn't match with the plan cost!!!!!!");
		return servicePlan;
	}

}
