package com.shapes.core;

public abstract class BoundedShape {
	private int x;
	private int y;
	public BoundedShape(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	//return details
	@Override
	public String toString() {
		return "(x"+x+","+y+")";
	}
	public  abstract double computeArea();
//	{
//		return 0;
//	}
	public abstract double computePerimeter();
//	{
//		return 0;
//	}

}
