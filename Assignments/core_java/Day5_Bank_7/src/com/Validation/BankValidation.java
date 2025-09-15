package com.Validation;

import com.Exception.DuplicateBankAccountException;
import com.banking.core.BankAccount;

public class BankValidation {

    public static boolean DuplicateBankAccountException(BankAccount bank, Object[] b) throws DuplicateBankAccountException {
        
    	for(Object obj : b) {
    		
    		if (bank.equals(obj)) 
    			throw new DuplicateBankAccountException( "Account already exists!!!!");
    	}
    	
    	return false;
    	
        }
    }
    

