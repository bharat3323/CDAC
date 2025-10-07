package com.shoe.core;

public class Shoe {
	private int shoe_id;
	private String name;
	private String brand;
	private int rating;
	private double price;
	private boolean availableIngallary;
	private Shoe_type shoe_type;
	
	public static int autoid;
	public Shoe(String name, String brand,int rating, double price, boolean availableIngallary, Shoe_type shoe_type) {
		super();
		this.shoe_id=++autoid;
		this.name = name;
		this.brand=brand;
		this.rating = rating;
		this.price = price;
		this.availableIngallary = availableIngallary;
		this.shoe_type = shoe_type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getShoe_id() {
		return shoe_id;
	}
	public void setShoe_id(int shoe_id) {
		this.shoe_id = shoe_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailableIngallary() {
		return availableIngallary;
	}
	public void setAvailableIngallary(boolean availableIngallary) {
		this.availableIngallary = availableIngallary;
	}
	public Shoe_type getShoe_type() {
		return shoe_type;
	}
	public void setShoe_type(Shoe_type shoe_type) {
		this.shoe_type = shoe_type;
	}
	@Override
	public String toString() {
		return "Shoe [shoe_id=" + shoe_id + ", name=" + name + ", brand=" + brand + ", rating=" + rating + ", price="
				+ price + ", availableIngallary=" + availableIngallary + ", shoe_type=" + shoe_type + "]";
	}
	
	
	
	

}
