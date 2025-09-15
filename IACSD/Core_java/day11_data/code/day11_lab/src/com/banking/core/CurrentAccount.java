package com.banking.core;

import java.time.LocalDate;

import com.banking.custom_exceptions.BankingException;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;	

	public CurrentAccount(int accountNumber, double balance, String customerName, String phoneNumber,
			AccountType acType, LocalDate dob, double overdraftLimit) {
		super(accountNumber, balance, customerName, phoneNumber, acType, dob);
		this.overdraftLimit = overdraftLimit;
	}

	// Override withdraw to allow overdraft
	@Override
	public void withdraw(double amount) throws BankingException {
		double currentBalance = getBalance();
		if (amount <= currentBalance) {
			setBalance(currentBalance - amount);
			System.out.println("CurrentAccount withdrawn " + amount + ". New getBalance() = " + getBalance());
			return;
		}
		if (amount <= getBalance() + overdraftLimit) {
			double overdraftUsed = amount - getBalance();
			overdraftLimit -= overdraftUsed;// reduce limit
			setBalance(0);
			System.out.println("CurrentAccount withdrawn " + amount + ". New getBalance() = " + getBalance());
			System.out.println(
					"CurrentAccount used overdraft of " + overdraftUsed + ". Remaining overdraft = " + overdraftLimit);
			return;
		}
		throw new BankingException("Withdraw Failed - CurrentAccount: Overdraft limit exceeded!");

	}

    // CurrentAccount specific  method
    public void increaseOverdraftLimit(double amount) {
        overdraftLimit += amount;
        System.out.println("Overdraft limit increased by " + amount +
                           ". New overdraft = " + overdraftLimit);
    }

	@Override
	public String toString() {
		return "CurrentAccount "+super.toString()+" [overdraftLimit=" + overdraftLimit + "]";
	}
    
}
