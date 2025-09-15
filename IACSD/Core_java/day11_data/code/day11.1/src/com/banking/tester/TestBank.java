package com.banking.tester;

import com.banking.core.BankAccount;
import com.banking.core.BankAccount.Transaction;

public class TestBank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("12345", 5000);

		account.deposit(500);
		account.withdraw(300);

		System.out.println("Transaction history:");
		for (BankAccount.Transaction t : account.getTransactions()) {
			if (t != null)
				System.out.println(t);
		}
		
//		Transaction t1=new Transaction("withdraw", 4567);
	}
}
