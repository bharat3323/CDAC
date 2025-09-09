/*
 * literal string vs non literal string
 */
package string_handling;

public class Test3 {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String(s1);
		String s3="hello";
		String s4="Hello";
		String s5=new String("hello");
		System.out.println(s1==s2); //f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1==s3);//t
		System.out.println(s1.equals(s3));//t
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s4));//f
		System.out.println(s1.equalsIgnoreCase(s4));//t
		System.out.println(s2==s5);//f
		System.out.println(s2.equals(s5));//t
		String s6="HELLO".toLowerCase();
		System.out.println(s1==s6);//f
		System.out.println(s5==s6);//f
		String s7=new String("hi how are you?");//how many objects ?
		s1=s2=s3=s4=s5=null;//how many objects are marked for GC ?2
		System.out.println("code continues....");

	}

}
