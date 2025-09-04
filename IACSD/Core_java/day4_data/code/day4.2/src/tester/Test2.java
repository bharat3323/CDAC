package tester;

import com.events.core.Faculty;
import com.events.core.Person;
import com.events.core.Student;

public class Test2 {

	public static void main(String[] args) {
		Person ref;
		// create student n faculty
		ref = new Student("Mihir", "Patel", 2024, "Java", 12345, 76);// up casting
		System.out.println(ref.getDetails());//run time polymorphism
		ref = new Faculty("Rama", "Sen", 10, "Java , MERN DB");//up casting
		System.out.println(ref.getDetails());//run time polymorphism
	}

}
