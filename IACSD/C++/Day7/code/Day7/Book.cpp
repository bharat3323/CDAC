#include "Book.h"//imp
#include<iostream>
using namespace std;

//implemantation of Book.h
//default constr
Book::Book(){
    cout<<"----default constr of Book-----"<<endl;

}
//parameter constr
Book::Book(int bookid,string name,string author,double price){
    cout<<"-----BookParameter constr-----"<<endl;
    this->bookid=bookid;
    this->name=name;
    this->price=price;
    this->author=author;
}
//display
void Book::display(){
    cout<<"\t\t Book Details"<<endl;
    cout<<"BookId:"<<bookid<<endl;
    cout<<"name:"<<name<<endl;
    cout<<"author:"<<author<<endl;
    cout<<"price:"<<price<<endl;
}
//getters
string Book::getName(){
    return name;
}
string Book::getAuthor()
{
    return author;
}
