/*
 Objective 9: Write java application to accept int(emp id) , double(salary) , emp's first name(string) , is permanent :  boolean from Scanner & display the same using printf

*/
import java.util.Scanner;
class PrintEmpDetails {
public static void main(String[] args)
 {
	// int data;
	// System.out.println(data);//javac error !!!!
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter emp id , salary , name , permanent status");
   System.out.printf("Emp ID %d Salary %.2f Name %s Is Permanent %b %n",sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextBoolean());
  sc.close();
 }
}