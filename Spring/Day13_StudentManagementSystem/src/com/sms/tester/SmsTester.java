package com.sms.tester;

import java.util.Scanner;

import com.sms.services.SmsServiceimplemention;
import com.sms.services.Sms_Service;

public class SmsTester {

	public static void main(String[] args) {
		Sms_Service service=new SmsServiceimplemention();
		boolean exit=false;
	
		try (Scanner sc=new Scanner(System.in)){
		
		
			while(!exit) {
				System.out.println("============Student Management System==============");
				System.out.println("1.Admit Student \n" +
						"2.Cancel\n"+
						"3.List all Student by Course\n"+
						"4.Display\n"+
						"5.Search student by email\n"+
						"0.exit! \n");
						
						System.out.println("Enter your Choice: ");
						int ch=sc.nextInt();
						switch(ch){
				
			case 1:
				System.out.println("PLEASE THE NAME|EMAIL|MARKS|COURSE!");
				
				service.AdmitStudent(sc.next(),sc.next(), sc.nextInt(), sc.next());
				
				System.out.println("Student enrollment done!!!!Congratulation");
				break;
				
			case 2:
				System.out.println("Enter the email for closing account: ");
				service.cancle(sc.next());
				break;
				
			case 3:
				System.out.println("Enter the Course: ");
				System.out.println(service.coursesearch(sc.next()));
				break;
			case 4:
				System.out.println("=================Student details============");
				service.Display();
				break;
			case 5:
				System.out.println("Enter the mail to search: ");
				service.search(sc.next());	
				
			case 0:
				exit=true;
				break;
			}
			}
		}catch(Exception e){
			System.out.println(e);
	}

	}
	}
