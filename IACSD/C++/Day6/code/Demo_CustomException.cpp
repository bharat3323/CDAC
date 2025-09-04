#include<iostream>
using namespace std;

class MyCustomException:public std::exception
{
    	public:char* message;
	  MyCustomException(char *mgs):message(mgs){}
	  //override from exception
	char* what(){
		return message;
	}

};

int main()
{

try
{
    /* code */
int age=1;
if(age<18){

    throw MyCustomException("Invalid Age ");
}

}
catch( MyCustomException mx){
cout<<" Custom Error:"<<mx.what();
}
}
