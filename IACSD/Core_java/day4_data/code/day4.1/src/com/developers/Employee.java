package com.developers;
import static java.lang.System.out;

public class Employee {
	private int id; //auto generated 
	private String name;
	private double salary;
	private int deptId;
	//add id generator
	private static int idGenerator;
	//static init block
	static {
		out.println("Emp : in static init block - 1");
		out.println(idGenerator);//0
		idGenerator=1000;
	}
	static {
		out.println("Emp : 2nd static init block");
	}
	//non static (instance) init block
	{
		System.out.println("in Emp's instance inti block");
	}
	public Employee(String name, double salary, int deptId) {	
		this.id=idGenerator++;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
