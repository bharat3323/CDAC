//Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
#include<iostream>
using namespace std;
int main(){
int m,n,pow=1;
cout<<"Enter the m: ";
cin>>m;
cout<<"Enter the n: ";
cin>>n;
for(int i=0;i<n;i++){
pow=pow*m;
}
cout<<"Result is : "<<pow;
}