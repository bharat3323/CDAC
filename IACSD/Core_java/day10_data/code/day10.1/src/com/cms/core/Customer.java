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
	//add overloaded ctor to wrap only - UID (email)
	public Customer(String email) {
		this.email=email;
	}
	//toString

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	//override equals to replace ref equality by content equality
	//- based upon email
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in customer equals ");
		if(o instanceof Customer)
		{
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}

	public String getEmail() {
		return email;
	}
	

}
