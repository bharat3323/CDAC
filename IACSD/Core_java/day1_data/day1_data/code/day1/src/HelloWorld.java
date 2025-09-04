//import java.lang.*;
/* 
 All java classes can implicltyl access ALL classes from java.lang 
 package.
 package => collection of classes , mapped to folders
 System  , String : java.lang
 default access specifier  : package private (default) => visible within the same package(folder)
 legal access specifiers for java classes - default | public
 public class - accessible from anywhere !
*/
 class HelloWorld {
 public static void main(String[] ss) {
 System.out.println("Welcome 2 Java !"); 
 System.out.print("Hello , "+ss[0]);
 }
}
