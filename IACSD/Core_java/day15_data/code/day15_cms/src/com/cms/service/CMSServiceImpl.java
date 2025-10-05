package com.cms.service;

import static com.cms.service.CMSValidations.validateAllInputs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cms.comparators.CustomerRegAmountComparator;
import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.CMSHandlingException;

public class CMSServiceImpl implements CMSService {
	private Map<String, Customer> customerMap;

	public CMSServiceImpl() {
		customerMap = new HashMap<>(1024);
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000, LocalDate.of(1990, 5, 12),
				ServicePlan.SILVER));
		customers.add(new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000, LocalDate.of(1995, 8, 23),
				ServicePlan.GOLD));
		customers.add(new Customer("Rahul", "Patil", "rahul@yahoo.com", "rahul@123", 5000, LocalDate.of(1990, 5, 12),
				ServicePlan.DIAMOND));
		customers.add(new Customer("Sneha", "Kulkarni", "sneha@gmail.com", "sneha@123", 10000,
				LocalDate.of(1992, 11, 17), ServicePlan.PLATINUM));
		customers.add(new Customer("Vikas", "Rao", "vikas@gmail.com", "vikas@123", 2000, LocalDate.of(1990, 5, 12),
				ServicePlan.GOLD));
		customers.add(new Customer("Meera", "Joshi", "meera@gmail.com", "meera@123", 1000, LocalDate.of(2000, 2, 14),
				ServicePlan.SILVER));
		customers.add(new Customer("Arjun", "Deshmukh", "arjun@gmail.com", "arjun@123", 5000, LocalDate.of(1985, 9, 5),
				ServicePlan.DIAMOND));
		customers.add(new Customer("Kavya", "Iyer", "kavya@gmail.com", "kavya@123", 10000, LocalDate.of(1990, 5, 12),
				ServicePlan.PLATINUM));
		/*
		 * copy all customer details from list -> map
		 */
		for (Customer c : customers) {
			System.out.println("added " + customerMap.putIfAbsent(c.getEmail(), c));
		}
		// System.out.println("Populated customer map " + customerMap);

	}

	@Override
	public String registerCustomer(String firstName, String lastName, String email, String password, int regAmount,
			String dob, String plan) throws CMSHandlingException {
		// invoke method of ValidationRules - to validate all i/ps
		Customer c = validateAllInputs(firstName, lastName, email, password, regAmount, dob, plan, customerMap);
		customerMap.put(c.getEmail(), c);
		return "Registration successful !";
	}

	@Override
	public void displayCustomerDetails() {
		for (Customer c : customerMap.values())
			System.out.println(c);
	}

	@Override
	public Customer signIn(String email, String password) throws CMSHandlingException {
		// create dummy customer instance to wrap UID
		// Customer c = new Customer(email);
		// // indexOf
		// int index = customers.indexOf(c);
		// if (index == -1) // => invalid email
		// throw new CMSHandlingException("Invalid Email !!!!");
		// // => email found ,get customer details from list
		// Customer completeDetails = customers.get(index);
		// if (!completeDetails.getPassword().equals(password))
		// throw new CMSHandlingException("Invalid Password !!!!");
		// // => successful login
		// return completeDetails;
		Customer c = customerMap.get(email);
		if (c == null)
			throw new CMSHandlingException("Invalid Email !!!!");
		if (!c.getPassword().equals(password))
			throw new CMSHandlingException("Invalid Password !!!!");
		return c;
	}

	@Override
	public String changePassword(String email, String oldPassword, String newPass) throws CMSHandlingException {
		Customer validCustomer = signIn(email, oldPassword);
		// => login successful
		validCustomer.setPassword(newPass);
		return "Password updated !";
	}

	@Override
	public String unsubscribeCustomer(String email) throws CMSHandlingException {
		/*
		 * Ask yourself - delete - delete by PK - YES -> remove(key) - no -> other
		 * options...to be discussed later....
		 */
		if (customerMap.remove(email) != null)
			return "Customer un subscribed!";
		throw new CMSHandlingException("Un Subscription Failed - email doesn't exist!!!!!");
	}

	@Override
	public void searchByPlanAndDate(String plan, String date) {
		ServicePlan myPlan = ServicePlan.valueOf(plan);
		LocalDate dob = LocalDate.parse(date);// yyyy-MM-dd
		for (Customer c : customerMap.values()) {
			if (c.getPlan().equals(myPlan) && c.getDob().isAfter(dob)) {
				System.out.println(c.getFirstName() + " " + c.getLastName());
			}
		}

	}

	@Override
	public void sortCustomersByEmail() {
		// Collections.sort(customers);
		/*
		 * sorting criteria - key based | value based - key based -> Map can be used for
		 * the sorting -> JVM will internally calls - String(Key)'s compareTo
		 */
		TreeMap<String, Customer> sortedMap = new TreeMap<>(customerMap);
		System.out.println("Customer Details sorted as per email -");
		for (Customer c : sortedMap.values()) {
			System.out.println(c);
		}

	}

	@Override
	public void sortCustomersByRegAmount() {
		// sort customers - method of Collections class
		// public static void sort(List<T> list, Comparator<T> comparator)
		// Collections.sort(customers, new CustomerRegAmountComparator());
		System.out.println("TO DO - Not yet implemented !!!!!");
	}

	@Override
	public void sortCustomersByDobAndRegAmount() {
		// Solving using anonymous inner class
		// Collections.sort(customers, new Comparator<Customer>() { // class begins
		// @Override
		// public int compare(Customer c1, Customer c2) {
		// System.out.println("in ano inner class - compare");
		// int ret = c1.getDob().compareTo(c2.getDob());
		// if (ret == 0) {
		// // => dobs are same , compare reg amount
		// return ((Integer) c2.getRegAmount()).compareTo(c1.getRegAmount());
		// }
		// return ret;
		// }
		// }// class ends
		// );// java statement over
		// // new Comparator<Customer>
		// // -> instance of class which implements Comparator
		//
		System.out.println("TO DO - Not yet implemented !!!!!");

	}

}
