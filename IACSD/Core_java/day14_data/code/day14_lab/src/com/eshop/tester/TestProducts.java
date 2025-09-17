/*
 * Given - 2 products are equal iff
 *  - product id  is same.
 *  Follow mandatory as well as optional part of the contract
 */
package com.eshop.tester;

import com.eshop.core.Product;

public class TestProducts {

	public static void main(String[] args) {
		Product product1 = new Product(101, "Bread", "Food", 100, 50);
		Product product2 = new Product(10, "Biscuits", "Food", 100, 50);
		Product product3 = new Product(50, "Bread", "Food", 100, 50);
		Product product4 = new Product(49, "Bread", "Food", 100, 50);
		Product product5 = new Product(10, "Rice", "Grains", 100, 50);
		// add these products to the HashSet .
		// Expected o/p - products - 1-4 should get added & 5th product should not get
		// added.

	}

}
