#include <iostream>
using namespace std;

long long ipow(int x, int n) {
    long long r = 1;
    while (n--) r *= x;
    return r;
}

int main() {
    long long num;
    if (!(cin >> num)) return 0;
    if (num < 0) { cout << "Not Armstrong\n"; return 0; }
    long long temp = num;
    int digits = 0;
    do { digits++; temp /= 10; } while (temp);
    long long sum = 0;
    temp = num;
    while (temp) {
        int d = temp % 10;
        sum += ipow(d, digits);
        temp /= 10;
    }
    if (sum == num) cout << "Armstrong\n";
    else cout << "Not Armstrong\n";
    return 0;
}
