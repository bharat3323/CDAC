/*
1:Create Date class with members day,month ,year.
Write no argument and parameterised constructor .Create two object s and initialize them
 using no argument and parameterised constructor
respectively.Print date using display function.
*/

#include<iostream>
using namespace std;
class Date{

public:
int day;
int month;
int year;

public:
    Date(){
day=0;
month=0;
year=0;
}
     Date(int day,int month,int year){
    this->day=day;
    this->month=month;
    this->year=year;
}

void display(){
    cout<<day<<"|"<<month<<"|"<<year<<endl;
}
};
int main(){
    Date d2;
    d2.display();
    Date d1(10,20,30);
    d1.display();
    return 0;
}