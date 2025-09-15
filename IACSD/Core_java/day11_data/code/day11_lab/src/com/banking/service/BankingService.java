package com.banking.service;

import com.banking.core.BankAccount;
import com.banking.custom_exceptions.BankingException;

public interface BankingService {
//add a method to open account
	String openAccount(int accountNumber, double balance, String customerName, String phoneNumber, String acType,
			String dob, double rateOrLimit) throws BankingException;

	// add a method to get account summary
	BankAccount getSummary(int accountNo) throws BankingException;
	// add a method to withdraw funds
	void withdraw(int accountNo, double amount) throws BankingException;
	// add a method to deposit funds
	void deposit(int accountNo, double amount) throws BankingException;

}
