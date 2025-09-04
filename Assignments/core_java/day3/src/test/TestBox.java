package test;

import java.util.*;

import day3.Box;
class TestBox{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of box: ");
		Box [] b=new Box[sc.nextInt()];
		
		for(int i=0;i<b.length;i++) {
			System.out.println("Enter the L,B,H");
			b[i]=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
	//display the box:
		for(Box boxes: b) {
			System.out.println(boxes.displayDim());
			
		}
		
		for(Box boxes: b) {
			if(boxes.getVolume()<100) {
				boxes.displayDim();
				//boxes.getVolume();
				System.out.println("Volume before len double: "+ boxes.getVolume());
				boxes.setw(2*boxes.getlen());
				System.out.println("Length is double: "+ boxes.getlen());
				boxes.getVolume();
				System.out.println("Volume after len double: "+ boxes.getVolume());
			}
		}
		
//		Box b=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		//System.out.println("Dimension of the Box are: "+ b.displayDim())
		//System.out.println("Enter the L,B,H");;
		//Box b1=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
	
		
		//Equal method
//		boolean eq =b1.isequal(b.getlen(),b.getbr(),b.geth());
//			if(eq ==true)
//				System.out.println("Boxes are Equal!!!");
//			else
//				System.out.println("Boxes are not Equal");
			
//			System.out.println("Volume First: "+ b.getVolume());
//			System.out.println("Volume Second: "+ b1.getVolume());
		
	}
}
