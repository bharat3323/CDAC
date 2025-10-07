package com.crk.service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.crk.core.Cricketer;
import com.crk.exception.CrkException;

public class CrkServiceImpl implements CrkService {
	Map<String,Cricketer>map=new HashMap<>();

	@Override
	public void addPlayer(String name, int age, String email, String Phone, int rating) throws CrkException {
		
		if(name.isEmpty()) {
			throw new CrkException("Name is blank");
		}
		if(Phone.length()!=10) {
			throw new CrkException("Number length must be 10");
		}
		if(rating<1 || rating>10) {
			throw new CrkException("Rating must be be between 1-10");
		}
		Cricketer c=new Cricketer(name,age,email,Phone,rating);
		map.put(email,c);
		System.out.println(c);
	
	}

	@Override
	public void modifyRating(String email,int rating) {
		for(Cricketer c: map.values()) {
			c.setRating(rating);
		}
		
	}

	@Override
	public void searchByname(String name) {
		for(Cricketer c: map.values()) {
			if(c.getName().equals(name)) {
				System.out.println(c);
			}
		}
		
	}

	@Override
	public void displayCricketer() {
		for(Cricketer c: map.values())
		{
			System.out.println(c);
			}
		}

	@Override
	public void sortByRating() {
		Comparator<Cricketer>com=(o1,o2)->((Integer)o1.getRating()).compareTo(o2.getRating());
				map.values()
				.stream()
				.sorted(com)
				.forEach(a->System.out.println(a));
		
	}

}
