/**

Create a  class Point2D   for representing a point in x & y(int) co-ordinate system.
(Tight encapsulation please !)

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords


4.3 
Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
Hint - Ask yourself - 
How will you invoke it from the tester ?

4.4 
Add a non static method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

Hint - Ask yourself - 
How will you invoke it from the tester ?


4.5  Create a separate Driver(main)  class(for UI )  , "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points & store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)

*/

class Points2D{
	
	private int x;
	private int y;
	
	Points2D(int x,int y){
	this.x=x;
	this.y=y;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	boolean isEqual(int X,int Y){
		if(this.x==X && this.y==Y)
			return true;
		else
			return false;
	}
	void Show(){
		System.out.println("The x = " + this.x);
		System.out.println("The Y = " + this.y);
	}
	double calculateDistance(int x,int y){
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
	}
}