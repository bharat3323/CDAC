/*
 Write a  program to find sum of all even and odd numbers between 1 to n.
*/
#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the value: ";
    cin>>n;
    int even_sum=0;
    int odd_sum=0;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            even_sum=even_sum+i;
        }else{
            odd_sum=odd_sum+i;
        }
    }
    cout<<"Sum of odd number: "<<odd_sum<<endl;
    cout<<"Sum of even number: "<<even_sum<<endl;
}