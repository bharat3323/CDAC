package com.mov.service;

import java.time.LocalDate;
import java.util.Map;

import com.mov.core.Movie;
import com.mov.core.MovieType;
import com.mov.exception.MovieException;

public class Validation {
	
	public static Movie ValidationCheck(int id, String name, double rating, String type, String date, boolean isincin,Map<Integer,Movie>map)throws MovieException {
		duplicateName(name,map);
		//validEnum(type);
		validate(date);
		return new Movie(id,name,rating,MovieType.valueOf(type.toUpperCase()),LocalDate.parse(date),isincin);
		
		
	}

	private static void validate(String date) throws MovieException{
			
		LocalDate t=LocalDate.parse(date);
		if(t.isAfter(LocalDate.now())) {
			throw new MovieException("Invalid date");
		}
	}

	private static void validEnum(String type)throws MovieException {
		try {
		MovieType.valueOf(type.toUpperCase());
		
		}catch(IllegalArgumentException e) {
			throw new MovieException("Not Valid enum value");
		}
		
	}

	private static void duplicateName(String name,Map<Integer,Movie>map)throws MovieException{
	
			for(Movie s: map.values()) {
				if(s.getName().equalsIgnoreCase(name))
									
				throw new MovieException("Duplicate name found");

			}
	}

}
