package com.tester;

import com.developers.Employee;

public class TestStatic {
	//static init block
	static {
		System.out.println("TestStatic : static init block");
	}

	public static void main(String[] args) {
		System.out.println("in main ....");
		Employee e1=new Employee("Rama Patil", 12345, 10);
		Employee e2=new Employee("Atharv Kher", 12349, 10);
		System.out.println(e1.getId()+" "+e1.getSalary());
		System.out.println(e2.getId()+" "+e2.getSalary());

	}

}
