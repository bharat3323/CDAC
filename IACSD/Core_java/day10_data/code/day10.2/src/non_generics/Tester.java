package non_generics;

public class Tester {

	public static void main(String[] args) {
		// Create instance of AnyHolder to hold int value -12345
		AnyHolder intHolder=new AnyHolder(12345);//int --> Integer --> Object
		System.out.println(intHolder.getClass());//non_generics.AnyHolder
		System.out.println(intHolder.getReference().getClass());//java.lang.Integer
		//get int value from this intHolder
		int data=(Integer)intHolder.getReference();//explicit - downcasting , impl - auto un boxing
		// Create instance of AnyHolder to hold a String "hello"
		AnyHolder stringHolder=new AnyHolder("hello");//up casting
		String s=(String) stringHolder.getReference();
		intHolder=stringHolder;
		data=(Integer)intHolder.getReference();
		System.out.println("main over ....");
		
	}

}
