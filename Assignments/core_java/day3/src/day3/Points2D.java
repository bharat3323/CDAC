package day3;

public class Points2D{
	
	private int x;
	private int y;
	
	public Points2D(int x,int y){
	this.x=x;
	this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
public	boolean isEqual(int X,int Y){
		if(this.x==X && this.y==Y)
			return true;
		else
			return false;
	}
	public String Show(){

		return "The X is: "+this.x +" The Y is : "+ this.y;
		//		System.out.println("The x = " + this.x);
//		System.out.println("The Y = " + this.y);
	}
	public double calculateDistance(int x,int y){
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
	}
}
