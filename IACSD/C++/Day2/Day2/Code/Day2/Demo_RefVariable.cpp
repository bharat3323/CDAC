#include<iostream>
using namespace std;
int main()
{

int a=10;
int b;
b=a;
cout<<"\t\t a="<<a<<"      b="<<b<<endl;//a=10 b=10
b=500;
cout<<"\t\t a="<<a<<"      b="<<b<<endl;//a=10 b=500
a=400;
cout<<"\t\t a="<<a<<"      b="<<b<<endl;//a=400 b=500

cout<<"\t\t Address --------"<<endl;

cout<<"\t\t a="<<&a<<"      b="<<&b<<endl;//a=400 b=500
cout<<"\t\t -----Reference Variable--------"<<endl;

int rollno=202;
//create ref variable for rollno
int &myrollno=rollno;
cout<<"\t\t  ref variable myrollno="<<&myrollno;
cout<<"\t\t   rollno="<<&rollno;
cout<<"\t\t  value  myrollno="<<myrollno;
cout<<"\t\t  value rollno="<<rollno;

rollno=404;
cout<<"\n\t\t after change in rollno-------"<<endl;
cout<<"\t\t  value  myrollno="<<myrollno;//
cout<<"\t\t  value rollno="<<rollno;

cout<<"--------address------"<<endl;

cout<<"\t\t  ref variable myrollno="<<&myrollno;
cout<<"\t\t   rollno="<<&rollno;

}