package exception_handling;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc= new Scanner(System.in);
			System.out.println("Enter number");
			System.out.println("Number " + sc.nextInt());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("in finally - closing the scanner");
			sc.close();
		}

	}

}
