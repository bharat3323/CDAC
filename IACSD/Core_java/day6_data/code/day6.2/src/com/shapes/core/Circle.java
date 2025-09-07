package com.shapes.core;
import static  java.lang.Math.PI;
public class Circle extends BoundedShape {
	private double radius;
   public Circle(int x,int y,double radius) {
	   super(x,y);
	   this.radius=radius;
   }
   //compute area
   @Override
   public double computeArea() {
	   return PI*radius*radius;
   }
   //compute perimeter
   @Override
   public double computePerimeter() {
	   return 2*PI*radius;
   }
   //override toString
   @Override
   public String toString() {
	   return "Circle : "+super.toString()+" radius "+this.radius;
   }
}
