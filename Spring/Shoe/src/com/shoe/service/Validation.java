package com.shoe.service;

import java.util.Map;

import com.shoe.Exception.ShoeException;
import com.shoe.core.Shoe;
import com.shoe.core.Shoe_type;

public class Validation {
	public static void  ValidationInput(String name, String brand, int rating, double price, boolean availableIngallary,
			String shoetype,Map<Integer,Shoe>c) throws ShoeException{
		CheckRating(rating);
		CheckName(name);
		CheckShoeType(shoetype);
		
	}

	private static void CheckName(String name)throws ShoeException {
		if(name.length()<3 || name.length()>20) {
			throw new ShoeException("please Enter name Again");
		}
		
	}

	private static void CheckRating(int rating)throws ShoeException {
		if(rating<1 || rating >10) {
			throw new ShoeException("please Enter rating between 1-10"); 
		}
		
	}
	
	private static void CheckShoeType(String shoetype) {
		try {
		Shoe_type s=Shoe_type.valueOf(shoetype.toUpperCase());
		for(Shoe_type o: Shoe_type.values()) {
			if(s==o) {
				return;
			}
		}
		}catch(Exception e) {
			System.out.println("Not present in enum");
			
		}
		
	}
	

}
