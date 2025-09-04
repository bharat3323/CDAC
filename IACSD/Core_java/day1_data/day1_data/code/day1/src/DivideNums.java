import java.util.Scanner;

class DivideNums
{
 public static void main(String[] args) {
  //1. Create Scanner class instance , wrapping std input stream (cin)
   Scanner sc=new Scanner(System.in);//std in 
   System.out.println("Enter 2 double nums");
   //2. use methods of Scanner
   double num1=sc.nextDouble();
   double num2=sc.nextDouble();
   System.out.println("Div result"+(num1/num2));
   //3 .close scanner
   sc.close();
  
  
 }
}