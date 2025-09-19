package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import fruits.Apple;
import fruits.Fruit;

public class GenericUtils {
/*
 * Write a static method in a non generic Utils class 
 - to display elements of any Set | List
 */
//	 public static void displayElements(Collection<?> anyCollection)
//	 {
//		 for(Object o : anyCollection)
//			 System.out.println(o);
		//List<Fruit>list=List.of(apple,mango,apple,banana);
		
		ArrayList<Apple>apples=new ArrayList<>(List.of(new Apple(),new Apple(),new Apple()));
		
	//	fruitin.displayTastesList(apples);
//		Set<Integer>hashset=new HashSet<>();
//		hashset.add(10);
		
		TreeSet<Long> longSet=new TreeSet<>();
		longSet.add(1234l);

		
		
}
	 
}
//}

