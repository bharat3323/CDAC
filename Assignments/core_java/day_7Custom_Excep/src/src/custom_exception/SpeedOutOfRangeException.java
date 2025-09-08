package src.custom_exception;

public class SpeedOutOfRangeException extends Exception{
	public SpeedOutOfRangeException(String errormsg) {
		super(errormsg);
	}
}
