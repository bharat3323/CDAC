package com.sms.services;

import java.util.ArrayList;
import java.util.List;

import com.sms.core.Course;
import com.sms.core.Student;
import com.sms.exception.SmsException;
import static com.sms.services.Smsvalidations.*;

public class SmsServiceimplemention implements Sms_Service{
List<Student> student; //= new ArrayList<>();
	
	
	public SmsServiceimplemention() {
		super();
		this.student = new ArrayList<>(10);
		
		student.add(new Student("surya", "surya@gmail.com", 60, Course.MERN));
		student.add(new Student("bharat", "bharat@gmail.com", 60, Course.MERN));
		student.add(new Student("raju", "raju@gmail.com", 60, Course.CORE_JAVA));
		student.add(new Student("shyam", "shyam@gmail.com", 60, Course.DBT));
			
	}
	@Override
	public void AdmitStudent(String name,String email,int marks,String course) throws SmsException {

		marksValidation(course,marks);
		emailValidate(email);
		seat(course);
		
		Student obj=new Student(name,email,marks,Course.valueOf(course.toUpperCase()));
		
		student.add(obj);
		
	}
	@Override
	public void Display() {
		for(Student std:student) {
			System.out.print(std);
		}
		
	}
	@Override
	public void cancle(String email) throws SmsException {
	int index=student.indexOf(new Student(email));
	if(index==-1) {
		throw new SmsException("Invalide mail!!!!!");
	}
	Student stud=student.get(index);
	student.remove(stud);
		
	}
	//search by mail
	@Override
	public void search(String email) throws SmsException{
		int index=student.indexOf(new Student(email));
		if(index==-1) {
			throw new SmsException("Invalide mail!!!!");
		}
		Student stud=student.get(index);
		System.out.println(stud);
	}

	//search by course---->in for each loop we can use == instead of equals ----enum constant
	@Override
	public ArrayList<Student> coursesearch(String course) throws SmsException {
		
		Course newcourse=Course.valueOf(course.toUpperCase());
		
		ArrayList <Student> std=new ArrayList<>();
		boolean flag=false;
		
		for(Student s:student) {
			if(s.getCourse().equals(newcourse)) {
			std.add(s);
			flag=true;
		}
		}
		if(!flag) {
			throw new SmsException("No Student currently enroll in course "+newcourse);
		}
		return std;
		
	}
	

}