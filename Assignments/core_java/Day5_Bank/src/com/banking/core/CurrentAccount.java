package com.banking.core;

public class CurrentAccount extends BankAccount {

	private final double overdraftLimit = 10000.0;

	public CurrentAccount(int accountNumber, double balance, String customerName, String phoneNumber) {
		super(accountNumber, balance, customerName, phoneNumber);
	}

	public double withdraw(double amount) {
	    double newBalance = getBalance() - amount; 

	    if (newBalance >= -overdraftLimit) {  
	        setBalance(newBalance);
	        System.out.println("Withdrawn: " + amount);
	        System.out.println("Remaining Balance: " + getBalance());
	        return getBalance();
	    } else {
	        System.out.println("Withdrawal denied! Overdraft limit exceeded.");
	        return getBalance();
	    }
	}




	
	public String toString() {
		return getAccountNumber() + " | " + getCustomerName()+" | "+getBalance()+" | "+getPhoneNumber();
		}
}
