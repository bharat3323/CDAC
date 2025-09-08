package com.vechicles.core;

public class Vechical {

	private String car_name;
	private double car_speed;
	
	public Vechical() {
		car_name="maruti";
		car_speed=50;
		
	}
	public Vechical(String car_name, double car_speed) {
		super();
		this.car_name = car_name;
		this.car_speed = car_speed;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public double getCar_speed() {
		return car_speed;
	}
	public void setCar_speed(double car_speed) {
		this.car_speed = car_speed;
	}
	
	
}
