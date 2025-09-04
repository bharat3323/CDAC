#ifndef BOOK_H
#define BOOK_H
#include<iostream>
using namespace std;
//declaration of Book class
class Book
{
    private :int bookid;
             string name;
             string author;
             double price;
     public:Book();
            Book(int id,string name,string author,double price);

            void display();
            string getName();
            string getAuthor();
            //getters and setter
};
#endif