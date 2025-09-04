#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter the the number:";
    cin>>num;
    int temp=num;
    int new_num=0;
    while(temp!=0){
        int rem=temp%10;
        new_num=new_num*10+rem;
        temp=temp/10;
    }
    if(new_num==num){
        cout<<"number is palindrom";
    }else{
        cout<<"number is not palindrom";
    }
    
}