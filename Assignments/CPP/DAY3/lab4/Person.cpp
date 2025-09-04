/*
1. Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class. 

*/
#include <iostream>
using namespace std;

class Person {
private:  
    string name;
    string city;
    int age;

public:
   
    Person() {
        cout << "Inside default constructor" << endl;
    }


    Person(string name, string city, int age) {
        this->name = name;
        this->city = city;
        this->age = age;
    }


    void setName(string n) {
        name = n;
    }

    void setCity(string c) {
        city = c;
    }

    void setAge(int a) {
        age = a;
    }

    string getName() {
        return name;
    }

    string getCity() {
        return city;
    }

    int getAge() {
        return age;
    }

   
    void display() {
        cout << "Person Name: " << name << endl;
        cout << "City: " << city << endl;
        cout << "Age: " << age << endl;
    }
};

int main() {

    Person p1;
    p1.setName("Bharat"); //getter setter+default constructor
    p1.setCity("pune");
    p1.setAge(22);

    cout << "\nDetails of p1:" << endl;
    p1.display();

    cout << "\n-----------------------\n";

    // Using parameterized constructor
    Person p2("Amit", "Mumbai", 25);

    cout << "\nDetails of p2:" << endl;
    p2.display();

    return 0;
}
