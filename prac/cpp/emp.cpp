#include<iostream>
using namespace std;

class Emp{

    protected:
            int id;
            string name;
            int deptid;
            double basicsal;

    public: 
        Emp(int id,string name,int deptid,double basicsal){
            this->id=id;
            this->name=name;
            this->deptid=deptid;
            this->basicsal=basicsal;
        }
        //method will override in base class
   virtual double computeNetsal(){
        return 0;
     }
     //method can be override in the base class
     virtual void display(){
        cout<<"Id "<<id;
        cout<<"name "<<name;
        cout<<"deptid "<<deptid;
        cout<<"basicsal "<<basicsal;
     }         

};

class Mgr : public Emp{
    protected:
            double perfBonus;
    
    public :
            Mgr(int id,string name,int deptid,double basicsal,double perfBonus)
            :Emp(id,name,deptid,basicsal){
            this->perfBonus=perfBonus;
     }
     double computeNetsal(){
        return basicsal +perfBonus;
     }
     void display(){
        Emp::display();
        cout<<"perfBonus: "<< perfBonus;
        cout<<"Net Salary"<<computeNetsal();
     }
};

class Worker : public Emp{

    private:
    double hoursWorked;
    double hourlyRate;

    public:
     Worker(int id,string name,int deptid,double basicsal,double hoursWorked,double hourlyRate)
     :Emp(id,name,deptid,basicsal){
        this->hourlyRate=hourlyRate;
        this->hoursWorked=hoursWorked;
     }
     double computeNetSal(){
        return basicsal+(hourlyRate*hoursWorked);
     }

            double gethourlyRate(){
                return hourlyRate;
            }
        void display(){
            Emp::display();
            cout<<"hoursWorked "<<hoursWorked;
            cout<<"hourlyRated "<<hourlyRate;
            cout<<"Net salary of worker"<<computeNetSal();
        }
};

int main(){
    const int size=100;
    Emp * arr[size];
    int count=0;

    int choice;
    do{
        cout<<"\n --------Organization Menu----------\n";
        cout<<"\n1.Hire Manger\n";
        cout<<"\n2. Hire Worker\n";
        cout<<"\n3.Display all Employee\n";
        cout<<"\n4. Exit\n";
        cout<<"\nEnter your choice: ";
        cin>>choice;
        if(choice==1){
            int id,deptid;
            string name;
            double basicsal,perfBonus;

            cout<<"Enter Id, Name,Deptid,BasicSalary,PerfBonus";
            cin>>id>>name>>deptid>>basicsal>>perfBonus;
            arr[count++]=new Mgr(id,name,deptid,basicsal,perfBonus);
        }
        else if (choice==2){
              int id,deptid,hoursWorked;
            string name;
            double basicsal,hourlyRate;

            cout<<"Enter Id, Name,Deptid,BasicSalary,hoursworked,hourlyrate";
            cin>>id>>name>>deptid>>basicsal>>hoursWorked>>hourlyRate;
            arr[count++]=new Worker(id,name,deptid,basicsal,hoursWorked,hourlyRate);
        }else if(choice==3){
            cout<<"-----employee details------";
            for(int i=0;i<count;i++){
                arr[i]->display();
               // cout<<"netsal: "<<arr[i]->computeNetsal()<<endl;
            }
        }
        else if(choice==4){
            cout<<"exiting....\n";
        }else{
            cout<<"invalid choice\n";
        }
    }
    while (choice!=4);
        //cleanup code
        for(int i=0;i<count;i++){
            delete arr[i];
        }
    return 0;
}