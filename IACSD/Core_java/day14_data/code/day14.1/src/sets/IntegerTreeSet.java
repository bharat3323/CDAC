package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class IntegerTreeSet {

	public static void main(String[] args) {
		// creates fixed size list
		List<Integer> intList = Arrays.asList(11, 21, 299, 4, 56, 88, 99, 123, -10, 11, 21, 56);
		// create populated TreeSet from above list
		/*
		 * TreeSet(Collection <? extends E> collection)
		 * 
		 */
		TreeSet<Integer> intSet = new TreeSet<>(intList);
		/*
		 * JVM - Integer's compareTo - Comparable
		 * 
		 */
		System.out.println(intSet);// asc order
		// Solve - print TreeSet contents in desc order
		System.out.println("TS displayed in desc order - ");
		Iterator<Integer> itr = intSet.descendingIterator();
		while (itr.hasNext())
			System.out.print(itr.next()+" ");

	}

}
