package exception_handling;

import java.io.FileReader;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);
				FileReader reader=new FileReader(sc.nextLine())) {
			System.out.println("Enter number");
			System.out.println("Number " + sc.nextInt());
		} //JVM - sc.close();
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
