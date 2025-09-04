#include<iostream>
using namespace std;

 class Employee{
public:Employee(){
    cout<<"\t\t Employee Constructor"<<endl;

}
};
class Manager:public virtual Employee{
    public:Manager(){
        cout<<"\t\t\t Manager Constructor"<<endl;

    }
} ;
class SalesPerson:public virtual Employee{
    public:SalesPerson(){
        cout<<"\t\t\t SalesPerson Constructor"<<endl;

    }
} ;
class SalesManager:public Manager,public SalesPerson{

    public:SalesManager()
    {
        cout<<"\t\t\t\t SalesManager Constructor"<<endl;
    }

};
int main(){



    SalesManager sm;


}