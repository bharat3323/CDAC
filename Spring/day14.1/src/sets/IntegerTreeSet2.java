package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class IntegerTreeSet2 {

	public static void main(String[] args) {
		// creates fixed size list
		List<Integer> intList = Arrays.asList(11, 21, 299, 4, 56, 88, 99, 123, -10, 11, 21, 56);
		// create populated TreeSet(Comparator<E> comp)
		// containing above integers , stored in desc manner.
		TreeSet<Integer> intSet = new TreeSet<>
		(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("in ano innner class - compare");
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(intSet);//[]
		intSet.addAll(intList);
		System.out.println(intSet);

	}

}
