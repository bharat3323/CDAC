#include<iostream>
using namespace std;

//has-a :containment
//is-a :inheritance

class Date{
private :int d,m,y;
  public:       Date(){
            d=10;
            m=10;
            y=2010;
         }
         Date(int d,int m,int y)
         {
            this->d=d;
            this->m=m;
            this->y=y;
         }
         void disp()
         {
            cout<<"Date:"<<d<<":"<<m<<":"<<y<<endl;
         }
};

class Student
{
    private:int rollno;
            string name;
            Date dob;//

    public:Student(int rollno,string name,int d,int m,int y)
    {
        this->rollno=rollno;
        this->name=name;
        this->dob=Date(d,m,y);
    }
    void display()
    {
        cout<<"Rollno "<<rollno;
        cout<<" Name:"<<name;
        dob.disp();//date
    }
};

int main()
{

    Student std(190,"Abc",15,12,2002);
    std.display();
}