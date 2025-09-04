
#include<iostream>
using namespace std;

void swapByRef(int &a,int &b){

    int temp=a;a=b;b=temp;
    cout<<"\t\t inside swap  a="<<a<<"    b="<<b<<endl;
}
int main(){
int a=10,b=20;
cout<<"\t\t  swap  a="<<a<<"    b="<<b<<endl;
swapByRef(a,b);//
cout<<"\t\t after swap  a="<<a<<"    b="<<b<<endl;



}