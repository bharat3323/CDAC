package com.crk.tester;
import java.util.*;

import com.crk.service.CrkService;
import com.crk.service.CrkServiceImpl;

public class Tester {
	
	public static void main(String [] args) {
	try (Scanner sc=new Scanner(System.in)){
		boolean flag=false;
		CrkService service=new CrkServiceImpl();
		while(!flag){
			try {
				System.out.println("===========================CRICKETERS==============================");
				System.out.println("1.ACCEPTS PLAYERS");
				System.out.println("2.Modify Cricketers Rating");
				System.out.println("3.Search Cricketer by Name");
				System.out.println("4.Display all Cricketers added in collection");
				System.out.println("5.Display All Cricketers in sorted form by rating");
				System.out.println("0.Exit");
				System.out.println("Enter your choice: ");
				
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Add player!: Enter name,age,email_id,phone rating");
					service.addPlayer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
					System.out.println("Added data");
					break;
				case 2:
					System.out.println("modify cricketer rating : enter email | rating");
					service.modifyRating(sc.next(),sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Name to search");
					service.searchByname(sc.next());
					break;
				case 4:
					System.out.println("Display");
					service.displayCricketer();
					break;
				case 5:
					System.out.println("Display All Cricketers in sorted form by rating");
					service.sortByRating();
					break;
				case 0:
					flag=true;
					break;
					default:
						System.out.println("Enter valid Input!!!!");
				
				}//switch end
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}//end try-catch
			
		}//end while
		
	}//try with resourse
	}
}
