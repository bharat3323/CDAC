/*
Write Java program for the following - 
It should  run till user enters any other option than add or sub or multiply or divide
Prompt user to enter the input operation : (add|subtract|multiply|divide) & 2 numbers(double)
Display the result of the operation.
Use Scanner for accepting all inputs from user. 
Hint : use switch-case
*/
import java.util.*;
public class Calcu{
	
	public static void main(String[]  args){
		
		Scanner sc=new Scanner(System.in);
		
		boolean exit=true;
		do{
			
			System.out.println("------Calculator------");
				
		    System.out.println("1. add  |  2. sub  |  3. mul  |  4. Div  | 5.Exit" );
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			System.out.println("Enter two Number: ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
				
			switch(ch){
				case 1: 
			
	
			    System.out.println("Addition of two number: "+ (num1+num2));
				break; 
				
				case 2: 
			    System.out.println("Substration of two number: "+ (num1-num2));
				break;
				
				case 3: 
			    System.out.println("Multiplication of two number: "+ (num1*num2));
				break;
				
				case 4: 
				
			    System.out.println("Division of two number: "+ (num1%num2));
				break;
				
				case 5: 
				System.out.println("Inside exit");
					exit =false;
				break;
				
				default:
				System.out.println("Invalid choice!!!!!!!!!!!!!!!!");
				break;
			}
			
		}while(exit);
		
		sc.close();
		
	}
}