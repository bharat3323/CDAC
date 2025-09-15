package com.cms.comparators;

import java.util.Comparator;

import com.cms.core.Customer;

public class CustomerRegAmountComparator 
implements Comparator<Customer> {
	@Override
	public int compare(Customer c1,Customer c2) {
		System.out.println("in compare - reg amount");
		if(c1.getRegAmount() < c2.getRegAmount())
			return -1;
		if(c1.getRegAmount() == c2.getRegAmount())
			return 0;
		return 1;		
	}

}
