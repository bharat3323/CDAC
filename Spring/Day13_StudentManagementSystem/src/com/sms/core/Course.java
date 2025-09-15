package com.sms.core;

public enum Course {
CORE_JAVA(40,3)
,DBT(30,2),
PYTHON(35,5),
MERN(35,10),
WEB_JAVA(35,5),
DEV_OPS(35,6);

	private int minmarks;
	private int max_seat;

	private Course(int minmarks,int max_seat) {
		this.minmarks = minmarks;
		this.max_seat=max_seat;
	}

	public int getMinmarks() {
		return minmarks;
	}

	public void setMinmarks(int minmarks) {
		this.minmarks = minmarks;
	}

	public int getMax_seat() {
		return max_seat;
	}

	public void setMax_seat(int max_seat) {
		this.max_seat = max_seat;
	}
	
	
	
	
	
}
