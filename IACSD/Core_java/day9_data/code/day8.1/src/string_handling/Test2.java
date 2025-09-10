package string_handling;
/*
 * == vs equals
 */
public class Test2 {

	public static void main(String[] args) {
		String s1=new String ("hello");
		String s2=new String ("hello");
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//t
		String s3=new String("Hello");
		System.out.println(s1==s3);//f
		System.out.println(s1.equals(s3));//f
		System.out.println(s1.equalsIgnoreCase(s3));//t

	}

}
