package com.banking.core;

import com.Exception.InsufficianttBalanceException;

public class SavingAccount extends BankAccount {

	private double interestRate;

	public SavingAccount(int accountNumber, String customerName,
			double balance, String phoneNumber, double interestRate) {

		super(accountNumber, customerName, balance, phoneNumber);
		this.interestRate = interestRate;
	}

	// public void deposit(double amount) {
	// balance=balance+amount;
	// System.out.println("-----Deposit Successful!!-----");
	// System.out.println("Updated Balance: "+balance);
	// System.out.println();
	// }

	public void withdraw(double amount) throws InsufficianttBalanceException {

		if (amount <= 0) {
			throw new InsufficianttBalanceException("Withdrawal amount must be positive.");
		}
		if (getBalance() - amount <= 2000) {
			throw new InsufficianttBalanceException(
					"Withdraw denied balance amount go below minimum required balance of " + 2000);
		}
		if ((getBalance() - amount) > 2000) {

			setBalance(getBalance() - amount);
			System.out.println("Amount withdrawn.");
			System.out.println("Remaining balance: " + getBalance());
			System.out.println();

} //else {
//
//			System.out.println("Please maintain minimum balance!");
//			System.out.println();
//		}

	}

	public void applyInterest(double interestRate) {

		setBalance(getBalance() + (getBalance() * interestRate / 100));
	}

	public String toString() {
		return getAccountNumber() + " | " + getCustomerName() + " | "
				+ getBalance() + " | " + getPhoneNumber();
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
