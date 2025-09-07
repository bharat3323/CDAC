package com.shapes.core;

public class BoundedShape {
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

}
