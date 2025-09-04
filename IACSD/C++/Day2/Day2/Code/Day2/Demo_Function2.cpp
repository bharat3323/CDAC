#include<iostream>
using namespace std;

void billCalulation(int prdid ,int qty=1,double price=100){
    double bill=price*qty;
    cout<<"\t\t Bill :"<<bill<<endl;
}

void swap1(int a,int b){

    int temp=a;
    a=b;
    b=temp;
    cout<<"\t\t inside a="<<a<<"    b="<<b<<endl;
  }

  void incrementMarks(int marks){
    marks=marks+100;//local
    cout<<" Updated Marks="<<marks<<endl;

  }

int main(){
    //using default parameter value
billCalulation(1011,2,500);//
billCalulation(1002,5);//price=100
billCalulation(303);//default qty,price

cout<<"\n\t\t-------Swap Function Demo-------"<<endl;

int x=10,y=20;
cout<<"\t\t\t ---befor swap1  a="<<x<<"    b="<<y<<endl;
swap1(x,y);//pass by value :copy of veriable,dummy variable/temp variable is used
//changes are inside function only not outside of function

cout<<"\t\t\t ---after swap1  a="<<x<<"    b="<<y<<endl;
//we must get exchage value after function swap1 inside main function
//how to do this
//way1: use pointers
//way2:use reference variable
//what is ref variable


int m=10;
incrementMarks(m);//by default is pass by value
cout<<" Marks in Main="<<m<<endl;

}