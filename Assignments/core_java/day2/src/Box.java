
public class Box{

private double length;
private double breadth;
private double heigth;

Box(double length,double breadth,double heigth){

	this.length=length;
	this.breadth=breadth;
	this.heigth=heigth;
}
 double getlen(){
	 
	 return length;
 }
 double getbr(){
	 return breadth;
 }
 double geth(){
	 return heigth;
 }
 
 //checking both  obj having same values)
 boolean isequal(double l,double b,double h){
	 if(this.length== l && this.breadth==b && this.heigth==h)
		 return true;
	 else
		 return false;
		 
 }
String displayDim(){
	
	return" Dimension of the box is: "+length+" "+breadth +" "+ heigth; 
}
double getVolume(){
	return  this.length*this.breadth*this.heigth;
}
}