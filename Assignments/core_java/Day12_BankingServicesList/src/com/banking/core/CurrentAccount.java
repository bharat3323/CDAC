package com.banking.core;

import java.time.LocalDate;
import java.util.prefs.BackingStoreException;

import com.exceptions.BankingExceptions;

public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String customerName, double balance, String phoneNumber,
            AccountType accType, LocalDate creationDate, double overdraftLimit) {

        super(customerName, balance, phoneNumber, accType, creationDate);
        this.overdraftLimit = overdraftLimit;

    }

    // important logic
    // use overdraft facility
    public void withdraw(double amount) throws BankingExceptions {

        if (getBalance() + overdraftLimit > amount) {

            overdraftLimit = (getBalance() + overdraftLimit) - amount;
            setBalance(0); // there is error in logic here

            System.out.println("Overdraft facility used!");
            System.out.println("Remaining overdraft: " + overdraftLimit);

        } else if (getBalance() + overdraftLimit < amount) {

            throw new BankingExceptions("Amount exceeds Overdraft Limit. Transaction declined!!!");

        }

    }

    public String toString() {
        return getAccountNumber() + " | " + getCustomerName() + " | "
                + getBalance() + " | " + getPhoneNumber() + " | " + overdraftLimit;
    }
}
