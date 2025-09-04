#include"Book.h"
#include<iostream>
using namespace std;

int main(){

Book bk1(202,"MyBook","Vaishali",900);
bk1.display();

cout<<"----------------"<<endl;
cout<<"Name:"<<bk1.getName()<<"      Author:"<<bk1.getAuthor()<<endl;



}