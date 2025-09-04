#include<iostream>
using namespace std;

int main()
{
cout<<"\t\t Pointer Demo"<<endl;

int x=100;
int &xcopy=x;//reference variable

cout<<"\t\t Value of X="<<x<<"       Address:"<<&x<<endl;

int y=x;

cout<<"\t\t Value of Y="<<x<<"       Address:"<<&y<<endl;

//create pointer of int
int *ptrX=&x;

cout<<"\t\t Value of ptrX="<<ptrX<<"       Address of ptrX:"<<&ptrX<<endl;
cout<<"\t\t "<<*ptrX<<endl;

x=908;

cout<<"\t\t Value of ptrX="<<ptrX<<"       Address of ptrX:"<<&ptrX<<endl;
cout<<"\t\t "<<*ptrX<<endl;


//can pointer point to different address?

int rollno=455;
cout<<"\t\t rollno value:"<<rollno<<"    Address :"<<&rollno<<endl;
ptrX=&rollno;

cout<<"\t\t Value of ptrX="<<ptrX<<"       Address of ptrX:"<<&ptrX<<endl;
cout<<"\t\t "<<*ptrX<<endl;


}