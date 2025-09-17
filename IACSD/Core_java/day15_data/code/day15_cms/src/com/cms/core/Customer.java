/*
 * 1.Customer should be assigned 
 * system generated (auto increment) 
 * customer id : int
Store - first name, last name email(string),
password(string),registrationAmount(double),
dob(LocalDate),plan(ServicePlan : enum)
2 customers can't have duplicate email.

 */
package com.cms.core;

import java.time.LocalDate;

public class Customer {
	// HAS-A association
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	// for auto increment
	private static int idCounter;

	public Customer(String firstName, String lastName, String email, String password, int regAmount, LocalDate dob,
			ServicePlan plan) {
		this.id = ++idCounter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	//toString

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+" password  "+password+" , regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	

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
		this.password = password;
	}	

}
