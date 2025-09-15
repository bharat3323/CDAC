package com.sms.core;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	 private int id;
	private String name;
	private String email;
	private int marks;
	private Course course;
	private LocalDate admissionDate;
	
	static int idGenerator;
	
	//auto-generator
	static {
		 idGenerator=101;
	}
	
	


	//default constructor
	public Student() {
		super();

	}
	// close-->
	public Student(String email) {
		this.email=email;
	}
	//param constructor

	public Student(String name, String email, int marks, Course course) {
		super();
		this.id = idGenerator++;
		
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course=course;
		
		this.admissionDate = LocalDate.now();
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return this.email.equals(s.email);
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", marks=" + marks + ", courses=" + course + ", course="
				+ course + ", admissionDate=" + admissionDate + "]";
	}
	
	
	
	
	
}
