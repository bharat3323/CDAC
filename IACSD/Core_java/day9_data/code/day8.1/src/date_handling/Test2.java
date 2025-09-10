/*
 * Accept DoB of employee from user, store it in Date class instance
 * 
 *  Display the same.
 * 
 */
package date_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) /* throws ParseException */{
		try (Scanner sc=new Scanner(System.in)) {
			//1. create SDF instance
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Enter Emp's DoB , yr-mon-day ");
			Date dob=sdf.parse(sc.next());
			System.out.println(dob);//Date's toString
			System.out.println("Formatted dob "+sdf.format(dob));
		} //JVM - sc.close()
		 catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
