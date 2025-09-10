/*
 * Create an enum to store fixed set of colors – RED,GREEN,BLUE
Write a tester – Display available colors
Accept (scanner) a color from user , 
convert it to enum n display using toString

 */
package enums;

import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Available Colors");
			for (Color c : Color.values())
				System.out.println(c);//toString : Enum(super class)
			System.out.println("Choose a color");
			Color chosenColor=Color.valueOf(sc.next().toUpperCase());
			System.out.println("You chose - "+chosenColor+" position "+chosenColor.ordinal());
		}

	}

}
