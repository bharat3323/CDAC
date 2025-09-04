//2. Write a program to accept two 
//integers x and n and compute x raised to n.
#include<iostream>
using namespace std;

int Sol(int x,int n){
    int res=1;
    for(int i=0;i<n;i++){
    res=res*x;
    cout<<res<<endl;
    }
    return res;

}
int main(){
int x;
int n;
cout<<"Enter the value of x: ";
cin>>x;
cout<<"Enter the value of n: ";
cin>>n;
int result=Sol(x,n);
cout<<"Answer is: "<<result;

}