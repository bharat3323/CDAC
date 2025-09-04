/*
 Create a class ComplexNumber with data members real, imaginary. Create Default and Parameterized constructors.
  Write getters and setters for all the data members.  Also add the display function. 
  Create the object of this class in main method and invoke all the methods in that class.
*/

#include <iostream>
using namespace std;

class ComplexNumber {
private:
    int real, imaginary;

public:
    ComplexNumber() {
        real = 0;
        imaginary = 0;
    }
    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }
    void setReal(int r) {
        real = r;
    }
    int getReal() {
        return real;
    }
    void setImaginary(int i) {
        imaginary = i;
    }
    int getImaginary() {
        return imaginary;
    }
    void display() {
        if (imaginary >= 0)
            cout << real << " + " << imaginary << "i" << endl;
        else
            cout << real << " - " << -imaginary << "i" << endl;
    }
};

int main() {
    ComplexNumber c1;
    c1.display();

    ComplexNumber c2(3, 4);
    c2.display();

    c1.setReal(5);
    c1.setImaginary(-7);
    cout << "Real: " << c1.getReal() << endl;
    cout << "Imaginary: " << c1.getImaginary() << endl;
    c1.display();

    return 0;
}
