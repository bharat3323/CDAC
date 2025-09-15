package com.exceptions;

@SuppressWarnings("serial")
public class BankingExceptions extends Exception {
	
	public BankingExceptions(String errMsg) {
		
		super(errMsg);
	}

}
