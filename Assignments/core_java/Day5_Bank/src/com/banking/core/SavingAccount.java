package com.banking.core;

public class SavingAccount extends BankAccount {

	private double interestRate=0.12;

	public SavingAccount(int accountNumber, double balance, String customerName, String phoneNumber) {
		super(accountNumber, balance, customerName, phoneNumber);
	}

//	public void deposit(double amount) {
//		balance=balance+amount;
//		System.out.println("Deposit Successful!!");
//		System.out.println("Updated Balance: "+balance);
//	}
	
//	public double withdraw(Double d) {
//		
//		return  getBalance()-d; 
//	}
	//check

	public double applyInterest() {
		
		return getBalance()*0.12+getBalance();
	}
	
	public String toString() {
		return getAccountNumber() + " | " + getCustomerName()+" | "+getBalance()+" | "+getPhoneNumber() + "| amt with interst =" + applyInterest() ;
	}

}


