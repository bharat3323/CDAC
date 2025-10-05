package com.myscms.tester;

import java.util.Scanner;

import com.myscms.core.Customer;

import services.CmsService;
import services.cmsServiceImpl;

public class Tester {
	public static void main(String [] args) {
		
		//interface----->impl class
		
		
		try (Scanner sc=new Scanner(System.in)){
			CmsService service=new cmsServiceImpl();
			boolean exit=false;
			while(!exit) {
				System.out.println("1.Register Customer");
				System.out.println("2.Display");
				System.out.println("3.Sign In");
				System.out.println("4.Change Password");
				System.out.println("5.Unsubscibe Customer");
				System.out.println("6.Search By Plan And DOB");
				System.out.println("7.Sort Customer as per email");
				System.out.println("0.Exit");
				System.out.println("Choose option");

			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter The Customer Details-firstName,lastName,email,password,reqAmount,dob,plan");
							System.out.println(service.registerCustomer(
									sc.next(),sc.next(),sc.next(),sc.next(),
									sc.nextInt(),sc.next(),sc.next()));
					break;
				case 2:
					System.out.println("All Customer details");
					service.displayCustomerDetails();
					break;
					
				case 3:
					System.out.println("Enter Email And Password ");
					service.signIn(sc.next(),sc.next());
					System.out.println("SignIn Successfully!!!!!");
					break;
				case 4:
					System.out.println("Enter email,old password & new password");
					service.resetPass(sc.next(), sc.next(), sc.next());
					break;
				case 5:
						System.out.println("Enter Email : ");
						service.unsuscribe(sc.next());
						System.out.println("User deleted!!!");
					break;
				case 6:
					System.out.println("Enter Service plan and date");
					service.searchByplanAndDate(sc.next(),sc.next());
					break;
				case 7:
					System.out.println("Enter the mail: ");
					service.sortByEmail();
					break;
				case 0:
					exit=true;
					break;
			
				}
				
			}catch(Exception e) {
				sc.nextLine(); //to read pending inputs from scanner
				System.out.println(e);
			}
			
		}
	}
	}
}
