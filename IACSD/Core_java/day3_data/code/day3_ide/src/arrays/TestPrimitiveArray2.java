package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestPrimitiveArray2 {

	public static void main(String[] args) {
		// 1. create scanner instance
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.getClass());//prints Fully qualified class name
		System.out.println("Enter array size to hold doubles");

		double[] data=new double[sc.nextInt()];
		
		System.out.println(data.getClass()); // [D
		//display array contents - for each loop
		System.out.println("default array contents ");
		for(double d : data)//d=data[0]....d=data[data.length-1]
			System.out.print(d+" ");
		System.out.println();
		//init array - from user supplied values
		for(int i=0;i<data.length;i++)
		
		{
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		
		for(double d1 : data) {
			d1 *= 5;
		}
		System.out.println("inited array contents");
//		for(double d1 : data)
//			System.out.print(d1+" ");
		System.out.println(Arrays.toString(data));
		
		sc.close();

	}

}
