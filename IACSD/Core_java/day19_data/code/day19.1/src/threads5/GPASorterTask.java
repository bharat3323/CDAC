package threads5;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;

import com.app.core.Student;

public class GPASorterTask implements Runnable {
	// state
	private Map<String, Student> map;
	private String fileName;

	public GPASorterTask(Map<String, Student> map, String fileName) {
		super();
		this.map = map;
		this.fileName = fileName;
		System.out.println("in ctor of " + getClass() + " invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		/*
		 * Sort the student details as per subject  n gpa  n save the sorted results (on separate lines) in the 2nd text file 
		 */
		Comparator<Student> subjectAndGPAComparator = (s1, s2) -> {
			//subject
			int result=s1.getSubject().compareTo(s2.getSubject());
			if(result ==0)
			{
				return ((Double)s1.getGpa()).compareTo(s2.getGpa());
			}
			return result;
		};
		try (// Java app --> PW --> FW --> text file
				PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			map.values() // Collection<Student>
					.stream() // Stream<Student>
					.sorted(subjectAndGPAComparator)
					.forEach(s -> pw.println(s));
		} catch (Exception e) {
			System.out.println("err in thread " + Thread.currentThread().getName() + " exc " + e);
		}//pw.close-> pw.flush -> fw.close

		System.out.println(Thread.currentThread().getName() + " over");

	}

}
