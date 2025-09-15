package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Tes2 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four");
		names.add("five");
		names.add("six");
		//1. Use Iterator to display List contents - in forward manner
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			//itr.remove();
			System.out.println(itr.next());
			itr.remove();
		//	itr.remove();
		}
		System.out.println("List : "+names);
		System.out.println("main over....");
		

	}

}
