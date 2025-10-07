package com.mov.test;

import java.util.Scanner;

import com.mov.service.MovieService;
import com.mov.service.MovieServiceImp;

public class Test {
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			MovieService service=new MovieServiceImp();
			boolean flag=false;
			while(!flag) {
				try {
					System.out.println("===========================Movie Management System================================");
					System.out.println("1.Add new Movie");
					System.out.println("2.Display all movies with rating >5");
					System.out.println("3.Remove all movies with rating <3.5");
					System.out.println("4.Sort and display movies by release date");
					System.out.println("5.sort and display movie by name(des)");
					System.out.println("6.search and display movie by Movie by type");
					System.out.println("7.update release date ofa movie using its Id");
					System.out.println("8.Exit the apllication");
					
					System.out.println("Enter your choice: ");
					
					switch(sc.nextInt()) {	
					case 1:
						System.out.println("Enter id,name,rating,Movietype(bollywood,hollywood,tollywood),Releasedate,incinemas(t/f)");
						service.addMovie(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.nextBoolean());
						
						break;
					case 2:
						System.out.println("Display");
						service.displayGrtrating();
						break;
					case 3:
						System.out.println("Remove ");
						service.removeRating();
						break;
					case 4:
						System.out.println("Sort and display movie by release date");
						service.sortbyDate();
						break;
					case 5:
						System.out.println("Sort display movies bt name desc");
						service.sortByName();
						break;
					case 6:
						System.out.println("search and display movie by Movie by type enter Movie type");
						service.sortbyMovieType(sc.next());
						break;
					case 7:
						System.out.println("update release date of a movie using its Id enter id and date");
						service.UpdateReleaseDay(sc.nextInt(),sc.next());
						break;
					case 8:
						flag=false;
						break;
						default:
							System.out.println("Enter valid input!!!!");
							
							break;
					
					}
					
					
				}catch(Exception e) {
					sc.nextLine();
					System.out.println(e);
				}//end of try-catch
				
			}//end while
			
		}//try with resourse
	}

}
