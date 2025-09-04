import java.util.Scanner;
class PrintOddNumbers {
public static void main(String[] args)
 {
   //1. create scanneranner
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter begin & end values");
   int start=scanner.nextInt();
    int end=scanner.nextInt();
	 for(int i=start;i<=end;i++)
	 {
	   if(i % 2 != 0)
	    System.out.print(i+" ");
	 }
   scanner.close();
 }
}