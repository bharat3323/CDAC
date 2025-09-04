#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> s = {30, 10, 20, 10};  // duplicate ignored

    s.insert(25);
    s.insert(5);

    cout << "Set elements: ";
    for (int x : s) cout << x << " ";  // sorted automatically
    cout << endl;

    if (s.find(20) != s.end())
        cout << "20 is present in set" << endl;

    return 0;
}
