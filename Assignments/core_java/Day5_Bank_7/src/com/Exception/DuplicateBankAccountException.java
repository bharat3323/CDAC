package com.Exception;

import javax.naming.InsufficientResourcesException;

public class DuplicateBankAccountException extends Exception {
    public DuplicateBankAccountException(String errmsg) {
        super(errmsg);
    }
}
