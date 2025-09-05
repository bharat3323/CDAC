package com.banking.core;

public class CurrentAccount extends BankAccount {

	private final double overdraftLimit = -10000.0;

	public CurrentAccount(int accountNumber, double balance, String customerName, String phoneNumber) {
		super(accountNumber, balance, customerName, phoneNumber);
	}

	public void withdraw() {
		//use overdraft facility
		System.out.println("In CurrentAccount withdraw");
	}

	public String toString() {
		return getAccountNumber() + " | " + getCustomerName()+" | "+getBalance()+" | "+getPhoneNumber();
		}
}
