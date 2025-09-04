/*
 Create a class Book with data members as bname,id,author,price. Write getters and setters for all the 
data members. Also add the display function. Create Default and Parameterized constructors. Create 
the object of this class in main method and invoke all the methods in that class.
*/


#include<iostream>
using namespace std;

class Book {
private:
    string bname, author;
    int id;
    float price;

public:
    Book() {
        bname = "";
        author = "";
        id = 0;
        price = 0.0;
        cout << "Inside default constructor" << endl;
    }

    Book(string bname, int id, string author, float price) {
        this->bname = bname;
        this->id = id;
        this->author = author;
        this->price = price;
    }

    void setBname(string b) { 
        bname = b; 
    }
    string getBname() 
    { return bname;
     }

    void setId(int i) {
         id = i;
         }
    int getId() {
         return id;
         }

    void setAuthor(string a) { 
        author = a; 
    }
    string getAuthor() { 
        return author;
     }

    void setPrice(float p) {
         price = p; 
        }
    float getPrice() { 
        return price; 
    }

    void display() {
        cout << "Book Name: " << bname << endl;
        cout << "Book ID: " << id << endl;
        cout << "Author: " << author << endl;
        cout << "Price: " << price << endl;
    }
};

int main() {
    Book b1;
    b1.setBname("C++ Basics");
    b1.setId(101);
    b1.setAuthor("Bjarne Stroustrup");
    b1.setPrice(499.99);
    b1.display();

    Book b2("Java Programming", 102, "James Gosling", 599.99);
    b2.display();

    return 0;
}
