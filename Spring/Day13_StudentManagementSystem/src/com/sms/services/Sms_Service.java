package com.sms.services;

import java.util.ArrayList;

import com.sms.core.Student;
import com.sms.exception.SmsException;

public interface Sms_Service {
	
	public void AdmitStudent(String name,String email,int marks,String course) throws SmsException;
	
	public void Display();
	
	public void cancle(String email)throws SmsException;
	
	public void search(String email)throws SmsException;
	
	public ArrayList<Student> coursesearch(String course)throws SmsException;
	
}
