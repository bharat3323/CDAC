package com.banking.tester;

import com.banking.core.BankAccount;

public class TestEquals2 {

	public static void main(String[] args) {
		Object a1 = new BankAccount(101, 1000);
		Object a2 = new BankAccount(102, 1000);
	//	System.out.println(a1 == a2);// f
		System.out.println(a1.equals(a2));// f
	//	System.out.println(a1.hashCode() + " " + a2.hashCode()); // diff adr
		String s="hello";
		System.out.println(a1.equals(s));

	}

}
