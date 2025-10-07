package com.shoe.tester;

import java.util.Scanner;

import com.shoe.Exception.ShoeException;
import com.shoe.service.ShoeService;
import com.shoe.service.ShoeServiceImpl;

public class Test {
	public static void main(String [] args) throws ShoeException {
		
		try(Scanner sc=new Scanner(System.in)) {
			ShoeService service=new ShoeServiceImpl();
//			service.addShoe("bharat", "puma",6, 1000, false, "Formal");
//			service.addShoe("rock", "puma",10, 2000, true, "Formal");
//			service.addShoe("abhi", "duma",8, 1060, false, "casual");
//			service.addShoe("yash", "uma",6, 1000, true, "Formal");
			
			
			boolean flag=false;
			while(!flag) {
				try {
					System.out.println("1.Add Shoe");
					System.out.println("2.Display all the shoe");
					System.out.println("3.Display all shoe details sorted by Shoeid");
					System.out.println("4.Search Shoe that which is most expensive");
					System.out.println("5.Update shoe price base on brand");
					System.out.println("6.Sort shoe as per price in desc order");
					System.out.println("7.Remove shoe that are not availabe in the Gallary");
					System.out.println("8.exit");
					System.out.print("Enter your choice: ");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Add store: enter name,brand,rating,price,availableingallary(t|f),shoe_type(FORMAL,CASUAL,SPORTS)) ");
				 service.addShoe(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextBoolean(),sc.next());
				 
						break;
					case 2:
						System.out.println("Display all the shoe: ");
						service.DisplayAll();
						break;
					case 3:
						System.out.println("Display all the shoe details sorted by shoeid");
						service.shoeSorted();
						break;
					case 4:
						System.out.println("Search shoe that which is most expensic=ve");
						service.searchExpensive();
						break;
					case 5:
						System.out.println("Update shoe price base on brand enter brand and new price");
						service.updatePriceOnBrand(sc.next(),sc.nextDouble());
						break;
					case 6:
						System.out.println("Sort shoe as per price in desc order");
						service.SortOrderByDes();
						
						break;
					case 7:
						System.out.println("Remove shoe that are not availabe in the Gallary");
						service.RemoveShoeNotInGallary();
						break;
					case 8:
						flag=true;
						break;
						default:
							System.out.println("Enter valid input!!!");
							break;
							
					
					}
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			
		}
	}

}
