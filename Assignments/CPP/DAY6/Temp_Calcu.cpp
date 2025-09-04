/*
Class Template – Calculator
 Create a class template Calculator<T> with functions:
 add(), subtract(), multiply(), divide().
 Test with int and double.
*/

#include <iostream>
using namespace std;

// Class template
template <typename T>
class Calculator {
private:
    T num1, num2;

public:
    // Const
    Calculator(T a, T b) {
        num1 = a;
        num2 = b;
    }

    // Functions
    T add() {
        return num1 + num2;
    }

    T subtract() {
        return num1 - num2;
    }

    T multiply() {
        return num1 * num2;
    }

    T divide() {
        if (num2 != 0)
            return num1 / num2;
        else {
            cout << "Error: Division by zero!" << endl;
            return 0;
        }
    }
};
int main() {
    
    Calculator<int> intCalc(10, 5);
    cout << "Int Add: " << intCalc.add() << endl;
    cout << "Int Sub: " << intCalc.subtract() << endl;
    cout << "Int Mul: " << intCalc.multiply() << endl;
    cout << "Int Div: " << intCalc.divide() << endl;

    
    Calculator<double> doubleCalc(5.5, 2.2);
    cout << "Double Add: " << doubleCalc.add() << endl;
    cout << "Double Sub: " << doubleCalc.subtract() << endl;
    cout << "Double Mul: " << doubleCalc.multiply() << endl;
    cout << "Double Div: " << doubleCalc.divide() << endl;

    return 0;
}

