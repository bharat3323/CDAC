package com.cms.services;

import com.cms.core.Customer;
import com.cms.exception.CmsException;

public interface Cmsservices {

	Customer registerCustomer(String firstname,String lastname,String email,String password,int regAmount,
			String dob,String plan)throws CmsException ;

	void displayCustomer()throws CmsException;

	Customer signUp(String email, String password)throws CmsException;

	String changePassword(String email, String oldpass, String newpass)throws CmsException;

	String unsubscribe(String email)throws CmsException;

	void searchByPlanAndDate(String date, String plan)throws CmsException;
	

}
