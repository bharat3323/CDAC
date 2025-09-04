#include<iostream>
using namespace std;
 enum colors{ RED=1,GREEN=2,BLUE=3,WHITE=4,BLACK=5};

int main(){
   

cout<<"\t\t\t---------------ENUM Demo---------"<<endl;

cout<<"\t\t 1:Red 2:Green 3:Blue 4:White 5:Black "<<endl;
int choice;
cin>>choice;

//convert int into enum
//do the conversion at the time compilation
//static :compile time
//casting :conversion 

colors mycol=static_cast<colors>(choice);
cout<<"  Color :"<<mycol<<endl;

colors myFavcol;
switch (mycol)
{
case RED :cout<<" You Selecetd Red"<<endl;
          myFavcol=RED;
         break;
case GREEN: cout<<"You Selected Green"<<endl;
    break;
default:
    break;
}



}