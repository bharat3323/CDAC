package com;

import java.util.Set;

public interface NumInf {

	public static double add(Set<? extends Number> num) {
		double sum=0;
//		num.forEach(c-> sum+=c.doubleValue());
		for(Number n:num) {
			sum+=n.doubleValue();
		}
		return sum;
	}
}
