package com.shapes.tester;

import com.shapes.core.*;

public class TestShapes {

	public static void main(String[] args) {
		// create array of shapes , iterate over an array
		// to print details , area n
		// perimeter
		// dynamic init of array
		// int[] ints=/*new int[]*/ {10,20,30,40,50};
	//	BoundedShape myShape=new BoundedShape();//javac error
		BoundedShape[] shapes = { new Circle(20, 30, 15.6), new Rectangle(10, 50, 12.4, 10.78) };
		for (BoundedShape shape : shapes) {
			System.out.println(shape);// 1st iteration - circle's toString , 2nd : rect's toString
			System.out.println("Area "+shape.computeArea());
			System.out.println("Perimeter "+shape.computePerimeter());
		}

	}

}
