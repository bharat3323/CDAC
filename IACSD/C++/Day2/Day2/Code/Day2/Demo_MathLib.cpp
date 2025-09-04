#include <iostream>
#include <cmath>   // header file for math functions
using namespace std;

int main() {
    double num = 9.0, angle = 45.0;

    // Basic math functions
    cout << "Square root of " << num << " = " << sqrt(num) << endl;
    cout << "Power (2^3) = " << pow(2, 3) << endl;
    cout << "Absolute value of -15 = " << abs(-15) << endl;

    // Rounding functions
    cout << "Floor of 7.8 = " << floor(7.8) << endl;
    cout << "Ceil of 7.2 = " << ceil(7.2) << endl;
    cout << "Round of 7.5 = " << round(7.5) << endl;

    // Trigonometric functions (angles in radians)
    double rad = angle * 3.14159 / 180; // convert degrees → radians
    cout << "sin(45°) = " << sin(rad) << endl;
    cout << "cos(45°) = " << cos(rad) << endl;
    cout << "tan(45°) = " << tan(rad) << endl;

    // Logarithmic functions
    cout << "Log base e of 10 = " << log(10) << endl;
    cout << "Log base 10 of 100 = " << log10(100) << endl;

    return 0;
}
//ceil(x) returns the smallest integer greater than or equal to x.

//It always rounds UP to the nearest integer, no matter the decimal value.
// ceil(x)

// Returns the smallest integer greater than or equal to x.

// Always rounds UP.


// round(x)

// Returns the nearest integer to x.

// If the fractional part is ≥ 0.5 → rounds UP, otherwise rounds DOWN.

// For negative numbers, it still goes to the nearest integer.