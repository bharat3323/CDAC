package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestCheckedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter name of the file to read");
			FileReader reader = new FileReader(sc.nextLine());
			System.out.println("end of try....");
		} catch (FileNotFoundException e) {
			System.out.println("1");
		}
		System.out.println("code continues....");
		sc.close();

	}

}
