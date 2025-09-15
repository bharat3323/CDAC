package com.banking.services;

import java.time.LocalDate;

import com.banking.core.AccountType;
import com.exceptions.BankingExceptions;

public interface BankingServices {

	public void openAccount(String customerName, double balance,
			String phoneNumber, String accType, String creationDate) throws BankingExceptions;

	public void displayBankDetails();

	public void deposit(int accountNumber, double amount) throws BankingExceptions;

	public void withdraw(int accountNumber, double amount) throws BankingExceptions;

	public void transferfund(int accountNumbersrc, int accountNumberdest, double amount) throws BankingExceptions;

	public void close(int accountNumber) throws BankingExceptions;

	public void applyInterestToAll(double Interest);

}
