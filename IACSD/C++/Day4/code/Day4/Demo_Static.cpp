#include<iostream>
using namespace std;


class Student{
    private:  int rollno;
            string name;
            string email;

            static int rollNoCounter;
            static int counter;//single copy created
    
            public: Student(){}
            Student(string name,string email){
                counter=counter+1;

                rollNoCounter=rollNoCounter+1;

                this->rollno=rollNoCounter;
                this->name=name;
                this->email=email;

                

            }
            void show(){
                cout<<"\n\t\t----------Details-------"<<endl;
                cout<<"\t\t RollNo:"<<rollno<<"   Name:"<<name<<"     email:"<<email<<"    Total:"<<counter<<endl;

            }

            static void showCount(){
                //static functions can access only static data members
                //
                
                cout<<"\t\t Total Student Created:"<<counter<<endl;
            }

};
int Student::counter=0;//
int Student::rollNoCounter=100;

int main(){

cout<<"\t\t----------static -------------"<<endl;



Student std1("Ram","ram@gmail.com");
std1.show();
Student std2("Sham","sham@gmail.com");
std2.show();
Student std3("Manoj","manoj@gmail.com");
std3.show();



//how to access static functions
//uing class name

Student::showCount();

std1.show();
std2.show();
std3.show();


}