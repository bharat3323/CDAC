#include<iostream>
using namespace std;
int main(){
    int a,b,temp;
    cout<<"Enter two Numbers: ";
    cin>>a>>b;
    cout<<"Numbers Before Swapping are: "<<endl;
    cout<<"a ="<<a<<endl;
    cout<<"b ="<<b<<endl;
    temp=a;
    a=b;
    b=temp;
    cout<<"Numbers After swapping are : "<<endl;
    cout<<"a="<<a<<endl;
    cout<<"b="<<b<<endl;
}