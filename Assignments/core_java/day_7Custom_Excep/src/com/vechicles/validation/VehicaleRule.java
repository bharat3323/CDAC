package com.vechicles.validation;

import src.custom_exception.SpeedOutOfRangeException;

public class VehicaleRule {

	public static final int MIN_SPEED;
	public static final int  MAX_SPEED;
	
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	public static void validation(double speed)
	throws SpeedOutOfRangeException
	{
		if(speed <= MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed is to slow!!!!");
		
		if(speed >=MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed is above limit!!! please slow down the speed");
		System.out.println("Speed With in limit");
	}
	
	
}
