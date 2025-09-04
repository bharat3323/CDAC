#include<iostream>
using namespace std;


int main(){

int rollno;
char name[20];
double per;

cout<<" \t\t Enter RollNO:";
cin>>rollno;

cout<<"\t\t Enter Name ";
cin>>name;//without space

cout<<"\t\t Per :";
cin>>per;

char address[50];
cin.ignore();//imp
cout<<"Enter Address :";
cin.getline(address,50);//with space 

cout<<"\t\t  "<<rollno<<"     "<<name<<"     "<<per<<" Address:"<<address<<endl;

//string is class USerDefData Type

string str;
cout<<"Enter email ";
cin>>str;//without space
cout<<" Email :"<<str;
//with space 
string description;
cin.ignore();
getline(cin,description);//with space
cout<<"Description:"<<description;
}