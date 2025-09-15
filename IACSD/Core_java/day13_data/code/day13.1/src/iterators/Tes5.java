package iterators;

//solve concurrent modification - Fail - Fast behavior
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Tes5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four1");
		names.add("five1");
		names.add("six");
		//display list contents in reverse manner - ListIterator
		ListIterator<String> listItr=names.listIterator(names.size());
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	//	System.out.println(listItr.previous());//no such elem exc
		System.out.println(listItr.next());
		System.out.println("main over...");
		LinkedList l1;
		
	}

}
