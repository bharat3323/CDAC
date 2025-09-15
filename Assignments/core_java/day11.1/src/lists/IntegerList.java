package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntegerList {

	public static void main(String[] args) {
		// Create new empty ArrayList to store integers
		ArrayList<Integer> integerList = new ArrayList<>();// size=0, capa=10
		System.out.println("List contents - ");
		for (int i : integerList)
			System.out.println(i);
		int[] data = { 10, 1, 2, 3, 34, 13, 45, -67, 10, 2, 10 };
		// populate ArrayList with above data
		for (int i : data)
			integerList.add(i);// auto boxing
		// display ArrayList - using toString n then for-each
		System.out.println("AL via toString " + integerList);
		System.out.println("List contents via for-each ");
		for (int i : integerList)
			System.out.print(i + " ");
		// check if specified element exists
		System.out.println(integerList.contains(13));// true
		// display index of 1st n last occurrence of specified elem 10
		System.out.println(integerList.indexOf(10) + " " + integerList.lastIndexOf(10));
		// double all elements < 35
		for (int i = 0; i < integerList.size(); i++) {
			if (integerList.get(i) < 35)
				System.out.println("Replaced " + integerList.set(i, integerList.get(i) * 2));
		}
		System.out.println("List after set " + integerList);
		// remove specified elements - remove last element
		System.out.println("Removed " + integerList.remove(integerList.size() - 1));
		System.out.println("List after remove " + integerList);
		// sort the elems as per asc order
		Collections.sort(integerList);
		System.out.println("List after sort " + integerList);
		// convert it to array
		Integer[] ints=integerList.toArray(new Integer[] {});
		System.out.println("Array Contents ");
		System.out.println(Arrays.toString(ints));

	}

}
