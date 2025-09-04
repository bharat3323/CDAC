#include<iostream>
using namespace std;

class Shape{
    int a;

public: Shape(){a=100;
    cout<<"\t\t Shape Class Constr";}
virtual void area()=0;//abstract method or pure vitual function
       //can we have normal/implemented methods in astract class:YES
       void disp(){
        cout<<"\t\t------- This is Abstract class disp method"<<endl;

       }
     

};
//abstract class must be inherited by child class

class Circle:public Shape
{
// virtual method must be override by child class
public :void area(){
       cout<<"\t\t---circle area-----"<<endl;
}
};
class Rectangle:public Shape{
    public:void area(){
        cout<<"\t\t---react area----"<<endl;
    }
};
int main(){

    
//Shape s;
//s.area();
//s.disp();

Circle c;
c.disp();//shape
c.area();//circle

Rectangle r;
r.disp();
r.area();


}