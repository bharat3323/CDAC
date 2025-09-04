#include<iostream>
using namespace std;

double dicivision(int i,int j){

    int k;
    if(j==0)
    {
       //throw -1;
    }
    else{
        k=i/j;
        
    }
    return k;
}

int main()
{

try{
cout<<"\t\t Enter Age:"<<endl;
int age;
cin>>age;

if(age>=18){
    cout<<"\t\t Valid age:"<<endl;
}
else{
    cout<<"\t\t invalid age"<<endl;
    throw 909;}


cout<<"\t\t if valid  age then store data and execute this method---"<<endl;
cout<<"\t\t Enter no1 no2"<<endl;
int i,j;
cin>>i>>j;
if(j>0){
int k=i/j;
cout<<"\t\t Division:"<<k<<endl;
}
else{
    throw -1;
}

}
catch(...)
{
cout<<"\t\t Error In Code:"<<endl;
}
cout<<"---------end of main--------"<<endl;
    return 0;
}