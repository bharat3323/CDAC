package iterators;
//solve concurrent modification - Fail - Fast behavior
import java.util.ArrayList;
import java.util.Iterator;

public class Tes4 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four1");
		names.add("five1");
		names.add("six");
		//remove all the strings from the list with length > 3 - use Iterator
		Iterator<String> stringItr=names.iterator();
		while(stringItr.hasNext())
		{
			if(stringItr.next().length()>3)
				stringItr.remove();
		}
		
		//print the list again
		System.out.println("List after remove : "+names);
		System.out.println("main over....");
		

	}

}
