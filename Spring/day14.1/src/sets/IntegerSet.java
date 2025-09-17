package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		HashSet<Integer> intSet=new HashSet<>();
		//size=0, init capa=16, load factor=0.75
		int[] data= {10,20,2,4,56,88,99,123,-10,10,20,30};
		//populate set with array data
		for(int i : data)
		{
			System.out.println("Added "+intSet.add(i));//auto boxing
		}
		System.out.println("HS "+intSet);
		System.out.println("HS via Iterator");
		//attach Iterator to display the set
		Iterator<Integer> itr=intSet.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		//Try it out - remove all elems from the set , whose int value > 50
		System.out.println(intSet.remove(10));//t
		System.out.println(intSet.contains(10));//f
		System.out.println(intSet.remove(10));//f
		System.out.println(intSet);
		//creates fixed size list 
		/*
		 * java.util.Arrays - helper class
		 * Method -
		 * public static List<T> asList(T... elements)
		 * Creates a fixed size list from the supplied elements
		 */
		List<Integer> intList=Arrays
				.asList(11,21,299,4,56,88,99,123,-10,11,21,56);
	//	intList.add(99);remove set contains indexOf
		System.out.println(intList);
		/*
		 * Create new populated HS from this fixed size list
		 * HashSet(Collection<? extends E> collection)
		 */
		HashSet<Integer> anotherSet=new HashSet<>(intList);
		System.out.println(anotherSet);//no dups , un sorted n un ordered set
		
		
		

	}

}
