/*
2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members. 
Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class. 
*/


#include<iostream>
using namespace std;

class Date {
private:
    int dd, mm, yy;

public:
    Date() {
        dd = 1; mm = 1; yy = 2000;
        cout << "Inside default constructor" << endl;
    }

    Date(int dd, int mm, int yy) {
        this->dd = dd;
        this->mm = mm;
        this->yy = yy;
    }

    void setday(int d) { dd = d; }
    void setmon(int m) { mm = m; }
    void setyear(int y) { yy = y; }

    int getday() { return dd; }
    int getmon() { return mm; }
    int getyear() { return yy; }

    void display() {
        cout << "Date is: " << dd << "/" << mm << "/" << yy << endl;
    }
};

int main() {
    Date d;
    d.setday(10);
    d.setmon(8);
    d.setyear(2025);
    d.display();

    Date d2(31, 12, 2024);
    d2.display();

    return 0;
}
