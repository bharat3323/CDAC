package com.org.tester;

import java.util.HashSet;

import com.org.core.Employee;

public class Test1 {

	public static void main(String[] args) {
		Employee e1=new Employee("rnd-001", "Rama Kher", 10000);
		Employee e2=new Employee("rnd-001", "Rama Kher", 10000);
		Employee e3=new Employee("rnd-002", "Anuj Sharma", 12000);
		//HashSet of emps
		HashSet<Employee> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//f
		System.out.println("Added "+emps.add(e3));//t
		System.out.println(e1.equals(e2));//t
		System.out.println(e1.hashCode()+" "+e2.hashCode());//same
		System.out.println("----------------");
		System.out.println("size "+emps.size());//2
		for(Employee e : emps)
			System.out.println(e);//no dups !
		

	}

}
