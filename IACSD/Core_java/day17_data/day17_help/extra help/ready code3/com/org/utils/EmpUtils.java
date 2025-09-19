package com.org.utils;

import java.util.ArrayList;
import java.util.List;

import com.org.core.Employee;

public interface EmpUtils {
	static List<Employee> populateEmpList() {
		return new ArrayList<>
		(List.of
				(new Employee(101, "Rama", 10000, 
						List.of("Java", "Python", "ML")),
				new Employee(10, "Shubham", 20000,
						List.of("GenAI", "Python", "ML")),
				new Employee(40, "Rutuj", 15000, 
						List.of("Mongo DB", "Python", "ML")),
				new Employee(50, "Shivani", 18000,
						List.of("Java", "MySQL", "React")),
				new Employee(25, "Anish", 30000, 
						List.of("Go", "Python", "ML"))));
		}
}
