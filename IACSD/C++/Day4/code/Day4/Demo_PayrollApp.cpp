#include<iostream>
using namespace std;

class Employee{
private:int empid;
        string name;
protected:double salary;//accessible in child class
public:Employee(){
       empid=101;
       name="ram";
       salary=10000;
         }
         Employee(int empid,string name,double salary)
         {
            this->empid=empid;
            this->name=name;
            this->salary=salary;

         }

        void display(){
            cout<<"\n \t\t-------------Employee----------"<<endl;
            cout<<"\t\t Empid:"<<empid<<endl;
            cout<<"\t\t NAme:"<<name<<endl;
            cout<<"\t\t Salary:"<<salary<<endl;

        }
       
        void calSalary()
        {
            cout<<"\t\t Employee Salary:"<<salary<<endl;

        }
    };

  
class Manager:public Employee
{
    private: string deptName;
             double incentives;
    public:
           Manager(){
            deptName="No Dept";
            incentives=1000;
           }   
         Manager(int empid,string name,double salary,string deptName,double incentives):Employee(empid,name,salary)
         {
            this->deptName=deptName;
            this->incentives=incentives;

         }

    //hides/overrides Employee class calSalary
    void calSalary(){
        cout<<"\t\t-----------Manager CalSalary---------"<<endl;
    cout<<"\t\t MAnager Salary+Incentives:"<<salary+incentives<<endl;
    }
    
         void assignTask()
       {
        cout<<"\t\t------Manager Task---------"<<endl;
       }

} ; 
  

class SalesPerson:public Employee{
    int pa,fa,ta;
    public:SalesPerson(){
        pa=100;
        fa=100;
        ta=100;

    }
    SalesPerson(int empid,string name,double salary,int pa,int fa,int ta):Employee(empid,name,salary)
    {
this->pa=pa;
this->fa=fa;
this->ta=ta;
    }


    //override Emplyee calSalary
    void calSalary(){
        cout<<"\t\t--------SalesPErson Salary---------"<<endl;
        cout<<"\t\t SalesPerson="<<salary+pa+fa+ta<<endl;
    }
    void sendReport(){

        cout<<"\t\t-----------SalesPerson Report-----------"<<endl;
    }

};

    int main()
    {
Employee emp1(101,"Vaishali",45000);
emp1.display();
emp1.calSalary();

cout<<"\n\n\t\t------------Manager----------"<<endl;

Manager mgr(201,"Rahul",60000,"IT",30000);
mgr.calSalary();//parent class
mgr.assignTask();
mgr.display();//Employee

cout<<"\n\n\t\t------------SalesPerson----------"<<endl;
SalesPerson sp(303,"Manoj",40000,5000,5000,5000);
sp.calSalary();
sp.display();
sp.sendReport();


//

    }