#include<iostream>
using namespace std;

int main()
{

int arr[]={10,20,30,40,50};

cout<<"/t/t Address of Arr :"<<arr<<endl;

//pomiter
int *p=arr;
cout<<"\t\t Value of p "<<p<< "     Address of p:"<<&p<<endl;
int i=0;
for(i=0;i<5;i++){
    cout<<*(p+i)<<endl;
}





}