/*
Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade.

*/

#include <iostream>
using namespace std;

class Student {
private:
    int rollno;
    int marks1, marks2, marks3;

public:
    void acceptInfo() {
        cout << "Enter Roll No: ";
        cin >> rollno;
        cout << "Enter Marks 1: ";
        cin >> marks1;
        cout << "Enter Marks 2: ";
        cin >> marks2;
        cout << "Enter Marks 3: ";
        cin >> marks3;
    }

    int getTotal() {
        return marks1 + marks2 + marks3;
    }

    float getPercentage() {
        return (getTotal() / 3.0);  
    }

    char getGrade() {
        float perc = getPercentage();
        if (perc >= 75) return 'A';
        else if (perc >= 60) return 'B';
        else if (perc >= 50) return 'C';
        else if (perc >= 40) return 'D';
        else return 'F';
    }

    void display() {
        cout << "\nStudent Details:\n";
        cout << "Roll No: " << rollno << endl;
        cout << "Marks: " << marks1 << ", " << marks2 << ", " << marks3 << endl;
        cout << "Total: " << getTotal() << endl;
        cout << "Percentage: " << getPercentage() << "%" << endl;
        cout << "Grade: " << getGrade() << endl;
    }
};

int main() {
    Student s;
    s.acceptInfo();
    s.display();

    return 0;
}
