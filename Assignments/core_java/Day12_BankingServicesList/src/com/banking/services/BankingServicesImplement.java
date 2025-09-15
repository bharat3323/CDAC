package com.banking.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.banking.core.AccountType;
import com.banking.core.BankAccount;
import com.banking.core.SavingAccount;
import com.exceptions.BankingExceptions;

import static com.validations.BankValidation.validateAccount;

public class BankingServicesImplement implements BankingServices {

	List<BankAccount> bank;

	public BankingServicesImplement() {
		super();
		this.bank = new ArrayList<>(100);
		bank.add(new BankAccount("bharat", 100000, "85214794", AccountType.SAVING, LocalDate.of(2000, 8, 01)));
		bank.add(new BankAccount("Surya", 5000, "85214794", AccountType.CURRENT, LocalDate.of(2010, 8, 01)));
		bank.add(new BankAccount("ram", 10000, "85214794", AccountType.SAVING, LocalDate.of(2020, 8, 01)));
		bank.add(new BankAccount("shyam", 10000, "85214794", AccountType.CURRENT, LocalDate.of(2030, 8, 01)));
	}

	@Override
	public void openAccount(String customerName, double balance,
			String phoneNumber, String accType, String creationDate)
			throws BankingExceptions {

		BankAccount newAcc = validateAccount(customerName, balance, phoneNumber, accType,
				creationDate);

		bank.add(newAcc);

	}

	public void deposit(int accountNumber, double amount) throws BankingExceptions {
		boolean found = false;

		for (BankAccount bk : bank) {
			if (bk.getAccountNumber() == accountNumber) {
				bk.deposit(amount);
				found = true;
				break;
			}
		}
		if (!found) {
			throw new BankingExceptions("BankAccount not Found!!!");
		}

	}

	public void withdraw(int accountNumber, double amount) throws BankingExceptions {
		boolean found = false;
		for (BankAccount bk : bank) {
			if (accountNumber == bk.getAccountNumber()) {
				bk.withdraw(amount);
				found = true;
				break;
			}
		}
		if (!found) {
			throw new BankingExceptions("Invalid bank!!!");
		}
	}

	@Override
	public void transferfund(int accountNumbersrc, int accountNumberdest, double amount) throws BankingExceptions {
		BankAccount srAccount = null;
		BankAccount desAccount = null;
		// finding src and dest accounts
		for (BankAccount bk : bank) {
			if (bk.getAccountNumber() == accountNumbersrc) {
				srAccount = bk;
			}
			if (bk.getAccountNumber() == accountNumberdest) {
				desAccount = bk;
			}
		}
		if (srAccount == null) {
			throw new BankingExceptions("Source account not found!!!!");
		}
		if (desAccount == null) {
			throw new BankingExceptions("Destination account not found!!!!");
		}
		srAccount.withdraw(amount);
		desAccount.deposit(amount);
		System.out.println("Transfer successfull!!!!!");
	}

	@Override
	public void close(int accountNumber) throws BankingExceptions {
		BankAccount toRemove = null;
		for (BankAccount bk : bank) {
			if (bk.getAccountNumber() == accountNumber) {
				toRemove = bk;
				break;
			}
		}
		if (toRemove != null) {
			bank.remove(toRemove);
		} else {

			throw new BankingExceptions("Account number not found!!!!!");
		}
		System.out.println("Account deleted !!!!!!");
	}

	@Override
	public void applyInterestToAll(double interestRate) {
		for (BankAccount bk : bank) {
			if (bk instanceof SavingAccount) {
				SavingAccount sa = (SavingAccount) bk;
				sa.applyInterest(interestRate);
			}
		}
		System.out.println("Interest applied to all saving account!!");
		displayBankDetails();
	}

	public void displayBankDetails() {

		for (BankAccount b : bank) {
			System.out.println(b);
		}
	}

}
