/*
Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade.
*/
#include<iostream>
using namespace std;
class student{
  public:
    int rollno;
float marks1,marks2,marks3;
    public:
    void acceptInfo(){
        cout<<"Enter the rollno: ";
        cin>>rollno;
         cout<<"Enter the marks1: ";
        cin>>marks1;
         cout<<"Enter the marks2: ";
        cin>>marks2;
         cout<<"Enter the marks3: ";
        cin>>marks3;
        
    }
    float total_marks(){
        return marks1+marks2+marks3;
    }
    float percentage(){
        return (total_marks()/300.0f)*100;
    }

   char grade() {
        float per = percentage();
        if (per >= 75)
            return 'A';
        else if (per >= 60)
            return 'B';
        else if (per >= 50)
            return 'C';
        else if (per >= 40)
            return 'D';
        else
            return 'F';
    }
    void display(){
        cout<<"\n-------Student display--------\n";
        cout<<"Rollno: "<<rollno<<endl;
        cout<<"narks1: "<<marks1<<endl;
        cout<<"marks2: "<<marks2<<endl;
        cout<<"marks3: "<<marks3<<endl;
        cout<<"total marks: " << total_marks()<<endl;
        cout<<"percentage: " << percentage()<<endl;
        cout<<"grade: "<<grade()<<endl;
    }

};
int main(){
    student s;
    s.acceptInfo();
    s.display();
}