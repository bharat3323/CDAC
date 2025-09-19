package Tester;

import static com.app.core.Subject.DBT;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.REACT;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.StudentCollectionUtils.*;

public class tester1 {

	public static void main(String args[]) {
		Map<String,Student>studentmap=populateMap(populateList());
//		System.out.println("All student----");
//		studentmap.forEach((k,v)->System.out.println(v));
//		
//		System.out.println("Specified student by subject");
//		
//		Subject subject=Subject.JAVA;
//		studentmap.values()//steam<Student>
//		.stream() //stream<Student>
//		.filter(p-> p.getSubject()==subject)
//		.forEach(p->System.out.println(p));
		
		System.out.println("Print sum of  marks of students of all students"
				+ " from the specified state\r\n"
				+ "i/p : name of the state");
//		String rollno="dac-001";
//		studentmap.values()
//		.stream()
//		.filter(r->r.getRollNo().equals(rollno))
//		.forEach(s->System.out.println(s));
		
//		String state="MH";
//		double sumbystate=studentmap.values()
//		.stream()//stream<Student>
//		.filter(p->p.getAddress().getState().equals(state))//filterstream
//		.mapToDouble(s->s.getGpa())//doublestram
//		.sum();
//		System.out.println(sumbystate);
		
		//Print name of specified subject  topper
//		i/p : subject name


//		System.out.println("=====Name subject topper====");
//		Subject sub=Subject.JAVA;
//		Optional<Student>topper=studentmap.values()
//		.stream()
//		.filter(s->s.getSubject().equals(sub))
//		//.mapToDouble(s->s.getGpa())
//		//creates a Comparator<Student> that compares students based on their GPA.
//		.max(Comparator.comparingDouble(Student->Student.getGpa())); 
//		
//		if(topper.isPresent()) {
//			System.out.println("Topeer: "+topper.get().getName() +" "+ topper.get().getGpa());
//		}else {
//			System.out.println("no student found");
//		}
		
		/*
		 * .4 Print number  of  failures for the specified subject chosen  from user.
i/p : subject name
(failure is GPA < 5.0 , out of 1-10)

		 */
//		System.out.println("fail for specific subject");
//		double gpa=4.0;
//		studentmap.values()
//		.stream()
//		.filter(m->m.getGpa()<gpa)
//		.forEach(s->System.out.println("failed student :" +s));
		
		
		/*
		 * 5 Display names of students enrolled in a specified subject , securing marks > specified marks
i/p : subject name , marks

		 */
		
		
		System.out.println("display name: ");
		Subject sub=Subject.JAVA;
		double gpa = 3;

		studentmap.values()
		    .stream()
		    .filter(m -> m.getSubject().equals(sub) && m.getGpa() > gpa)
		    .forEach(m -> System.out.println(m.getName() + " "+ m.getSubject())
		    		);
		
		//3.6 Suppose a particular subject faculty is unavailable for few days. 
		//So you have to infor the students of specified subjec. 
		//Collect the specified subject students into the list n display it.
		//i/p : subject name
		List<Student>al=new ArrayList<>();
		Subject sub2=Subject.JAVA;
		al=
		studentmap.values()
		.stream()
		.filter(a->a.getSubject().equals(sub2))
		.collect(Collectors.toList());
		
//		/*
//		 * 3.7 Display  student details for specified subject , sorted as per DoB
//		 */
		System.out.println("Sorted!!!!!!by date");
		Subject sub3=Subject.DBT;
		Comparator<Student> com=(s1,s2)->s1.getDob().compareTo(s2.getDob());
		studentmap.values()
		.stream()
		.filter(s->s.getSubject().equals(sub3))
		.sorted(com)
		.forEach(a->System.out.println(a));
		
/*
 * 3.8 Find any student with GPA above 8
(Should run as short circuit operation, meaning the moment you come 
across any student with GPA > 8 , 
the streams should stop iterating & return the result immediately)		
 */
	Optional <Student> s=
		studentmap.values()
		.stream()
		.filter(g-> g.getGpa()>8)
		.findFirst();
	
	System.out.println(s);
	

//3.9 Print names of home cities (no dups please !) of all Students 

   studentmap.values()
    .stream()
    .map(h->h.getAddress().getCity())
    .distinct()
    .forEach(a->System.out.println(a));
}
}










