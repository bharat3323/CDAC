package validations;

import custom_exceptions.SpeedOutOfRangeException;

public class VehicleValidationRules {
//declare n init speed limits
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	//add a static method for speed validation
	public static void validateSpeed(int speed) 
			throws SpeedOutOfRangeException
	{
		if(speed <= MIN_SPEED)
			throw new SpeedOutOfRangeException
			("Speed too slow !!! Can cause traffic jam!!!!!!");
		if (speed >= MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high ! FATAL !!!!!");
		System.out.println("speed within range....");
	}
	
}
