/*
1 Solve this.
Fresh business scenario to apply inheritance , polymorphism   to emp based organization scenario.

Create Emp based organization structure --- Emp , Mgr , Worker


1.1 Emp state--- id(int), name, deptId , basicSalary(double)
Accept all of above in constructor arguments.

Methods ---
1.2. compute net salary ---ret 0
(eg : public double computeNetSalary(){return 0;})

1.2 Mgr state  ---id,name,basic,deptId , perfBonus
Add suitable constructor
Methods ----
1. compute net salary (formula: basic+perfBonus) -- override computeNetSalary


1.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Methods : 
1.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
2. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)
Create suitable array to store organization details.
Provide following options
1. Hire Manager
I/P : all manager details

2. Hire Worker  
I/P : all worker details

3. Display information of all employees net salary (by invoking computeNetSal), 

4. Exit
*/
#include <iostream>
#include <string>
using namespace std;

// ================= BASE CLASS =================
class Emp {
protected:
    int id;
    string name;
    int deptId;
    double basicSalary;

public:
    Emp(int id, string name, int deptId, double basicSalary) {
        this->id = id;
        this->name = name;
        this->deptId = deptId;
        this->basicSalary = basicSalary;
    }

    virtual double computeNetSalary() {   //made virtual to override this method in the below child case
        return 0;
    }

    virtual void display() {
        cout << "ID: " << id
             << ", Name: " << name
             << ", Dept: " << deptId
             << ", Basic: " << basicSalary;
    }

    virtual ~Emp() {} // virtual destructor
};

// ================= MANAGER =================
class Manager : public Emp {
private:
    double perfBonus;

public:
    Manager(int id, string name, int deptId, double basicSalary, double perfBonus)
        : Emp(id, name, deptId, basicSalary){
            this->perfBonus=perfBonus;
        } // t’s used to initialize data members (or base classes) before the body of the constructor runs.

    double computeNetSalary()  {
        return basicSalary + perfBonus;
    }

    void display()  {
        Emp::display();
        cout << ", PerfBonus: " << perfBonus;
    }
};

// ================= WORKER =================
class Worker : public Emp {
private:
    int hoursWorked;
    double hourlyRate;

public:
    Worker(int id, string name, int deptId, double basicSalary, int hoursWorked, double hourlyRate)
        : Emp(id, name, deptId, basicSalary){
            this->hoursWorked=hoursWorked;
            this->hourlyRate=hourlyRate;
        }
    double computeNetSalary()  {
        return basicSalary + (hoursWorked * hourlyRate);
    }

    double getHourlyRate() {
        return hourlyRate;
    }

    void display()  {
        Emp::display();
        cout << ", Hours: " << hoursWorked
             << ", HourlyRate: " << hourlyRate;
    }
};

// ================= MAIN =================
int main() {
    const int SIZE = 100;        // capacity
    Emp* arr[SIZE];              // array of base class pointers
    int count = 0;               // how many employees added

    int choice;
    do {
        cout << "\n--- Organization Menu ---\n";
        cout << "1. Hire Manager\n";
        cout << "2. Hire Worker\n";
        cout << "3. Display All Employees\n";
        cout << "4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        if (choice == 1) {
            int id, deptId;
            string name;
            double basicSalary, perfBonus;

            cout << "Enter ID, Name, DeptId, BasicSalary, PerfBonus: ";
            cin >> id >> name >> deptId >> basicSalary >> perfBonus;

            arr[count++] = new Manager(id, name, deptId, basicSalary, perfBonus);
        }
        else if (choice == 2) {
            int id, deptId, hoursWorked;
            string name;
            double basicSalary, hourlyRate;

            cout << "Enter ID, Name, DeptId, BasicSalary, HoursWorked, HourlyRate: ";
            cin >> id >> name >> deptId >> basicSalary >> hoursWorked >> hourlyRate;

            arr[count++] = new Worker(id, name, deptId, basicSalary, hoursWorked, hourlyRate);
        }
        else if (choice == 3) {
            cout << "\n--- Employee Details ---\n";
            for (int i = 0; i < count; i++) {
                arr[i]->display();
                cout << ", NetSalary: " << arr[i]->computeNetSalary() << endl;
            }
        }
        else if (choice == 4) {
            cout << "Exiting...\n";
        }
        else {
            cout << "Invalid choice!\n";
        }
    } while (choice != 4);

    // cleanup heap memory
    for (int i = 0; i < count; i++) {
        delete arr[i];
    }

    return 0;
}



//Without menu driven code

//int main() {
//     Emp* e1 = new Manager(101, "Alice", 10, 50000, 15000);
//     Emp* e2 = new Worker(102, "Bob", 20, 30000, 50, 200);

//     cout << "Manager Net Salary: " << e1->computeNetSalary() << endl;
//     cout << "Worker Net Salary: " << e2->computeNetSalary() << endl;

//     cout << "\nDetails:\n";
//     e1->display();
//     e2->display();

//     // Worker specific method
//     Worker* w = dynamic_cast<Worker*>(e2);
//     if (w) {
//         cout << "Worker Hourly Rate: " << w->getHourlyRate() << endl;
//     }

//     delete e1;
//     delete e2;
//     return 0;
// }