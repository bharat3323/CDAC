package com.banking.core;

import java.time.LocalDate;

import com.exceptions.BankingExceptions;

public class SavingAccount extends BankAccount {

    private double interestRate;

    public SavingAccount(String customerName,
            double balance, String phoneNumber, AccountType accType, LocalDate creationDate, double interestRate) {

        super(customerName, balance, phoneNumber, accType, creationDate);
        this.interestRate = interestRate;
    }

    // public void deposit(double amount) {
    // balance=balance+amount;
    // System.out.println("-----Deposit Successful!!-----");
    // System.out.println("Updated Balance: "+balance);
    // System.out.println();
    // }

    public void withdraw(double amount) throws BankingExceptions {

        if (amount <= 0) {
            throw new BankingExceptions("Withdrawal amount must be positive.");
        }
        if (getBalance() - amount <= 2000) {
            throw new BankingExceptions(
                    "Withdraw denied balance amount go below minimum required balance of " + 2000);
        }
        if ((getBalance() - amount) > 2000) {

            setBalance(getBalance() - amount);
            System.out.println("Amount withdrawn.");
            System.out.println("Remaining balance: " + getBalance());
            System.out.println();

        } // else {
          //
          // System.out.println("Please maintain minimum balance!");
          // System.out.println();
          // }

    }

    public void applyInterest(double interestRate) {

        double interest = getBalance() * interestRate / 100;
        this.interestRate = interest;
        setBalance((getBalance() + interest));
        System.out.println("new balance after interest apply: " + getBalance());
    }

    @Override
    public String toString() {
        return super.toString()
                + " | InterestRate=" + interestRate + "%"
                + " | BalanceWithInterest=" + getBalance();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
