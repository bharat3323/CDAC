/*
 * Accept product manufacture date from user
Accept no of days - in which product expires
Print product expiry date.

 */
package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Test1 {

	public static void main(String... args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter product manufacture date - yr-mon-day");
			LocalDate manuDate=LocalDate.parse(sc.next());		
			System.out.println("Enter no of days");
			LocalDate expDate=manuDate.plusDays(sc.nextInt());
			System.out.println(manuDate);//yr-mon-day
			System.out.println(expDate);
			//print local time
			System.out.println(LocalTime.now());
			//print local date time
			System.out.println(LocalDateTime.now());
			
		}

	}

}
