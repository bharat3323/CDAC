#include<iostream>
using namespace std;

inline int maxNumber(int a,int b){
    return (a>b)?a:b;

}

int main()
{
int x=100,y=893;
int m=maxNumber(x,y);//(a>b)?a:b;
cout<<"\t\t Max Number="<<m<<endl;



}