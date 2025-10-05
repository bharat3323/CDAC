package com.shoe.service;

import com.shoe.Exception.ShoeException;
import com.shoe.core.Shoe;
import com.shoe.core.Shoe_type;

public interface ShoeService {

	void addShoe(String name, String brand, int rating, double price, boolean avaulableIngallary,
			String shoetype)throws ShoeException;

	void DisplayAll();

	void shoeSorted()throws ShoeException;

	void searchExpensive()throws ShoeException;

	

}
