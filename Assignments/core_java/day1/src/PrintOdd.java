import java.util.Scanner;

public class PrintOdd{
	
	public static void main(String[] args){
		
		//create scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------Show Odd Numbers-------");
		System.out.println("Enter start and end to show Odd numbers in between: ");
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start; i<= end; i++)
		{
			if(i%2 != 0)
				System.out.print(i +" | ");
		}
		
		System.out.print(" ");
		
		sc.close();
	}




}