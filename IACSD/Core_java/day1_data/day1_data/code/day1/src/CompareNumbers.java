import java.util.Scanner;
class CompareNumbers {
 public static void main(String[] args) 
 { //1. create scanner instance wrapping std instance
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter 2 ints , to compare");
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   if(num1 < num2)
    System.out.println(num1 +"<"+num2);
   else if (num1 == num2)
    System.out.println(num1 +"="+num2);
   else 
    System.out.println(num1 +">"+num2);
 
  sc.close();
 }
}