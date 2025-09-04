#include <iostream>
#include <cmath>
using namespace std;

bool CheckArm(int num) {
    int original = num;
    int count = 0;
    int res = 0;

    
    int temp = num;
    while (temp != 0) {
        count++;
        temp /= 10;
    }
    
    
    temp = num;
    while (temp != 0) {
        int rem = temp % 10;
        res += pow(rem, count);
        temp /= 10;
    }

    return res == original;
}

int main() {
    int num;
    cout << "Enter the number: ";
    cin >> num;

    if (CheckArm(num)) {
        cout << "Number is Armstrong" << endl;
    } else {
        cout << "Number is not Armstrong" << endl;
    }

    return 0;
}
