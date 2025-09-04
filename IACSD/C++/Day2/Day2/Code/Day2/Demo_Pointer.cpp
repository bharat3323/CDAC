#include<iostream>
using namespace std;

void swapByPointer(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;

}
int main(){

    int a=205;// value = 205 
cout<<"\t\t  value="<<a<<"      address:"<<&a<<endl;

//pointer:holds address of another variable
int *ptr=&a;//ptr hold value as address of a

cout<<"\t\t ptr value :"<<ptr<<endl;
cout<<"\t\t deRef ptr: "<<*ptr<<endl;
cout<<"\t\t :"<<&ptr<<endl;

int b=20;
a=10;
swapByPointer(&a,&b);//passes address of a,b
cout<<"\t\t after swapPointer   a="<<a<<"   b="<<b<<endl;

}