package com.validations;

import java.time.LocalDate;

import com.banking.core.AccountType;
import com.banking.core.BankAccount;
import com.exceptions.BankingExceptions;


public class BankValidation {
	
	
	public static final double MIN_BAL = 2000;
	
	public static BankAccount validateAccount(String customerName,double balance,
			String phoneNumber,String accType,String creationDate) throws BankingExceptions {
		
		
		validateMinBalance(balance);
		BankAccount temp = new BankAccount( customerName, balance,
				 phoneNumber, AccountType.valueOf(accType.toUpperCase()), 
				 LocalDate.parse(creationDate));
			
		return temp;
	}
	
	
	public static boolean validateMinBalance(double bal) throws BankingExceptions {
		
		if(bal < MIN_BAL)
			throw new BankingExceptions("Please maintain minimum balance(2000 Rs.)");
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//    public static boolean DuplicateBankAccountException(BankAccount bank, Object[] b) throws DuplicateBankAccountException {
//        
//    	for(Object obj : b) {
//    		
//    		if (bank.equals(obj)) 
//    			throw new DuplicateBankAccountException( "Account already exists!!!!");
//    	}
//    	
//    	return false;
//    	
//        }
    }
    

