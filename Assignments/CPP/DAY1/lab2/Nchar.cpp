// Write a program to accept a character, 
//an integer n and display the next n characters
#include<iostream>
using namespace std;

void Res(char ch,int n){
    for(int i=0;i<n;i++){
        cout<< char(ch+i)<<" ";
    }
   
}

int main(){
    char ch;
    int n;
    cout<<"Enter the character: ";
    cin>>ch;
    cout<<"Enter the n: ";
    cin>>n;
    Res(ch,n);

}