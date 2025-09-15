package com.banking.core;

public class BankAccount {
	private String accountNumber;
	private double balance;
	//BankAccount 1  ---- * Transaction
	private Transaction[] transactions;// later to be replaced by Collection
	private int counter;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = new Transaction[20];
	}
	//outer class methods
	public void withdraw(double amount) {
		Transaction t = new Transaction("WITHDRAW", amount);
		t.process();
		transactions[counter++] = t; // store transaction details
	}

	public void deposit(double amount) {
		Transaction t = new Transaction("DEPOSIT", amount);
		t.process();
		transactions[counter++] = t; // store transaction details
	}

	public Transaction[] getTransactions() {
		return transactions;
	}

	// Inner class has complete access to outer class state
	public class Transaction {
		private String type;
		private double amount;
		//private LocalDateTime timeStamp;

		public Transaction(String type, double amount) {
			this.type = type;
			this.amount = amount;
			//timeStamp=LocalDateTime().now();
		}

		public void process() {
			if ("DEPOSIT".equals(type)) {
				balance += amount; // direct access to BankAccount.balance
			} else if ("WITHDRAW".equals(type) && balance >= amount) {
				balance -= amount;
			}
			System.out.println("Transaction complete. New balance = " + balance);
		}

		@Override
		public String toString() {
			return "Transaction [type=" + type + ", amount=" + amount + "]";
		}
		
	}
}
