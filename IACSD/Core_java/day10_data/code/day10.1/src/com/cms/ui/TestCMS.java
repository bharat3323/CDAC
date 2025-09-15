package com.cms.ui;

import java.util.Scanner;

import com.cms.service.CMSService;
import com.cms.service.CMSServiceImpl;

public class TestCMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter max no of customers to service");
			CMSService service = new CMSServiceImpl(sc.nextInt());
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Register Customer 2.Display All 0.Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter customer details - firstName,  lastName, email,  password,  regAmount,dob,  plan");
						// invoke service layer method to exec B.L(business logic)
						System.out.println("Status " + service.registerCustomer(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.next(), sc.next()));
						break;
					case 2: System.out.println("All customer Details");
					    service.displayCustomerDetails();
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();// to read off any pending inputs from scanner
					System.out.println(e);
				}
			}

		}

	}

}
