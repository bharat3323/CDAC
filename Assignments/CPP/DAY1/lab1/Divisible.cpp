#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter the Number: ";
    cin>>num;
    if(num%5==0 && num%7==0)
    cout<<num<<" is divisible by 5 and 7";
    else
    cout<<num<<" is not divisible by 5 and 7";

}