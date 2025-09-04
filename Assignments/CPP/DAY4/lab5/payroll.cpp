/*
Consider that payroll software needs to be developed for computerization of
operations of an ABC organization. The organization has employees.
3.1. Construct a class Employee with following members using private access
specifies:
 Employee Id integer
 Employee Name string
 Basic Salary double
 HRA double
 Medical double=1000
 PF double
PT double
 Net Salary double
 Gross Salary double
Please use following expressions for calculations://Note:Don't accept HRA,PF PT from user
 * HRA = 50% of Basic Salary
* PF = 12% of Basic Salary
* PT = Rs. 200

3.2. Write methods to display the details of an employee and calculate the gross
and net salary.
* Goss Salary = Basic Salary + HRA + Medical
* Net Salary = Gross Salary – (PT + PF)

Create Object of employee class and assign values and display Details.*/

#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    int empId;
    string empName;
    double basicSalary;
    double hra;
    double medical;
    double pf;
    double pt;
    double grossSalary;
    double netSalary;

public:
    
    Employee() {
        empId = 0;
        empName = "Unknown";
        basicSalary = 0;
        hra = 0;
        medical = 1000;  
        pf = 0;
        pt = 200;        
        grossSalary = 0;
        netSalary = 0;
    }

    void accept() {
        cout << "Enter Employee ID: ";
        cin >> empId;
        cout << "Enter Employee Name: ";
        cin>> empName;
      //  getline(cin, empName);
        cout << "Enter Basic Salary: ";
        cin >> basicSalary;

        calculate();  
    }

    void calculate() {
        hra = 0.50 * basicSalary;
        medical = 1000;
        pf = 0.12 * basicSalary;
        pt = 200;
        grossSalary = basicSalary + hra + medical;
        netSalary = grossSalary - (pf + pt);
    }

    
    void display() {
        cout << "\n--- Employee Salary Details ---" << endl;
        cout << "Employee ID: " << empId << endl;
        cout << "Employee Name: " << empName << endl;
        cout << "Basic Salary: " << basicSalary << endl;
        cout << "HRA (50% of Basic): " << hra << endl;
        cout << "Medical Allowance: " << medical << endl;
        cout << "PF (12% of Basic): " << pf << endl;
        cout << "PT: " << pt << endl;
        cout << "Gross Salary: " << grossSalary << endl;
        cout << "Net Salary: " << netSalary << endl;
    }
};

int main() {
    Employee e1;
    e1.accept();
    e1.display();

    return 0;
}
