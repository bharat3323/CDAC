package com.Validation;

import com.Exception.DuplicateBankAccountException;
import com.banking.core.BankAccount;

public class BankValidation {

    public static void DuplicateBankAccountException(BankAccount bank, Object b) throws DuplicateBankAccountException {
        boolean duplicate = false;
        if (b.equals(bank)) {
            throw new DuplicateBankAccountException("Account already exist");
        }
    }
    
}
