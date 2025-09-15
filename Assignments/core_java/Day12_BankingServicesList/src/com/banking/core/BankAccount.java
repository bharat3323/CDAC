package com.banking.core;

import java.time.LocalDate;

import com.exceptions.BankingExceptions;

public class BankAccount {

	private int accountNumber;
	private String customerName;
	private double balance;
	private String phoneNumber;
	private AccountType accType;
	private LocalDate creationDate;

	static int accNumGenerate;

	// Auto Account Number Generator
	// this can be done in class only not in main
	// shared counter for all accounts
	// private static int accNumGenerator;

	static {
		accNumGenerate = 1001; // initialize once when the class is loaded
	}

	public BankAccount() {

	}

	// Parametarised constructor
	public BankAccount(String customerName, double balance, String phoneNumber,
			AccountType accType, LocalDate creationDate) {
		this.accountNumber = accNumGenerate++;
		this.customerName = customerName;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.accType = accType;
		this.creationDate = creationDate;
	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	// Common deposit function for SavingAccount and CurrentAccount
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("-----Deposit Successful!!-----");
		System.out.println("Updated Balance: " + balance);
		System.out.println();
	}

	public void withdraw(double amount) throws BankingExceptions {
		if (amount <= 0) {
			throw new BankingExceptions(("Invalid withdrwal amount"));
		}
		if (balance < amount) {
			throw new BankingExceptions(("insufficiant balance"));
		}
		balance -= amount;
		System.out.println("withdrwa successfull update " + balance);
	}

	public double balance() {
		System.out.println("In BankAccount balance");
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", balance=" + balance
				+ ", phoneNumber=" + phoneNumber + ", accType=" + accType
				+ ", creationDate=" + creationDate + "]";
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

	// Equals method of object
	public boolean equals(Object anotheAccount) {
		if (anotheAccount instanceof BankAccount) {
			return this.accountNumber == ((BankAccount) anotheAccount).accountNumber;
		}
		return false;

	}

}
