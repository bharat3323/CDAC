//import java.lang.*;
/* 
 All java classes can implicltyl access ALL classes from java.lang 
 package.
 package => collection of classes , mapped to folders
 System  , String : java.lang
 default access specifier  : package private (default) => visible within the same package(folder)
 legal access specifiers for java classes - default | public
 public class - accessible from anywhere !
 Rules
 1. Default class name need not match with src file name.
 2. Single src file can contain multiple default classes.
 3. Single src file can contain only 1 public class , name of the public class name must match with src file name
 eg : public class TestMe - must be saved in TestMe.java
*/
 class HelloWorld {
 public static void main(String[] ss) {
 System.out.println("Welcome 2 Java !"); 
 System.out.print("Hello , "+ss[0]);
 }
}
class A{
	 public static void main(String[] ss) {
    System.out.println("in A's main"); 
 
 }
}
class B {
	public static void main(String[] ss) {
    System.out.println("in B's main"); 
 
 }
}
