package threads5;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;

import com.app.core.Student;

public class DescGPASorterTask implements Runnable {
	// state
	private Map<String, Student> map;
	private String fileName;
	private String city;

	public DescGPASorterTask(Map<String, Student> map, String fileName,String city) {
		super();
		this.map = map;
		this.fileName = fileName;
		this.city=city;
		System.out.println("in ctor of " + getClass() + " invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		/*
		 * Store the roll no , name n gpa of all the students , from the specified city , sorted in desc order of GPA n save it in the 3rd text file
		 */
		Comparator<Student> gpaComparator = (s1, s2) -> ((Double)s2.getGpa()).compareTo(s1.getGpa());
		try (// Java app --> PW --> FW --> text file
				PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			map.values() // Collection<Student>
					.stream() // Stream<Student>
					.filter(s -> s.getAddress().getCity().equals(city))
					.sorted(gpaComparator)
					.forEach(s -> pw.println(s.getRollNo()+" "+s.getName()+" "+s.getGpa()));
		} catch (Exception e) {
			System.out.println("err in thread " + Thread.currentThread().getName() + " exc " + e);
		}//pw.close-> pw.flush -> fw.close

		System.out.println(Thread.currentThread().getName() + " over");

	}

}
