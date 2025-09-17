package com.org.core;

public class Employee {
	private String empId;
	private String name;
	private double salary;
	public Employee(String empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	//override equals
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp's equals");
		if(o instanceof Employee)
		{
			Employee e=(Employee)o;
			return this.empId.equals(e.empId);
		} 
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("in emp's hashCode ");
		return empId.hashCode();
	}
	
}
