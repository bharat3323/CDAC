package com.org.tester;

import java.util.HashSet;
import java.util.Iterator;

import com.org.core.Employee;

public class Test4 {
//BBBB AaBB AaAa BBAa --- different strings having same hashcode
	public static void main(String[] args) {
		Employee e1=new Employee("BBBB", "Rama Kher", 10000);
		Employee e2=new Employee("BBBB", "Rama Kher", 10000);
		Employee e3=new Employee("AaBB", "Rama Kher", 10000);
		Employee e4=new Employee("AaAa", "Anuj Sharma", 12000);
		Employee e5=new Employee("BBAa", "Anuja Sharma", 15000);		
		//HashSet of emps
		HashSet<Employee> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t , hc - 1   eq - 0
		System.out.println("Added "+emps.add(e2));//f , hc - 1   eq - 1
		System.out.println("Added "+emps.add(e3));//t hc - 1   eq - 1
		System.out.println("Added "+emps.add(e4));//t hc - 1   eq - 2
		System.out.println("Added "+emps.add(e5));//t hc - 1   eq - 3
		
		System.out.println("size "+emps.size());//4
		for(Employee e : emps)
			System.out.println(e);//no dups !
		

	}

}
