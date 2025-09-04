#include <iostream>
#include <map>
#include <string>
using namespace std;

// Structure for Student
struct Student {
    string name;
    int marks;
};

// Global map with key = student ID
map<int, Student> students;

// Function to add a new student (Create)
void addStudent(int id, string name, int marks) {
    if (students.find(id) != students.end()) {
        cout << "Student with ID " << id << " already exists!\n";
        return;
    }
    students[id] = {name, marks};
    cout << "Student added successfully!\n";
}

// Function to display all students (Read)
void displayStudents() {
    cout << "\n--- Student List ---\n";
    if (students.empty()) {
        cout << "No records found.\n";
        return;
    }
    for (auto &p : students) {
        cout << "ID: " << p.first 
             << ", Name: " << p.second.name 
             << ", Marks: " << p.second.marks << endl;
    }
}

// Function to update student marks (Update)
void updateStudent(int id, int newMarks) {
    auto it = students.find(id);
    if (it != students.end()) {
        it->second.marks = newMarks;
        cout << "Student updated successfully!\n";
    } else {
        cout << "Student with ID " << id << " not found.\n";
    }
}

// Function to delete a student (Delete)
void deleteStudent(int id) {
    if (students.erase(id))
        cout << "Student deleted successfully!\n";
    else
        cout << "Student with ID " << id << " not found.\n";
}

int main() {
    int choice;
    do {
        cout << "\n==== Student CRUD Menu (map) ====\n";
        cout << "1. Add Student\n";
        cout << "2. Display Students\n";
        cout << "3. Update Student Marks\n";
        cout << "4. Delete Student\n";
        cout << "5. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        if (choice == 1) {
            int id, marks;
            string name;
            cout << "Enter ID: "; cin >> id;
            cout << "Enter Name: "; cin >> name;
            cout << "Enter Marks: "; cin >> marks;
            addStudent(id, name, marks);
        }
        else if (choice == 2) {
            displayStudents();
        }
        else if (choice == 3) {
            int id, marks;
            cout << "Enter ID to update: "; cin >> id;
            cout << "Enter new Marks: "; cin >> marks;
            updateStudent(id, marks);
        }
        else if (choice == 4) {
            int id;
            cout << "Enter ID to delete: "; cin >> id;
            deleteStudent(id);
        }
        else if (choice == 5) {
            cout << "Exiting...\n";
        }
        else {
            cout << "Invalid choice!\n";
        }
    } while (choice != 5);

    return 0;
}
