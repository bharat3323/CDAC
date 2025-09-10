VarArgs 
- variable number of arguments
- represented by   ...  (elipsis)
var-args means you can pass  variable no of arguments , to any java method.
var-args are compiled into array itself internally , but offer more flexible syntax.


Rules :  
There can be only 1 var-args argument to any method.
It must be the last parameter.
It Can be used with  primitive type as well as ref types.



eg .
void doStuff(int... x) {
 for (int i : x)
  sop(i);	
 } // expects from 0 to many ints


Usage : ref.doStuff();//legal
int[] ints={1,2,3,4};
ref.doStuff(ints);//legal
ref.doStuff(20,34,56);


Solve 
void doStuff2(char c, int... x) {..... } 

eg : ref.doStuff2('a',1,2,3,5);//legal
ref.doStuff2();//javac error
ref.doStuff2('a');//legal


Solve - 

class Test {
void doStuff3(Animal... animals) { 
   for(Animal a : animals)
     sop(a.getName());
} 
}

Test ref=new Test();

ref.doStuff3();//legal
Animal animals[]={new Cat(),new Dog(),new Horse()}; 
ref.doStuff3(animals);
Animal a1=new Horse(); 
Animal a2=new Cat(); 
Animal a3=new Dog();
ref.doStuff3(a1,a2,a3);
ref.doStuff3(new Cat(),new Dog(),new Horse());


Solve 
void doStuff4(int x...) {....} //invalid syntax
void doStuff5(int... x, char... y) {...} 
void doStuff6(String... s, byte b) {... } 



