package com.mov.service;

import static com.mov.service.Validation.ValidationCheck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mov.core.Movie;
import com.mov.core.MovieType;
import com.mov.exception.MovieException;

public class MovieServiceImp implements MovieService {
	Map<Integer,Movie>map=new HashMap<>();

	@Override
	public void addMovie(int id, String name, double rating, String type, String date, boolean isincin)
			throws MovieException {
	Movie o=ValidationCheck(id,name,rating,type,date,isincin,map);
	map.put(id, o);
	System.out.println("added!!!");
	

		
	}

	@Override
	public void displayGrtrating() {
		for(Movie m:map.values()) {
			if(m.getRating()>5) {
				System.out.println(m);
			}
		}
		
	}

	@Override
	public void removeRating() {
		List<Movie>list=new ArrayList<>();
		for(Movie m: map.values()) {
			if(m.getRating()>=3.5) {
				list.add(m);
			}
		}
		for(Movie m:list) {
			System.out.println(m);
		}
		
	}

	@Override
	public void sortbyDate() {
		Comparator<Movie>com=(o1,o2)->(o1.getRealse_date()).compareTo(o2.getRealse_date());
		map.values()
		.stream()
		.sorted(com)
		.forEach(p->System.out.println(p));
	}

	@Override
	public void sortByName() {
		Comparator<Movie>com=(o1,o2)->(o2.getName().compareTo(o1.getName()));
	map.values()
	.stream()
	.sorted(com)
	.forEach(c->System.out.println(c));
	}

	@Override
	public void sortbyMovieType(String movie) {
		for(Movie m: map.values()) {
			if(m.getType().equals(MovieType.valueOf(movie.toUpperCase()))) {
				System.out.println(m);
			}
		}
	}

	@Override
	public void UpdateReleaseDay(int id,String date) {
//		for(Movie e: map.values()) {
//			if()
//		}
		map.values()
		.stream()
		.filter(a->a.getId()==id)
		.peek(a->a.setRealse_date(LocalDate.parse(date)))
		.forEach(a->System.out.println(a));
	}

	

}
