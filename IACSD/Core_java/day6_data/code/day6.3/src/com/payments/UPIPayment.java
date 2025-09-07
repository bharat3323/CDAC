package com.payments;

public class UPIPayment implements Payment {
	private String upiId;
	private String pin;	
	public UPIPayment(String upiId, String pin) {
		super();
		this.upiId = upiId;
		this.pin = pin;
	}
	@Override
	public void pay(double amount) {
	 System.out.println("Payment done via UPI using UPI ID "+upiId);
	}

	@Override
	public void getDetails() {
		System.out.println("Using UPI ID "+upiId);
	}
	//new functionality
	public void linkBankAccount(String bankName,String acctNo)
	{
		System.out.println("Linking this UPI ID "
	+upiId+" with Bank "+bankName+" acct "+acctNo);
	}

}
