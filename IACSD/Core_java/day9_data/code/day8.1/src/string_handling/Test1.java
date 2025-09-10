/*
 * Immutabilty of strings
 *  - Any time you use any String class method ,
 *   to modify the string contents
 *  - JVM creates a NEW string object with the modifications
 *  - Returns its reference to the caller.
 */
package string_handling;

public class Test1 {

	public static void main(String[] args) {
		 String s1=new String("testing ");
		s1.concat("strings ");
		System.out.println(s1);//testing
		 s1 += "hello ";//s1 = s1 + "hello";
		 System.out.println(s1);//testing hello
		 String s2=s1.toUpperCase();
		 System.out.println(s1);//testing hello
		 System.out.println(s2);//upper cased !
		 System.out.println(s2.toLowerCase());//lower cased 
		 System.out.println(s2);
		 String s3=s2.replace('T', 'R');
		 System.out.println(s2);//original
		 System.out.println(s3);//replaced

	}

}
