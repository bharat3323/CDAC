import java.util.*;

class Test{
	public static void main(String args[]){
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter two points y2 and y1: ");
			Points2D p1=new Points2D(sc.nextInt(),sc.nextInt());
		//	p.Show();
		
			System.out.println("Enter Two points x2 and y2");
			Points2D p2=new Points2D(sc.nextInt(),sc.nextInt());
			
			System.out.println("Distance between two points : "+p2.calculateDistance(p1.getX(),p1.getY()));
			
			boolean eq=p2.isEqual(p1.getX(),p1.getY());
			
			if(eq){
				System.out.println("points are Equal");
				System.out.println(" Distance with two points is: 0");
			}else{
				System.out.println("points are not Equal");
			 System.out.println("Distance between two points : "+ p2.calculateDistance(p1.getX(),p1.getY()));
			}
			
			sc.close();	
	}
}
	