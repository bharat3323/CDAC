#include<iostream>
using namespace std;


class ParentClass{
    private:int a;

    public: ParentClass(){
        cout<<"\n\t\t ---------Parent Default---------"<<endl;
    }
    ParentClass(int a){
         cout<<"\n\t\t ---------Parent parameter---------"<<endl;
   this->a=a;
    }
         void parentFunction(){
        cout<<"\t\t ------This is Parent Class Function----------"<<endl;

    }
         void ParentFunction2()
         {
            cout<<"\t\t parent-----------------------"<<endl;
         }
};

//create ChildClass from ParentClass
class ChildClass :public ParentClass
{
    private :int x;
    public:ChildClass()
    {
        cout<<"\n\t\t ------Child Default-------"<<endl;

    }
    ChildClass(int a,int x ):ParentClass(a)
    {
          cout<<"\n\t\t ---------Child Parameter---------"<<endl;
  this->x=x;
    }
public: void childFunction(){
        cout<<"\t\t ------This is Child Class Function----------"<<endl;

    }
};

int main(){

//    ParentClass pObj;

//    ChildClass cObj;

    // pObj.parentFunction();//parent class method
    // cObj.childFunction();//child class method
    // cObj.parentFunction();//child class obj can access parent class method
    // cObj.ParentFunction2();

    //can Parent access functions of Child :NO


    //Parameter Constr
    ChildClass c(10,20);//

}