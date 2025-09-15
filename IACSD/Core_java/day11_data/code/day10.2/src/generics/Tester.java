package generics;

public class Tester {

	public static void main(String[] args) {
		// Create instance of AnyHolder to hold int value : 12345
		AnyHolder<Integer> intHolder = new AnyHolder<>(12345);// auto boxing
		int data = intHolder.getReference();// auto un boxing! - no explicity down casting is required!
		// Create instance of AnyHolder to hold a String "hello"
		AnyHolder<String> stringHolder = new AnyHolder<>("hello");// NO implicit coversion !
		String s = stringHolder.getReference();// no downcasting required
	//	intHolder = stringHolder;// javac detects a type mismatch error - thanks to generics ! - making it impossible
									// to land into run time error - ClassCastException
		System.out.println("main over ....");

	}

}
