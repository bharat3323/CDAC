import java.util.*;
class TestBox{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the L,B,H");
		
		Box b=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
		//System.out.println("Volume: "+ b.getVolume());
		//System.out.println("Dimension of the Box are: "+ b.displayDim())
		System.out.println("Enter the L,B,H");;
		Box b1=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		boolean eq =b1.isequal(b.getlen(),b.getbr(),b.geth());
			if(eq ==true)
				System.out.println("Boxes are Equal!!!");
			else
				System.out.println("Boxes are not Equal");
		
	}
}