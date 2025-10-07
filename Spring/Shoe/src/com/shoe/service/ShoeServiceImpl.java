package com.shoe.service;
import java.util.ArrayList;
import java.util.Comparator;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.shoe.Exception.ShoeException;
import com.shoe.core.Shoe;
import com.shoe.core.Shoe_type;
import static com.shoe.service.Validation.ValidationInput;

public class ShoeServiceImpl implements ShoeService {
	
	Map<Integer,Shoe>ShoeMap=new HashMap<>();

	@Override
	public void addShoe(String name, String brand, int rating, double price, boolean availableIngallary,
			String shoetype) throws ShoeException{
		ValidationInput(name,brand,rating,price,availableIngallary,shoetype,ShoeMap);
			Shoe o=new Shoe(name,brand,rating,price,availableIngallary,Shoe_type.valueOf(shoetype.toUpperCase()));
		ShoeMap.put(o.getShoe_id(),o );
		System.out.println("Added succesfully");
		System.out.println(o);
			
		
	}

	@Override
	public void DisplayAll() {
		for(Shoe s:ShoeMap.values()) {
			System.out.println(s);
		}
		
	}
	/*
	 * public void DisplayAll() {
		Shoemap.values()
		.stream()
		.forEach(p->System.out.println(p));
	}
	 */

	@Override
	public void shoeSorted() throws ShoeException {
	TreeMap<Integer,Shoe>tm=new TreeMap<>(ShoeMap);
//	for(Shoe s: tm.values()) {
//		System.out.println(tm);
//	}
	
	tm.values()
	.stream()
	.forEach(c->System.out.println(c));
		
		
	}

	@Override
	public void searchExpensive()throws ShoeException{
		if(ShoeMap.isEmpty()) {
			throw new ShoeException("No shoes available");
			
		}
		Shoe expensive=null;
		double maxprice=Double.MIN_VALUE;
		for(Shoe s: ShoeMap.values()) {
			if(s.getPrice()>maxprice) {
				maxprice=s.getPrice();
				expensive=s;
			}
		}
		System.out.println("Most expensive shoe: "+expensive);
		
	}

	@Override
	public void updatePriceOnBrand(String brand, double newprice) {
		ShoeMap.values()
		.stream()
		.filter(p->p.getBrand().equals(brand))
		.peek(s->s.setPrice(newprice))
		.forEach(m->System.out.println(m));
		
	}

	@Override
	public void RemoveShoeNotInGallary() {
		
//		List<Shoe>list=new ArrayList<>();
//		
//		for(Shoe s: ShoeMap.values()) {
//			if(s.isAvailableIngallary()) {
//				list.add(s);
//			}
//		}
//		for(Shoe t: list) {
//			System.out.println(t);
//		}
//		for(Shoe s: ShoeMap.values()) {
//			if(s.isAvailableIngallary()==false) {
//				ShoeMap.remove(s.getShoe_id());
//			}
//		}
		ShoeMap.values()
		.removeIf(p->p.isAvailableIngallary()==false);
		
	}

	@Override
	public void SortOrderByDes() {
		Comparator<Shoe>com=(o1,o2)->((Double)o2.getPrice()).compareTo(o1.getPrice());
		ShoeMap.values()
		.stream()
		.sorted(com)
		.forEach(a->System.out.println(a));
		
	}

	

}
