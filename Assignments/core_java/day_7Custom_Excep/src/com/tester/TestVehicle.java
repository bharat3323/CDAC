package com.tester;

import static com.vechicles.validation.VehicaleRule.validation;
import java.util.Scanner;

import com.vechicles.core.Vechical;

public class TestVehicle {
	public static void main(String[] args) {
		Vechical v=new Vechical();
	try(Scanner sc=new Scanner(System.in)){
		//Scanner sc=new Scanner(System.in);
		boolean exit=false;
		while(!exit) {
			System.out.println("1.validation");
			System.out.println("2.exit");
	
		try{
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter vechicle Speed");
				v.setCar_speed(sc.nextInt());
				validation(v.getCar_speed());
				break;
			case 2:
				exit =true;
				break;
			}
				
	}catch (Exception e) {
			sc.nextLine();
			e.printStackTrace();
		}
		
		System.out.println("While loop continues....");
	}
	}//end try -with-resources so auto-close scanner sc =====>sc.close();
	System.out.println("main over...");
	
	}
	
}
