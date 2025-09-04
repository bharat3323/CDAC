import java.util.Scanner;


public class Div2Double{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 double numbers : ");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("The Division of "+num1+" "+num2+" is: "+(num1/num2));
		
		sc.close();
	}


}