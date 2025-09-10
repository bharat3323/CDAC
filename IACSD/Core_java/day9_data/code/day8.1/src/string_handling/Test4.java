package string_handling;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		String s1="Hello , testing some string apis , string again";
		System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
		System.out.println("hello java".contains("Java"));//t
		System.out.println(s1.indexOf("string")
				+"  "+s1.lastIndexOf("string"));
		String blankString="            ";
		System.out.println(blankString.isEmpty()+"  "+blankString.isBlank());
		String s2="    some string   ";
		System.out.println(s2.strip());
		String[] strings= {"Sameer","Riya","Anish","Amish","Rita","Riya1"};
		System.out.println(strings[0].compareTo(strings[1])); //>0
		System.out.println(strings[2].compareTo(strings[0])); // <0
		System.out.println(strings[1].compareTo(strings[4])); // >0
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));

	}

}
