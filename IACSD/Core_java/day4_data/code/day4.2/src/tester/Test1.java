package tester;

import com.events.core.*;

public class Test1 {

	public static void main(String[] args) {
		// create student n faculty
		Student s1=new Student("Mihir", "Patel", 2024,"Java", 12345,76);
		Faculty f1=new Faculty("Rama", "Sen",10, "Java , MERN DB");		
		System.out.println(s1.getDetails());
		System.out.println(f1.getDetails());
	}

}
