/*
 * Given - 2 products are equal iff
 *  - product id  & category is same
 *  - example of composite UID 
 *  Follow mandatory as well as optional part of the contract
 */
package com.eshop.tester;

import java.util.HashSet;

import com.eshop.core.Product;

public class TestProducts {

	public static void main(String[] args) {
		Product product1 = new Product(101, "Bread", "Food", 100, 50);
		Product product2 = new Product(10, "Biscuits", "Food", 100, 50);
		Product product3 = new Product(101, "Bread", "Food", 100, 50);
		Product product4 = new Product(10, "Bread", "oil", 100, 50);
		Product product5 = new Product(101, "Rice", "Grains", 100, 50);
		// add these products to the HashSet .
		// Expected o/p - products - 1,2,4,5  should get added & 3rd  product should not get
		// added.
		HashSet<Product>product=new HashSet<>();
		System.out.println(product.add(product1));
		System.out.println(product.add(product2));
		System.out.println(product.add(product3));
		System.out.println(product.add(product4));
		System.out.println(product.add(product5));
		
		
	}

}
