package com.myscms.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	private static int idCounter;

	public Customer(String firstName, String lastName, String email, String password, int regAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.id = ++idCounter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	

	public Customer(String email) {
		super();
		this.email = email;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(int regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	
	public boolean equals (Object obj) {
		if(obj instanceof Customer) {
			Customer c=(Customer)obj;
			return this.email.equals(c.getEmail());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
	    return email.hashCode();
	}
	
	
	//for lastcase sorting
	@Override
	public int compareTo(Customer anotherCustomer)
	{
	
		return this.email.compareTo(anotherCustomer.email);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	
	
}
