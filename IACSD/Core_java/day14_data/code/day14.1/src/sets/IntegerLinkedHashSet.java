package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class IntegerLinkedHashSet {

	public static void main(String[] args) {
		// creates fixed size list
		List<Integer> intList = Arrays
				.asList(11, 21, 299, 4, 56, 88, 99, 123, -10, 11, 21, 56);
		//create populated LinkedHashSet from above list
		/*
		 * LinkedHashSet(Collection <? extends E> collection)
		 * 
		 */
		LinkedHashSet<Integer> intSet=new LinkedHashSet<>(intList);
		System.out.println(intSet);//no dups , ordered set
				
		

	}

}
