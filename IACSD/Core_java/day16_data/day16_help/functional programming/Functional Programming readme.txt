Functional programming In java 

Till JDK 1.7 ,  Java was supporting the imperative style of programming and OOP style of programming. 

Main new feature since Java 8 , is it  has started supporting the functional style of programming .

What is functional programming? 

It is a declarative style of programming(WHAT)  rather than imperative(HOW)

The basic objective of this style of programming is to make code more concise, less complex, more predictable, and easier to test and read , as compared to the legacy style of coding. 

Functional programming deals with certain key concepts such as pure function, immutable state , closures etc 

Functional Programming ( FP) is one of the type of programming pattern that helps the process of building application by using of higher order  functions, avoiding shared state, mutable data


Functional programming vs Purely Functional programming:

Pure functional programming languages don’t allow any mutability in its nature whereas a functional style language provides higher-order functions but often permits mutability 

 If a language provides higher-order function it is functional style language, and if a language goes to the extent of limiting mutability in addition to higher-order function then it becomes purely functional language. 

Java is a functional style language and the language like Haskell is a purely functional programming language.

Features :  

Higher-order functions: In functional programming, functions are to be considered as first-class citizens.

In our current OOP programming model : 
We can pass objects(reference) to a function.
We can create objects within function.
We can return objects(reference) from a function.

BUT with functional programming : 

Functions are treated as a first class citizens.
Meaning :  You can 
1.1  define anonymous functions
1.2  assign a function to a variable (function literal)
1.3  pass function as a parameter
1.4  return function as a return value


Functional programming vs OOP 

Declarative vs Imperative :

Functional programming is a declarative pattern, meaning that the program logic is expressed without explicitly describing the flow control.Imperative programs spend lines of code describing the specific steps used to achieve the desired results — the flow control

Declarative programs remove the flow control process, and instead spend lines of code describing the data flow.

Pure functions: A function is called pure function if it always returns the same result for same argument values and it has no side effects like modifying an argument (or global variable) or outputting something.

Lambda expressions: A Lambda expression is an anonymous method that has mutability at very minimum and it has only a parameter list and a body. The return type is always inferred based on the context.  The syntax of a lambda expression is: 
 
(parameter) -> body
In its simple form, a lambda could be represented as a comma-separated list of parameters, the –> symbol and the body.

Why FP ?

1. To write more readable , maintainable , clean & concise code.
2. To use APIs easily n effectively.
3. To enable parallel processing 

OOP uses imperative style of programming (where you will have to specify what's to be done & how --both) .
FP uses declarative style of programming (where you will just have to specify what's to be done 


2. Functional interfaces
An interface which has exactly single abstract method(SAM)  is called functional interface.

eg Runnable,Comparable,Comparator,Iterable,Consumer,Predicate,Supplier,Function...
Java SE 8 has introduced a new package for functional i/f
java.util.function

New annotation introduced -- @FunctionalInterface
(since Java SE 8)

Functional i/f references can be substituted by lambda expressions, method references, or constructor references.

Solve --  Is following valid functional interface ?
public interface A { double calc(int a,int b);} :  
public interface B extends A {} : 
public interface C extends A { void show();} : 
public interface D {} --
public interface E extends A {default void show(){sop("in show ");}
static double add(double a,double b) {return a+b}

} 

3. Addition of "default" keyword to add default method implementation ,  in interfaces.

Java 8 enables us to add non-abstract method implementations to interfaces by using the default keyword. This feature is also known as Extension Methods. 

Why default keyword ?
1. To maintain backward compatibility with earlier Java SE versions
2. To avoid implementing new functionality in all implementation classes.

eg : Java added in Iterable<T> interface
default void forEach(Consumer<? super T> action) -- as a default method implementation

eg :

interface Formula {
    double calculate(double a);//javac adds implicit keywords : public n abstract
	//javac adds implicit keyword public 
    default double sqrt(double a,double b) {
        return Math.sqrt(a+b);
    }
}
Q : If you write an implementation class MyFormula
public class MyFormula imple Formula
{
 .....
}
Which methods have to be implemented to avoid javac err?
1. calculate
2. sqrt
3. both
4. neither


Q : Can MyFormula class override the default implementation of sqrt ?


4. Can add static methods in java interfaces --- It's a better alternative to writing static library methods in helper class(eg --Arrays or Collections)

Such static methods can't be overridden in implementation class.
BUT can be re-declared.

They have to be invoked using interface name , even in implementation or non implementation classes.(otherwise compiler error)




1 Display all elements of ArrayList
forEach
2. Create AL of integers
remove all odd numbers.

3. Create AL of emps
Remove underperforming employees (performance index < 7)
Dsiplay the list

4. Sort the emps as per salary.


4. Enter Java 8 Streams
1.Create int[] ---> IntStream & display its contents.
2. Create AL<Integer> , populate it.
Convert it to seq stream & display elems
Convert it to parallel stream & display elems
3. Create stream of ints between 1-100 & display all even elements.
(Hint : IntStream methods --range,filter,forEach)

4. Display all emp names from  a particular dept , joined after specific date
(stream,filter,forEach)

5. Display sum of all even nos between 1-100 .
(stream , filter ,sum)
6. Display sum of salaries of all emps from a specific dept

7. Create a supplier of random numbers
eg : 
        Supplier<Double> randomValue = () -> Math.random(); 
  
        // Print the random value using get() 
        System.out.println(randomValue.get()); 

8. Create a supplier of LocalDate & Time 

eg :  Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();

        System.out.println(time2);


