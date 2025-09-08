package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestCheckedException2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the file to read");
		FileReader reader = new FileReader(sc.nextLine());

		System.out.println("code continues....");
		sc.close();

	}

}
