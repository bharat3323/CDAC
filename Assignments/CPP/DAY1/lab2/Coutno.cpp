//1:Write a program that accepts numbers continuously as long as the 
//number is positive and prints the sum of the given numbers.
#include <iostream>
using namespace std;
int main(){
    int num=0;
    int sum=0;
    cout<<"Enter the number 0 or negative to stop: ";

    while(true){
         cin>>num;
         if(num<=0) break;
         sum=sum+num;
    }
    cout<<"Sum of the number is : "<<sum;
}