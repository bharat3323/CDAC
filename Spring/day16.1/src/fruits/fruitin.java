package fruits;

import java.util.List;
import java.util.Set;

public interface fruitin {

	public static void displayTastesList(List<? extends Fruit> basket) {
		basket.forEach(f -> f.taste());
	}
	
	
	public static double sumOfNumbers(Set<? extends Number> number) {
	
		double sum=0;
		for(Number n: number)
			sum+=n.doubleValue();
		return sum;
	}
	
//	
//	static void  addmangoes(List<? super Mango> basket,Mango)
	
}
