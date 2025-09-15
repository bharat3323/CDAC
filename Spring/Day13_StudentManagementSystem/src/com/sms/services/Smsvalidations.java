package com.sms.services;

import com.sms.core.Course;
import com.sms.exception.SmsException;

public class Smsvalidations {

	//public static final int MIN_MARKS=35;
	
	public static void marksValidation(String course,int marks) throws SmsException {
		
	Course c=Course.valueOf(course.toUpperCase());
	
	System.out.println("In Marks Validation");
	
	if(marks <= c.getMinmarks()) 
		throw new SmsException("Not eligible for course!!!! qualify the course min marks");
	
	}
	
	public static void emailValidate (String email) throws SmsException {
		String exp="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		System.out.println("In email Validation");
		
		if(!email.matches(exp)) 
			throw new SmsException("please Email valid mail id!!!");
		
	}
	public static void seat(String course)throws SmsException {
		Course obj=Course.valueOf(course.toUpperCase());
	
		if(obj.getMax_seat()!=0 ) {
			obj.setMax_seat(obj.getMax_seat()-1);
		}else {
			throw new SmsException("Seat are fulled for this  course!!! ");
		}
		
		
	}
}
