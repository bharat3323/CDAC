package com.crk.service;

import com.crk.exception.CrkException;

public interface CrkService {

	void addPlayer(String name, int age, String email, String Phone, int rating)throws CrkException;

	void modifyRating(String email,int nextInt);

	void searchByname(String name);

	void displayCricketer();

	void sortByRating();

}
