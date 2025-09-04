#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter the Number: ";
    cin>>num;
    int fac=1;
    for(int i=1;i<=num;i++){
        fac=fac*i;
    }
    cout<<num<<" factorial is "<<fac;
    return 0;
}