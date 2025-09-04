package arrays;

import java.util.Scanner;
import com.cdac.core.Box;

/*
 * Ask user(client) , how many boxes to make ?
Accept Box dimensions.
Store these details suitably.
Display box details n volume using for-each loop

 */

public class TestBoxArrays {

	public static void main(String[] args) {
		// 1 . scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		Box[] boxes = new Box[sc.nextInt()];// 1 array object
		System.out.println("Default array contents");
//		for(Box b : boxes)
//			System.out.println(b);//[null,null,.....null]
		for (int i = 0; i < boxes.length; i++) {
			System.out.println("Enter w d h");
			boxes[i] = 
					new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		for (Box b : boxes)
			System.out.println(b);
		System.out.println("Box dims and volume - for each loop");
		for (Box b : boxes)//b=boxes[0],.....b=boxes[boxes.length-1]
		{
			System.out.println(b.getBoxDimensions());
			System.out.println("Volume "+b.getVolume());
		}
		sc.close();

	}

}
