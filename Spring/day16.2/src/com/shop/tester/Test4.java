package com.shop.tester;

import static com.shop.utils.ShopUtils.*;

import java.util.ArrayList;
import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

	public class Test4 {

		
		public static void main(String[] args) {
			
			// get populated Map of products
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
		
			// solve - display entries from the map.
		//	productMap.forEach((pid, product) -> System.out.println("Key " + pid + " Value " + product));
			
			//display the map entries>>>
			productMap.forEach((k,v)->System.out.println(v));
			Category category =Category.BISCUITS;
			///productMap.values().removeIf(p -> p.getproductCategory()==category)
			
			//remove all product from Category Biscuits....
			//display map again
		}

	}
