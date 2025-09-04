#include <iostream>
using namespace std;

class Date {
public:
    int day;
    int month;
    int year;

    Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    Date(int day, int month, int year) {
        this->day = day;
        this->month = month;
        this->year = year;
    }

    void Accept() {
        cout << "Enter the day: ";
        cin >> day;
        cout << "Enter the month: ";
        cin >> month;
        cout << "Enter the year: ";
        cin >> year;
    }

    void display() {
        cout << day << "|" << month << "|" << year;
    }
};

class Employee {
public:
    int id;
    string name;
    Date dob;

    Employee() {
        id = 1;
        name = "xyz";
        dob = Date();
    }

    Employee(int id, string name, Date dob) {
        this->id = id;
        this->name = name;
        this->dob = dob;
    }

    void Accept() {
        cout << "Enter Emp id: ";
        cin >> id;
        cout << "Enter the Emp name: ";
        cin >> name;
        cout << "Enter the DOB: " << endl;
        dob.Accept();
    }

    void display() {
        cout << "Id = " << id << endl;
        cout << "Name = " << name << endl;
        cout << "DOB = ";
        dob.display();
        cout << endl;
    }
};

int main() {
    cout << "====== Using default constructor =====" << endl;
    Employee e1;
    e1.Accept();
    e1.display();

    cout << "====== Using parameterized constructor =====" << endl;
    Date d(15, 8, 2000);
    Employee e2(101, "bharat", d);
    e2.display();

    return 0;
}
