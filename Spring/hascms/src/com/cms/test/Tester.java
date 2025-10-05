package com.cms.test;

import java.util.Scanner;

import com.cms.core.Customer;
import com.cms.services.Cmsservices;
import com.cms.services.Cmsservicesimpl;

public class Tester {
	
	public static void main(String [] args) {
		
		try (Scanner sc=new Scanner(System.in)){
			Cmsservices service=new Cmsservicesimpl();
			
			boolean exit=false;
			while(!exit){
				System.out.println("1.Register Customer");
				System.out.println("2.Display All Customer");
				System.out.println("3.Sign In");
				System.out.println("4.Change Password");
				System.out.println("5.unsubscibe customer");
				System.out.println("6.search by plan and dob");
				System.out.println("7.sort customer as per email");
				System.out.println("8.sort customer as per reg amount");
				System.out.println("9.sort customer as per dob  and reg amount");
				System.out.println("0.Exit");
				System.out.println("Choose option");
			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter Customer Details: Fistname,lastname,email,password,regAmount,dob,plan");
					System.out.println(service.registerCustomer(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next().toUpperCase()));
					break;
				case 2:
					System.out.println("All Cuastomers");
					service.displayCustomer();
					break;
				case 3:
					System.out.println("Enter Email and Password");
					Customer customer=service.signUp(sc.next(),sc.next());
					System.out.println("Login successful,hello "+customer.getFirstName());
					break;
				case 4:
					System.out.println("Enter email and old password new password");
					service.changePassword(sc.next(),sc.next(),sc.next());
					break;
				case 5:
					System.out.println("Enter email");
					service.unsubscribe(sc.next());
					break;
				case 6:
					System.out.println("Enter Service  date | plan");
					service.searchByPlanAndDate(sc.next(),sc.next());
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				default:
				
				System.out.println("Please Enter valid choice!!");
				
				}
			}
			catch(Exception e) {
				System.out.println(e);
			
		}
		}
	}
	}

}
