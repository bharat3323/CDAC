package com.org.tester;

public class Test2 {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("hi");
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.hashCode()+" "+s2.hashCode());//same
		System.out.println(s1.equals(s3)+" "+s3.hashCode());//f different
		//BBBB AaBB AaAa BBAa
		System.out.println("BBBB".equals("AaBB"));//f
		System.out.println("BBBB".hashCode() +" "+"AaBB".hashCode());//same

	}

}
