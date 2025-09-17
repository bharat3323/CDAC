package com.eshop.core;

public class Product {
	private int id;
	private String name;
	private String category;
	private int stock;
	private double price;

	public Product(int id, String name, String category, 
			int stock, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.stock = stock;
		this.price = price;
	}

	
@Override
	public int hashCode() {
	System.out.println("in product hashcode");
		//return 10;
	return id;
	}

@Override
public boolean equals(Object obj) {
	System.out.println("in product equal");
	if(obj instanceof Product) {
		Product p=(Product)obj;
		return this.id==p.id;
	}
	return false;
}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", stock=" + stock + ", price="
				+ price + "]";
	}

}
