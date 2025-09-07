package com.payments.tester;

import com.payments.*;
import static com.payments.Payment.NO_OF_DAYS;

public class TestPayments {

	public static void main(String[] args) {
		System.out.println(NO_OF_DAYS);
		/*
		 * Create a demo (main) class - Supply both payment options - single for-each
		 * loop - invoke common methods (pay & getDetails) - invoke specific (to imple
		 * class) methods. (set daily limit , link bank account)
		 * 
		 */
//		Payment[] payments=new Payment[2];
//		payments[0]=
//				new CreditCardPayment
//				("1234 4567 7890", "2026-10-20", "123", 10000);
//		payments[1]=new UPIPayment("abc@upi", "1234");
		Payment[] payments = 
			{ new CreditCardPayment("1234 4567 7890", "2026-10-20",
					"123", 10000),
				new UPIPayment("abc@upi", "1234") };// up casting
		for (Payment payment : payments) {
			// common func
			payment.pay(1000);// credit card , upi - run time polymorphism
			payment.getDetails();// credit card , upi - run time polymorphism
			// invoke specific functionality
			if (payment instanceof CreditCardPayment) {
				((CreditCardPayment) payment).setDailyLimit(5000);
			} else //upi payment
			{
				((UPIPayment)payment).linkBankAccount("HDFC", "14256576578");
			}
		}

	}

}
