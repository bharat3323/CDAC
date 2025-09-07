package com.payments;

public class CreditCardPayment implements Payment {
	private String cardNumber;
	private String expDate;
	private String cvv;
	private double dailyLimit;

	public CreditCardPayment(String cardNumber, String expDate, String cvv, double dailyLimit) {
		//super();
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvv = cvv;
		this.dailyLimit = dailyLimit;
	}

	// implement abstract methods
	@Override
	public void pay(double amount) {
		System.out.println("Payment done using Credit Card Numer "+cardNumber+" amount "
	+amount+" no of days "+NO_OF_DAYS);
	}
	@Override
	public void getDetails() {
		System.out.println("Credit card expires on "+expDate);
	}
	//new functionality
	public void setDailyLimit(double newLimit)
	{
		this.dailyLimit=newLimit;
	}

}
