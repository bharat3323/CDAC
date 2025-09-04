// Accept two numbers and calculate GCD of them.

#include<iostream>
using namespace std;

int gcd(int a,int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }  
    return a; 
}
int main(){
    int a,b;
    cout<<"enter the value of a & b: ";
    cin>>a>>b;
    cout<<"Gcd is: " <<gcd(a,b);
}