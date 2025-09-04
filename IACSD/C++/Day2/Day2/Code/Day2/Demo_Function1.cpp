#include<iostream>
using namespace std;

//signature
//ReturnType FunctionName(DataType Arg1[,DataType .....])

//1:NoRetun not accepting parameter
void display(){
    cout<<"\t\t\t--------Display--------"<<endl;
}

//2: NoReturn Type but accepting parameter
void add(int a,int b){
    int c=a+b;
    cout<<"\t\t Add="<<c<<endl;
}
//ex:void writeDataIntoFile(int rollno,string name,string city);


//3:ReturnType but not accepting arguments

int show(){
    int counter=101;
    cout<<"\t\t inside show -------"<<endl;
    //return counter value to calling method
    return counter;
    //code after return statement will never get execute
    
}
//4 :ReturnTYpe and arguments
int getMaxNumber(int a,int b){
    int c;
    if(a<b)
    {  c=b;
       //return c;
    }
    else
    {    c=a;
       // return c;
    }
    return c;


}

int getMinNumber(int a,int b){
    int c;
    c=(a<b)?a:b;
    return c;
}


//default value
int sum(int a=10,int b=100){
    cout<<"\t\t a="<<a<<"   b="<<b<<"    ";
    //int c=a+b;//return c;
   return a+b;
}


int main(){

    cout<<"\n \t\t Function Demo"<<endl;
     int x=10,y=20;
     display();//imp to invoke/call function explicitly

     add(x,y);
     add(23,45);
     add(11,22);

     //call function show here
     //int show()
     //if funtion return value then we have to store it
    int c= show();
    cout<<"Return from Show is:"<<c<<endl;
    c=getMaxNumber(44,56);
    cout<<"\t\t Max="<<c<<endl;
    c=getMinNumber(99,109);
    cout<<"\t\t Min="<<c<<endl;
    c=getMinNumber(989,109);
    cout<<"\t\t Min="<<c<<endl;
     display();
     cout<<"\t\t Sum="<<sum(10,12)<<"    "<<endl;//a=10,b=12
     int d=sum(34);//a=34 b is default 100
     cout<<"\t\t Sum="<<d;
     sum();//a=10 b=100
    return 0;
}