#include<iostream>
using namespace std;
int main()
{
//	char a;
//   cout<<"enter char"<<endl;
//    a=cin.get();
//	cout<<"Data:"<<a<<endl;
//	char arr[]={"This is My Demo Of Stream API"};
//	cout.write(arr,10);
//	cout<<endl;
	//formatted stream api
	int no=100;
	//Adjusting the width of the next value to displayed to 10 columns.
	cout.width(10);
	cout<<no;
	
	//fill demo
	char ch='O';
	cout<<endl;
	//Calling the fill function to fill the white spaces in a value with a character our of choice.
	cout.fill('*');
	//Setting the width of this value to 10
	cout.width(10);
	
	//Printing the first value
	cout<<ch <<"\n";// o/p is *********O
	cout.width(5);
	
	//Printing the first value
	cout<<ch <<"\n";// o/p is ****O
	
	
	
	//peek() demo
	//First char value
	char d;	
	cout<<"Please enter a character to be read by the peek() function : ";

	//Calling the peek() function to return the next character from input stream, without removing it from the stream
	d = cin.peek();
	//Printing the first char value
	cout<<"The value in d is : " << d <<"\n";
	
	
	//setf() demo
	//A floating-point value
	//float d = 12.3458998f;
	
	//Printing the floating-point value
//	cout<< "The floating value in variable d : " << d <<"\n";

	//Calling setf() function to set the flags to display a fixed number of digits after decimal in a floating-point value.
	cout.setf(ios::fixed, ios::floatfield);

	//Defining the number of digits to be displayed after the decimal in a floating number.
	cout.precision(3);

	//Printing the floating-point value after calling the setf() and precision() function
	cout<< "The floating value in variable d, after calling the precision() function : " << d;
	
	return 1;
	
}