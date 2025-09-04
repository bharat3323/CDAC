package day3;


public class Box{

private double length;
private double breadth;
private double heigth;

public Box(double length,double breadth,double heigth){

	this.length=length;
	this.breadth=breadth;
	this.heigth=heigth;
}
 public double getlen(){
	 
	 return length;
 }
 public double getbr(){
	 return breadth;
 }
 public double geth(){
	 return heigth;
 }
 public void setw(double w) {
	 this.length=w;
 }
 
 //checking both  obj having same values)
public  boolean isequal(double l,double b,double h){
	 if(this.length== l && this.breadth==b && this.heigth==h)
		 return true;
	 else
		 return false;
		 
 }
public String displayDim(){
	
	return" Dimension of the box(L,B,H) is: "+length+" "+breadth +" "+ heigth; 
}
public double getVolume(){
	return  this.length*this.breadth*this.heigth;
}
}