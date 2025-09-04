package com.events.core;

public class Faculty extends Person {
	private int experienceInYears;
	private String sme;
	public Faculty(String fn,String ln,int years,String sme)
	{
		super(fn,ln);
		System.out.println("in faculty ctor");
		this.experienceInYears=years;
		this.sme=sme;
	}
	/*
	 * Add overriding form of the method to return 
	 * COMPLETE details of a faculty
	 */
	public String getDetails() {
		return "Faculty "+super.getDetails()+" exp in years "
	+experienceInYears+" expert in "+sme;
	}
}
