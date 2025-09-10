package com.banking.tester;

import com.banking.core.BankAccount;

public class TestEquals {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(101, 1000);
		BankAccount a2 = new BankAccount(101, 1000);
		System.out.println(a1 == a2);// f
		System.out.println(a1.equals(a2));// t
		System.out.println(a1.hashCode() + " " + a2.hashCode()); // diff adr

	}

}
