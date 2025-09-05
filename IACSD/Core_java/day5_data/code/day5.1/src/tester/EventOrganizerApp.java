/*
 * 1. Prompt user for the event capacity.
2 Create suitable data structure to hold the participant details
3 Options
1. Register Student -
i/p : student details

2. Register Faculty -
i/p : faculty details

3. Display all participant details (use  for-each)

4. Display specific participant details
i/p : seat no

5. Student Evaluation By Faculty
i/p : faculty seat no , student name , student grade (A+ , A , B+ , B , C+ , C)

6. Feedback submission By student
i/p : student seat no , faculty name, feedback comment



0. Exit

sample data 
a1 b1 2023 java 12345 77
a2 b2 2024 python 12346 77
a6 b6 20 java,python,dbt
a3 b3 2024 MERN 22345 77
a4 b4 2023 REST_WebService 14345 77
a5 b5 2022 Spring 18345 77
a7 b7 10 node

 */
package tester;

import java.util.Scanner;
import com.events.core.*;

public class EventOrganizerApp {

	public static void main(String[] args) {
		// Create scanner to wrap console i/p
		Scanner sc = new Scanner(System.in);
		// Prompt user for the event capacity.
		System.out.println("Enter event capacity");
		// Create suitable data structure to hold the participant details
		Person[] participants = new Person[sc.nextInt()];
		// System.out.println(participants.getClass());
		boolean exit = false;
		int counter = 0;
		/*
		 * hardcoding sample data
		 */
		participants[0]=new Student("a1", "b1", 2023 ,"java", 12345, 77);
		participants[1]=new Faculty("a2", "b2", 12 ,"java,dbt,react");

		while (!exit) {
			System.out.println("Options - 1.Register Student \n" + "2. Register Faculty\n" + "3. Display all details\n"
					+ "4. Display specific details\n "
					+ "5. Student Evaluation\n "
					+ "6. Submit feedback \n "
					+ "0. Exit ");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println("Enter Student Details - fn,  ln,  year,  course,  fees,  marks");
					participants[counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
							sc.nextInt());
					counter++;
					System.out.println("student registered !!!!");
				} else
					System.out.println("Event Full !!!!");
				break;
			case 2:
				if (counter < participants.length) {
					System.out.println("Enter Faculty Details - fn,  ln,  year of exp,  sme");
					participants[counter] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
					counter++;
					System.out.println("faculty registered !!!!");
				} else
					System.out.println("Event Full !!!!");
				break;
			case 3:
				for (Person p : participants) {// p=participants[0]......p=participants[participants.length-1]
					if (p != null) {
						System.out.println(p);
					}
				}
				break;
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				// {f1, s1,s2,s3,f2,f3,s4,s5 .....null....}
				if (index >= 0 && index < counter) {
					System.out.println(participants[index]);
				} else
					System.out.println("Invalid seat no !");
				break;
			// faculty seat no , student name , student grade
			case 5:
				System.out.println
				// {f1, s1,s2,s3,f2,f3,s4,s5 .....null....}
				("Enter faculty seat no , student name & grade , "
						+ "for evaluation");
				index = sc.nextInt() - 1;
				String name=sc.next();
				String grade= sc.next();
				if (index >= 0 && index < counter) {
					Person p = participants[index];
					if (p instanceof Faculty) {
						((Faculty) p).evaluateStudent(name,grade);
					} else
						System.out.println("Invalid Type !!!!");
				} else
					System.out.println("Invalid seat no !");
				break;

			// student in this seat no submit a feedback for specific 
				//faculty name with a  comment
			case 6:
				System.out.println("Enter student seat no , "
						+ "faculty name & comment ");
				index=sc.nextInt()-1;
				if(index >=0 && index < counter)
				{
					Person p=participants[index];
					if(p instanceof Student)
					{
						((Student)p).submitFeedback(sc.next(), sc.next());
					} else
						System.out.println("Invalid Type !!!!!");
				} else
					System.out.println("Invalid seat no !");
				//to read off pending i/ps from the scanner
				sc.nextLine();
				break;

			case 0:
				exit = true;
				break;

			}

		}
		sc.close();

	}

}
