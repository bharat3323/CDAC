//Write a  program to enter a number and print its reverse.
#include <iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter the number: ";
    cin>>num;
    int rev_no=0;
    while(num!=0){
        int rem=num%10;
        rev_no=rev_no*10+rem;
        num=num/10;
    }
    cout<<"Reverse number is: "<<rev_no;
}