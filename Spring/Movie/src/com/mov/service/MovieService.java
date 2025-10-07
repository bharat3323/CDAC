package com.mov.service;

import com.mov.exception.MovieException;

public interface MovieService {

	void addMovie(int id, String name, double rating, String type, String date,boolean isincin)throws MovieException;

	void displayGrtrating();

	void removeRating();

	void sortbyDate();

	void sortByName();

	void sortbyMovieType(String type);

	void UpdateReleaseDay(int id,String date);

}
