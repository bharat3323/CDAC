package com.banking.core;

public class CurrentAccount extends BankAccount {

	private double overdraftLimit;

	public CurrentAccount(int accountNumber, String customerName, 
					double balance, String phoneNumber, double overdraftLimit) {
		
		super(accountNumber, customerName, balance, phoneNumber);
		this.overdraftLimit = overdraftLimit;
		
	}

	//important logic
	//use overdraft facility
	public void withdraw(double amount) {
		
		if(getBalance()+overdraftLimit > amount) {
			
			overdraftLimit = (getBalance()+overdraftLimit) - amount;
			setBalance(0);  //there is error in logic here
			
			System.out.println("Overdraft facility used!");
			System.out.println("Remaining overdraft: " + overdraftLimit);
			
		} else if(getBalance()+overdraftLimit < amount ) {
			
			System.out.println("Amount exceeds Overdraft Limit. Transaction declined!!!");
				
		}
		
	}

	public String toString() {
		return getAccountNumber() + " | " + getCustomerName()+" | "
				+getBalance()+" | "+getPhoneNumber() +" | "+overdraftLimit ;
		}
}
