//Check if number is a prime number or not.: 
//Sum of series :1+2+3+….+n


#include<iostream>
using namespace std;

int main(){
    int num,isprime=1;
    cout<<"Enter the number: ";
    cin>>num;
    if(num<=1){
       isprime=0;
    }else{
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                isprime=0;
                break;
            }
        }
    }
    if(isprime){
        cout<<"number is prime";
    }else{
        cout<<"number is not prime";
    }
}
