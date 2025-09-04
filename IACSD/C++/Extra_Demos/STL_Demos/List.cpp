#include <iostream>
#include <list>
using namespace std;

int main() {
    list<string> names = {"Alice", "Bob", "Charlie"};

    names.push_front("Zara");
    names.push_back("David");

    cout << "List elements: ";
    for (auto &n : names) cout << n << " ";
    cout << endl;

    names.sort();  // sort list
    cout << "Sorted: ";
    for (auto &n : names) cout << n << " ";
    return 0;
}
