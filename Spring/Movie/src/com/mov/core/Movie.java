package com.mov.core;

import java.time.LocalDate;

public class Movie {
	private int id;
	private String name;
	private double rating;
	private MovieType type;
	private LocalDate Realse_date;
	private boolean incinemas;
	public Movie(int id, String name, double rating, MovieType type, LocalDate realse_date, boolean incinemas) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.type = type;
		Realse_date = realse_date;
		this.incinemas = incinemas;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public MovieType getType() {
		return type;
	}
	public void setType(MovieType type) {
		this.type = type;
	}
	public LocalDate getRealse_date() {
		return Realse_date;
	}
	public void setRealse_date(LocalDate realse_date) {
		Realse_date = realse_date;
	}
	public boolean isIncinemas() {
		return incinemas;
	}
	public void setIncinemas(boolean incinemas) {
		this.incinemas = incinemas;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", type=" + type + ", Realse_date="
				+ Realse_date + ", incinemas=" + incinemas + "]";
	}
	
	
}
