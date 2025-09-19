package com;

import java.util.List;

public interface FruitzImp {
	
	public static void displayTaste(List<? extends Mango> fruit) {
//		for(Fruits f: fruit) {
//		f.taste();
//		}
		fruit.forEach(f->f.taste()); //
		
	}
	//add-mangoes -> fruit basket---use super
	public static void add(List<? super Mango> basket,Mango...mangos) {
		for(Mango f: mangos) {
			basket.add(f);
		}
	}

}
