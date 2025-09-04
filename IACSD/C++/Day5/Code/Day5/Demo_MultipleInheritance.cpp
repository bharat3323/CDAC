#include<iostream>
using namespace std;

class Parent1{
    public :void disp(){
        cout<<"\t\t Parent 1"<<endl;

    }
    void add(){
        cout<<"\t\t Parent1 Add"<<endl;
    }
};
class Parent2{
    public :void show(){
        cout<<"\t\t Parent 2"<<endl;

    }
    void add(){
        cout<<"\t\t Parent2 Add"<<endl;
    }
};

class Child1 :public Parent1,public Parent2{


    public:void print(){
        cout<<"\t\t Child Print"<<endl;
    }

    //Type 2:
    void add(){

        //decide 
        Parent1::add();

    }

};

int main(){

    Child1 c;
    c.print();
    c.show();
    c.disp();

    //c.add();//error
    //type 1:
    c.Parent1::add();
    c.Parent2::add();
    //or
     c.add();
}