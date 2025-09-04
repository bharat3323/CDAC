#include <iostream>
using namespace std;

// define enum
enum Day { MONDAY = 1, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

int main() {
    int choice;
    Day today;

    cout << "Enter a number (1-7) for the day of the week: ";
    cin >> choice;

    if (choice < 1 || choice > 7) {
        cout << "Invalid choice!" << endl;
        return 0;
    }

    today = static_cast<Day>(choice);  // convert int to enum

    switch (today) {
        case MONDAY: cout << "You chose Monday" << endl; break;
        case TUESDAY: cout << "You chose Tuesday" << endl; break;
        case WEDNESDAY: cout << "You chose Wednesday" << endl; break;
        case THURSDAY: cout << "You chose Thursday" << endl; break;
        case FRIDAY: cout << "You chose Friday" << endl; break;
        case SATURDAY: cout << "You chose Saturday" << endl; break;
        case SUNDAY: cout << "You chose Sunday" << endl; break;
    }

    return 0;
}
