//Write a program to print all prime numbers between 1 to n
#include<iostream>
using namespace std;

bool isprime(int num){
if(num<=1){
    return false;
}else{
    for(int i=2;i*i<num;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
}
}

int main(){
    int num;
    cout<<"enter the the number: ";
    cin>>num;
    cout<<"Prime number from 1 to "<<num<<" are: ";
    for(int i=2;i<=num;i++){
        if(isprime(i)){
            cout<<i<<" ";
        }
    }
}