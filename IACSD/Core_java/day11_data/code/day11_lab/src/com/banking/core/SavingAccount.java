package com.banking.core;

import java.time.LocalDate;

public class SavingAccount extends BankAccount {
    private double interestRate; 

	public SavingAccount(int accountNumber, double balance, 
			String customerName, String phoneNumber,
			AccountType type,LocalDate dob,double interestRate) {
		super(accountNumber, balance, customerName, phoneNumber,type,dob);
		this.interestRate = interestRate;
	}  
     //Saving account specific  method
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: " + interest + ". New balance = " + getBalance());
    }
	@Override
	public String toString() {
		return "SavingAccount "+super.toString()+" [interestRate=" + interestRate + "]";
	}
    
}
