package com.banking.core;

public class BankAccount {
	private int acctNo;
	private double balance;

	public BankAccount(int acctNo, double balance) {
		super();
		this.acctNo = acctNo;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", balance=" + balance + "]";
	}

	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in bank acct's equals");
		if (anotherObject instanceof BankAccount) {
			return this.acctNo == ((BankAccount) anotherObject).acctNo;
		}
		return false;
	}

}
