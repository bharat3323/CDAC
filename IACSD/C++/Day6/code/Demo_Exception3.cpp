#include<iostream>
using namespace std;


int main(){

try{   
int no1,no2,no3;

cout<<"\t\t Enter Number no1 no2"<<endl;

cin>>no1>>no2;

if(no1==1)
{
    throw 101;
}
 if(no2==2)
 {
    throw string("Thsi is my error ");
 }
cout<<"\t\t-----------end of main----------"<<endl;
}
catch(int no){
    cout<<" Error :"<<endl;
}
catch(const string &str){
    //str="File Not Found...";
    cout<<"Error:"<<str<<endl;
}
catch(...)
{
    cout<<"\t\tCommon Error:"<<endl;
}



}