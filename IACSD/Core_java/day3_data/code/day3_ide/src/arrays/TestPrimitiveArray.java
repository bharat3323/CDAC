package arrays;

import java.util.Scanner;

public class TestPrimitiveArray {

	public static void main(String[] args) {
		// 1. create scanner instance
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.getClass());//prints Fully qualified class name
		System.out.println("Enter array size to hold doubles");
		// array type ref
//		double[] data;// no objs yet !
//		data = new double[sc.nextInt()];// array class is loaded , 
//		//array obj ,its ref is assigned
		double[] data=new double[sc.nextInt()];
		//display array contents - for loop
		System.out.println(data.getClass()); // [D
		System.out.println("default array contents ");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println();
		//init array - from user supplied values
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		
		System.out.println("inited array contents");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		
		sc.close();

	}

}
