package tester;

import static utils.GenericUtils.*;

public class Test1 {

	public static void main(String[] args) {
		// write a test case to test array of ints - {10,20,30,40,50}
		// try it with int[] - javac error ! why ???
//
		Integer[] ints = { 10, 20, 30, 40, 50 };// auto boxing
		printArray(ints);
		// Object[] is super type of Integer[] | Double [] | Emp[]
		// write a test case to test array of doubles - {10,20,30,40,50}
		// why we had to add 10.0 in place of 10 ?
		Double[] doubles = { 10.0, 20.1, 30.4, 40.67, 50.78 };
	printArray(doubles);
		String[] strings = { "aa", "bb", "adgdf" };
		printArray(strings);
		// why Object[] is not recommended & T[] - a generic array is more recommended ?
	}

}
