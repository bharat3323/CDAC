#include<iostream>
#include<ios>
using namespace std;


int main()
{
 cout<<"--------Stream Demo------"<<endl;
 char no;
 cout<<"enter char :";
 cin.get(no);//read char from console

 cout<<"Char="<<no<<endl;
//or
cout.put(no);//write char on console
 
cout<<endl;
cout.width(10);
cout<<no<<endl;;
int a=100;
cout.width(20);
cout.fill('*');
cout<<a;

double d=12324.67789;
//Calling setf() function to set the flags to display a fixed number of digits after decimal in a floating-point value.
	cout.setf(ios::fixed, ios::floatfield);

	//Defining the number of digits to be displayed after the decimal in a floating number.
	cout.precision(3);

	//Printing the floating-point value after calling the setf() and precision() function
	cout<< "The floating value in variable d, after calling the precision() function : " << d;



}