package threads5;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;

import com.app.core.Student;

public class DobSorterTask implements Runnable {
	// state
	private Map<String, Student> map;
	private String fileName;

	public DobSorterTask(Map<String, Student> map, String fileName) {
		super();
		this.map = map;
		this.fileName = fileName;
		System.out.println("in ctor of " + getClass() + " invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		/*
		 * Sort the students details as per birth date n save the sorted results (on
		 * SEPARATE lines) in the 1st text file
		 */
		Comparator<Student> dobComparator = (s1, s2) -> s1.getDob().compareTo(s2.getDob());
		try (// Java app --> PW --> FW --> text file
				PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			map.values() // Collection<Student>
					.stream() // Stream<Student>
					.sorted(dobComparator)
					.forEach(s -> pw.println(s));
		} catch (Exception e) {
			System.out.println("err in thread " + Thread.currentThread().getName() + " exc " + e);
		}//pw.close-> pw.flush -> fw.close

		System.out.println(Thread.currentThread().getName() + " over");

	}

}
