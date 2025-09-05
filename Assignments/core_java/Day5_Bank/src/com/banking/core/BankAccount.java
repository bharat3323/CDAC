package com.banking.core;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String phoneNumber;

	public BankAccount(int accountNumber, double balance, String customerName, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double amount) {
		if(amount>0) {
		balance=balance+amount;
		System.out.println("Deposit Successful!!");
		System.out.println("Updated Balance: "+balance);
		}else {
			System.out.println("Enter the correct amount!!!!");
		}
	}

	public double withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdraw successful");
		return balance;
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

}
