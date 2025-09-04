#include<iostream>
using namespace std;


void Test_PointerToConst(){

    int data=500;
    cout<<"\t\t  Data:"<<data<<"      Address:"<<&data<<endl;

    //create pointer to point to data
    int *ptrData=&data;
     cout<<"\t\t  ptrData:"<<ptrData<<"      Address:"<<&ptrData<<endl;
     cout<<"\t\t value at address hold by ptr: "<<*ptrData<<endl;
//try to change value of data using pointer

 *ptrData=800;

 cout<<"\t\t  ptrData:"<<ptrData<<"      Address:"<<&ptrData<<endl;
 cout<<"\t\t value at address hold by ptr: "<<*ptrData<<endl;
cout<<"\t\t Data:"<<data<<endl;

//create const 
const int count=250;
 cout<<"\n\n \t\t  counter:"<<count<<"      Address:"<<&count<<endl;


 //create pointer to point const count
 //constant pointer
const  int *ptrCount=&count;
 cout<<"\t\t  ptrCount:"<<ptrCount<<"      Address:"<<&ptrCount<<endl;
cout<<"\t\t value at address hold by ptrCount: "<<*ptrCount<<endl;

//now try to change value of count using pointer

//*ptrCount=300;//error

//can it hold adderss of another variable:YES
int age=45;
ptrCount=&age;
cout<<"\t \t  New Value hold by ptrCount "<<*ptrCount<<endl;

}

void Test_ConstPointer(){

   cout<<"\t\t const pointer "<<endl;
   int data=900;

   cout<<"\t\t  Data:"<<data<<"       Address:"<<&data<<endl;

   //create poiter to point to data
   int* const ptr=&data;

    cout<<"\t\t  ptr"<<ptr<<"       Address:"<<&ptr<<endl;
    cout<<"\t\t value using ptr :"<<*ptr<<endl;

//try to change value of data using pinter?
*ptr=150;//yes

int x=455;
//try to assign this x address to pinter
//ptr=&x;//error


   


}


void Test_ConstPointerConstData(){

//const
const int data=123;
//create const pointer to hold const data

const int * const ptr=&data;

//try to chnage value of data using ptr
//*ptr=9000;//error

int a=11;
//try to point ptr to another location
//ptr=&a;//error

    
}
void Test_NewDeleteOperator()
{

int a=10;
int *ptr=new int;
ptr=&a;

delete ptr;


}

int main(){


    cout<<"\t\t------------Pointer-----------"<<endl;

    // Test_PointerToConst();
Test_ConstPointer();

}