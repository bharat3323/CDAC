#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {10, 20, 30};

    // Add elements
    v.push_back(40);
    v.push_back(50);

    cout << "Vector elements: ";
    for (int x : v) cout << x << " ";
    cout << endl;

    // Access element
    cout << "First element: " << v.front() << endl;
    cout << "Last element: " << v.back() << endl;

    return 0;
}
