#include<iostream>
using namespace  std;

class ParentClass
{
    protected :int  data;
    public:ParentClass(){
        cout<<"\t\t-------Parent Class Default----"<<endl;

    }
        virtual void display(){
        //impLogic();//
        cout<<"\t\t Parent Class Data Member:"<<endl;

      }
private :void impLogic(){

         cout<<"\t\t ------IMP Logic------"<<endl;

}

};
class Child1:public ParentClass{

    public :Child1(){
        cout<<"\t\t ----Child1 Class Constr-----"<<endl;

    }
         void child1Method(){
            cout<<"\t\t----Child1 Specific Methods------"<<endl;
         }
       
         //override parent class method
         void display(){

            //call display function of parent class
           // ParentClass::display();//
            cout<<"\t\t ----Child1 DAta Member-----"<<endl;
         }
};

class Child2:public ParentClass{

    public :void display(){
        cout<<"\t\t----******------ Child2 Data Members-----------"<<endl;

    }
    void child2Function()
    {
        cout<<"\t\t-------Child2 Methods-------"<<endl;
    }
     
};
int main(){

ParentClass p;

p.display();

cout<<"\n"<<endl;

Child1 ch1;//ParentConstr---->ChildConstr

//ch1.child1Method();//child class
cout<<"\n\n"<<endl;
ch1.display();//parent class


cout<<"\n\n"<<endl;
Child2 c2;
c2.display();


//can we create array of class type?YES



cout<<"\n \t\t----------BaseClassPointer---------"<<endl;
//BaseClass Pointer :hold address of any child class obj
ParentClass *basePtr;
basePtr=&c2;//ParentClassType=ChildClassTYpe :UpCasting

basePtr->display();
//can basePtr access Child1 specific method
//basePtr->child1Method();//compile error
//how to solve this?

//Do Type Casting:
//1:static_cast:compile time type casting
//2:dynamic_cast:run time type casting
Child1 *chObj= static_cast<Child1*>(basePtr);//DownCasting
//childclass=parent class//explicit downcasting
chObj->child1Method();//solution:

//NOte:static_cast will just resolve compiletime error
//but may in run time error will be there related to type casting

//so use dynamic_cast to do casting at time of execution
//RTTI:Run Time Type Identification






// ParentClass arr[3];
// arr[0]=p;//parent obj;
// arr[1]=ch1;//child1 obj
// arr[2]=c2;//child2 obj
// cout<<"\n\n\n\t\t------------------------------"<<endl;
// for(int i=0;i<3;i++){
//     arr[i].display();//
// }

}
