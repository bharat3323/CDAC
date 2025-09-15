package com.banking.validations;

import java.time.LocalDate;
import java.util.List;

import com.banking.core.AccountType;
import com.banking.core.BankAccount;
import com.banking.core.CurrentAccount;
import com.banking.core.SavingAccount;
import com.banking.custom_exceptions.BankingException;

public class BankingValidations {
//add a public static method to check for duplicate account no.
	public static void checkForDup(int acctNo, List<BankAccount> accountList) throws BankingException {
		// create new Bankaccount to wrap only acct no
		BankAccount a = new BankAccount(acctNo);
		if (accountList.contains(a))
			throw new BankingException("Dup Account no detected !!!!!");

	}

	// add a public static method to validate account type
	public static AccountType validateAcType(String acctType) throws IllegalArgumentException {
		return AccountType.valueOf(acctType.toUpperCase());
	}

	/*
	 * add a public static method to validate all inputs Return - BankAccount
	 * reference , in case of success Otherwise - throw exception
	 */
	public static BankAccount validateAllInputs(int accountNumber, double balance, String customerName,
			String phoneNumber, String acType, String dob, double rateOrLimit, List<BankAccount> accounts)
			throws BankingException {
		checkForDup(accountNumber, accounts);
		AccountType type = validateAcType(acType);
		LocalDate birthDate = LocalDate.parse(dob);
		if (type.equals(AccountType.SAVING)) {
			return new SavingAccount
					(accountNumber, balance, 
							customerName, phoneNumber, 
							 type, birthDate,rateOrLimit);
		} else {
			return new CurrentAccount(accountNumber, 
					balance, customerName, phoneNumber, 
					type, birthDate, rateOrLimit);
		}

	}

}
