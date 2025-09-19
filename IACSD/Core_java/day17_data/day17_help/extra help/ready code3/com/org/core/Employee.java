package com.org.core;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private List<String> skills;
	public Employee(int id, String name, double salary, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	
}
