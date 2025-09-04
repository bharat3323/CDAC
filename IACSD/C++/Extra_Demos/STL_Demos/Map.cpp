#include <iostream>
#include <map>
using namespace std;

int main() {
    map<int, string> students;

    students[1] = "Alice";
    students[2] = "Bob";
    students[3] = "Charlie";

    cout << "Student list:" << endl;
    for (auto &p : students)
        cout << p.first << " => " << p.second << endl;

    return 0;
}
