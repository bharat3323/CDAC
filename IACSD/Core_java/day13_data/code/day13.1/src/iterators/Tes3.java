package iterators;
//revise n understand concurrent modification - Fail - Fast behavior
import java.util.ArrayList;
import java.util.Iterator;

public class Tes3 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four1");
		names.add("five1");
		names.add("six1");
		//remove all the strings from the list with length > 3 - use for-each
		for (String s : names)
		{
			if(s.length()> 3)
			{
				names.remove(s);
			}
		}
		//print the list again
		System.out.println("List after remove : "+names);
		System.out.println("main over....");
		

	}

}
