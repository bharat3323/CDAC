package threads5;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import static utils.StudentCollectionUtils.*;

public class TestCollectioIOThreads {

	public static void main(String[] args) throws InterruptedException{
		try (Scanner sc = new Scanner(System.in)) {
			// 1 . get hard coded map from utils
			Map<String, Student> products = populateMap(populateList());
			//2. accept file names
			System.out.println("Enter file name for Dob sorted results");
			String fileName1=sc.nextLine();
			System.out.println("Enter file name for subject n gpa sorted results");
			String fileName2=sc.nextLine();
			System.out.println("Enter file name for desc  sorted gpa results");
			String fileName3=sc.nextLine();
			System.out.println("Enter name of the city");
			String city=sc.nextLine();
			//3. Create runnable task instance(map,fileName) -> attach thread & start it
			Thread t1=new Thread(new DobSorterTask(products,fileName1),"dob_sorter");
			Thread t2=new Thread(new GPASorterTask(products,fileName2),"gpa_sorter");
			Thread t3=new Thread(new DescGPASorterTask(products,fileName3,city),"gpa_desc_sorter");
			//4. start
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting for child thread to complete exec.");
			t1.join();
			t2.join();
			t3.join();
			System.out.println("main over.....");
		}

	}

}
