/*
2: Write a program to Accept a number and display its sum of digits.:ex 568    5+6+8
*/
#include<iostream>
using namespace std;
int sum_Digit(int num){
    int sum=0;
    while(num!=0){
    int rem=num%10;
    sum=sum+rem;
    num=num/10;
    }
    return sum;
}
int main(){
    int num;
    cout<<"Enter the number: ";
    cin>>num;
    int res=sum_Digit(num);
    cout<<"The sum of the digit= "<<res;
}