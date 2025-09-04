//Write a menu driven program to do following operations :
//a) Compute area of circle
// b) Compute area of rectangle
// c) Compute area of triangle

// d) Exit
// Display menu, ask choice to the user, depending on choice accept the parameters and perform the 
// operation. Continue this process until user selects exit option.

#include <iostream>
using namespace std;

int main() {
    int choice;

    while (true) {
        // Display menu
        cout << "\nMenu:\n";
        cout << "1. Compute area of circle\n";
        cout << "2. Compute area of rectangle\n";
        cout << "3. Compute area of triangle\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                double r;
                cout << "Enter the radius of the circle: ";
                cin >> r;
                cout << "Area of Circle is: " << 3.14 * r * r << endl;
                break;
            }

            case 2: {
                double l, b;
                cout << "Enter the length and breadth of the rectangle: ";
                cin >> l >> b;
                cout << "Area of Rectangle is: " << l * b << endl;
                break;
            }

            case 3: {
                double b, h;
                cout << "Enter the base and height of the triangle: ";
                cin >> b >> h;
                cout << "Area of Triangle is: " << 0.5 * b * h << endl;
                break;
            }

            case 4:
                cout << "Exiting the program." << endl;
                return 0;

            default:
                cout << "Invalid input! Please try again." << endl;
        }
    }

    return 0;
}
