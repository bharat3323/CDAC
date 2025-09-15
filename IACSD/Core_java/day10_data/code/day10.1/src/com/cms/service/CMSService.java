package com.cms.service;

import com.cms.custom_exceptions.CMSHandlingException;

//business logic layer (service layer) interface
public interface CMSService {
//register customer
	String registerCustomer(String firstName, String lastName, String email, String password, int regAmount, String dob,
			String plan) throws CMSHandlingException;
	void displayCustomerDetails();
}
