

#include<iostream>
using namespace std;


template<class T>
void swapValue(T &a,T&b){

    T temp;
    temp=a;
    a=b;
    b=temp;

}
int main()
{

    int no1=20,no2=90;
     cout<<"\t\t befor no1="<<no1<<"      no2="<<no2<<endl;
   
    swapValue(no1,no2);

    cout<<"\n\t\t after no1="<<no1<<"      no2="<<no2<<endl;

    string s1="abc",s2="xyz";
    swapValue(s1,s2);
cout<<"\n\t\t after s1="<<s1<<"      s2="<<s2<<endl;

}