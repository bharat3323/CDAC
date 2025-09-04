#include<iostream>
using namespace std;

class Student{
    //data members(attributes):used for description
    //private:inside class only
    private:int rollno;
            string name;
            string email;
             double per;
    //member function:operation done by class
     public:
         void exam();

         void showResult(){
cout<<"\t\t Student Result"<<endl;
         }
         void showDetails(){
cout<<"\t\t ----Student Details------"<<endl;

   cout<<"\t\t RollNO="<<rollno<<endl;
   cout<<"\t\t Name="<<name<<endl;
   cout<<"\t\t email="<<email<<endl;
   cout<<"\t\t Per="<<per<<endl;


         }
};//imp

//outside class
void Student:: exam(){
cout<<"----exam-----"<<endl;
}

int main()
{

//how to use class
//to access data member and member functions from class
//create an object of class
//syntax:classname objName;

Student obj1;
//how to call member function?
//using object only
obj1.showResult();
cout<<"\n\n"<<endl;
obj1.showDetails();
obj1.exam();

//220




}