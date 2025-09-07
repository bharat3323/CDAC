package com.shapes.core;

public class Rectangle extends BoundedShape {
	private double length;
	private double breadth;
	public Rectangle(int x, int y, double length, double breadth) {
		super(x, y);
		this.length = length;
		this.breadth = breadth;
	}
	//toString
	@Override
	public String toString() {
		return "Rectangle "+super.toString() 
		+" length=" + length + ", breadth=" + breadth ;
	}
	//compute area & perimeter
	@Override
	public double computeArea() {
		return length*breadth;
	}
	@Override
	public double computePerimeter() {
		return 2*(length+breadth);
	}
	

}
