package com.payments;

public interface Payment {
 //date member
	 int NO_OF_DAYS=10;//public static final
	 //methods - public abstract
	 void pay(double amount);
	 void getDetails();
}
