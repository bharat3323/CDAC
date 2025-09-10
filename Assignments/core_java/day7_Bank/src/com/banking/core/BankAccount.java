package com.banking.core;

import com.Exception.InsufficianttBalanceException;

public class BankAccount {

	private int accountNumber;
	private String customerName;
	private double balance;
	private String phoneNumber;

	// Auto Account Number Generator
	// this can be done in class only not in main
	// shared counter for all accounts
	// private static int accNumGenerator;
	//
	// static {
	// accNumGenerator = 1001; //initialize once when the class is loaded
	// }

	// Parametarised constructor
	public BankAccount(int accountNumber, String customerName, double balance, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
	}

	// Common deposit function for SavingAccount and CurrentAccount
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("-----Deposit Successful!!-----");
		System.out.println("Updated Balance: " + balance);
		System.out.println();
	}

	public void withdraw(double amount) throws InsufficianttBalanceException {
		System.out.println("In bank Account Withdraw");
	}

	public double balance() {
		System.out.println("In BankAccount balance");
		return balance;
	}

	public String toString() {
		return this.accountNumber + " | " + this.customerName + " | "
				+ this.balance + " | " + this.phoneNumber;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//Equals method of object
	public boolean equals(Object anotheAccount) {
		if (anotheAccount instanceof BankAccount) {
			return this.accountNumber == ((BankAccount) anotheAccount).accountNumber;
		}
		return false;

	}

}
