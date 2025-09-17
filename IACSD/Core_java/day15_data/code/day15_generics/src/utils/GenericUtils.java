package utils;

import java.util.Set;

public class GenericUtils {
//1. Write a static method to print contents of ANY array - non generic (raw)
	public static void printArray(Object[] array)
	{
	//Double d=123; java error
	//	 array[0]=123; why it will throw ClassCastExcpetion in case of Double[] 
		//| Float[] | Emp[] ? why javac doesn't detect this error ?
		System.out.println("Array contents - ");
		for (Object o : array)
			System.out.println(o);
	}
	//2. Write a static method to print contents of ANY array - generic
	public static <T> void printArray2(T[] array)
	{
//		array[0]=123;
		for (T t : array)
			System.out.println(t);
	}
	//3.Write a static method to print contents of ANY Set - raw
	public static void printSet(Set<Object> set)
	{
		for(Object o : set)
			System.out.println(o);
	}
	//4.Write a static method to print contents of ANY Set - generics
		public static <T> void printSet2(Set<T> set)
		{
			for(T o : set)
				System.out.println(o);
		}

}
