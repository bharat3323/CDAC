//Create menu driven program for Pizza Shop.And display total amount


#include <iostream>
using namespace std;

int main() {
    int choice, quantity;
    char again;
    float total = 0;

    do {
        cout << "====== Welcome to the Pizza Shop ======\n";
        cout << "Menu:\n";
        cout << "1. Margherita Pizza - $8.00\n";
        cout << "2. Pepperoni Pizza  - $10.00\n";
        cout << "3. Veggie Pizza     - $9.00\n";
        cout << "4. Cheese Burst     - $11.00\n";
        cout << "5. Exit\n";
        cout << "Enter your choice (1-5): ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter quantity for Margherita Pizza: ";
                cin >> quantity;
                total += quantity * 8.0;
                break;
            case 2:
                cout << "Enter quantity for Pepperoni Pizza: ";
                cin >> quantity;
                total += quantity * 10.0;
                break;
            case 3:
                cout << "Enter quantity for Veggie Pizza: ";
                cin >> quantity;
                total += quantity * 9.0;
                break;
            case 4:
                cout << "Enter quantity for Cheese Burst: ";
                cin >> quantity;
                total += quantity * 11.0;
                break;
            case 5:
                cout << "Thank you for visiting!\n";
                break;
            default:
                cout << "Invalid choice. Please select from the menu.\n";
        }

        if (choice != 5) {
            cout << "Do you want to order more? (y/n): ";
            cin >> again;
        } else {
            break;
        }

    } while (again == 'y' || again == 'Y');

    cout << "\n====== BILL ======\n";
    cout << "Total amount: $" << total << endl;
    cout << "Thank you! Please visit again.\n";

    return 0;
}
