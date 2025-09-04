package com.events.core;

public class Student extends Person {
	// graduation year,course,fees,marks
	private int gradYear;
	private String courseName;
	private int fees;
	private int marks;

	public Student(String fn, String ln, int year, String course, int fees, int marks) {
		super(fn, ln);// invokes immediate super class' matching ctor.
		System.out.println("in student's ctor");
		// super.firstName=fn;
		this.gradYear = year;
		this.courseName = course;
		this.fees = fees;
		this.marks = marks;
	}

	/*
	 * Add overriding form of the method to return COMPLETE details of a student
	 */
	public String getDetails()
	{
		return "Student "+super.getDetails()
		+" graduated in "+gradYear
		+" enrolled in "+courseName+" fees "
		+fees+" marks obtained "+marks;
	}

}
