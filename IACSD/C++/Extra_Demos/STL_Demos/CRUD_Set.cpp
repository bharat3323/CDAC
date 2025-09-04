#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> numbers;
    int choice, value, newValue;

    do {
        cout << "\n--- CRUD Menu using set ---\n";
        cout << "1. Create (Insert)\n";
        cout << "2. Read (Display)\n";
        cout << "3. Update\n";
        cout << "4. Delete\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1: // Create
            cout << "Enter value to insert: ";
            cin >> value;
            if (numbers.insert(value).second) {
                cout << "Inserted successfully.\n";
            } else {
                cout << "Value already exists (no duplicates allowed).\n";
            }
            break;

        case 2: // Read
            cout << "Elements in set: ";
            for (int x : numbers) {
                cout << x << " ";
            }
            cout << endl;
            break;

        case 3: // Update
            cout << "Enter value to update: ";
            cin >> value;
            if (numbers.find(value) != numbers.end()) {
                cout << "Enter new value: ";
                cin >> newValue;
                numbers.erase(value);
                numbers.insert(newValue);
                cout << "Updated successfully.\n";
            } else {
                cout << "Value not found.\n";
            }
            break;

        case 4: // Delete
            cout << "Enter value to delete: ";
            cin >> value;
            if (numbers.erase(value)) {
                cout << "Deleted successfully.\n";
            } else {
                cout << "Value not found.\n";
            }
            break;

        case 5:
            cout << "Exiting...\n";
            break;

        default:
            cout << "Invalid choice. Try again.\n";
        }
    } while (choice != 5);

    return 0;
}
