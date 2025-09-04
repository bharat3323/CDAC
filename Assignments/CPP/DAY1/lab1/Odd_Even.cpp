#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter the Number: ";
    cin>>num;
    if(num%2!=0){
        cout<<num <<" "<<"is odd number";
    }else{
        cout<<num <<" is even Number";
    }
}