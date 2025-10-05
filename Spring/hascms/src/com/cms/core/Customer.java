package com.cms.core;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String firstName;
	private  String lastName;
	private String email;
	private String password;
	private int regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	
	//static variable
	private static int idCounter;
	
	
	//para const
	public Customer(String firstName, String lastName,String email,
			String password,int regAmount,LocalDate dob,
			ServicePlan plan) {
		
				this.id=++idCounter;
				this.firstName=firstName;
				this.lastName=lastName;
				this.email=email;
				this.password=password;
				this.regAmount=regAmount;
				this.dob=dob;
				this.plan=plan;
	
						}
	//toString
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	//getter and setter 
	
	public String getEmail() {
		return email;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public int getRegAmount() {
		return regAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	
	

}
