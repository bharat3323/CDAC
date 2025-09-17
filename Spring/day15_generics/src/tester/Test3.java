package tester;

import java.util.Arrays;
import java.util.TreeSet;
import static utils.GenericUtils.*;

public class Test3 {

	public static void main(String[] args) {
		// TreeSet<Integer> , : 10,2 ,23,45,4,56,-10
		TreeSet<Integer> ts=
				new TreeSet<>
		(Arrays.asList(10,2 ,23,45,4,56,-10));	
		ts.add(9);
	//	printSet(ts);//understand javac error - to confirm invaraint nature of collections
	
		//HashSet<Double>, LinkedHashSet<String>

	}

}
