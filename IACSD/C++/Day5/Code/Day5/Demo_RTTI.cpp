#include<iostream>
using namespace std;

class Car{
public: virtual void speed(){
    cout<<"\n\t\t Basic Speed Of Car:60km/hr"<<endl;
}
};
class MiniCar:public Car{

    public:void speed(){
         cout<<"\n\t\t Mini Car speed:60km/hr"<<endl; 
    }
};
class SUV:public Car{

    public :void speed(){
        cout<<"\n\t\t SUV Car speed :250km/hr"<<endl;
    }
          void safety(){
            cout<<"\t\t SUV Specific Methods"<<endl;

          }
};

class Racing:public Car{
    public :void speed(){
        cout<<"\n\t\t Racing Car speed :380km/hr"<<endl;
    }
    void startNOS(){
        cout<<"\t\t Racing car Specific Methods"<<endl;
    }
};

int main(){
//Upcasting:
//DownCasting:

//Dynamic Binding
Car c;
SUV Thar;
Racing Ferrari;
MiniCar nano;

//BaseClass Pointer  compile Time:Car
Car *basePtr=&Thar;//UpCasting RuntimeType: SUV
basePtr->speed();//SUV-->speed()

//as basePtr holding ref of SUV can we call safety() ?NO

//to invoke child class specific function using basePtr
//do downcasting
//HOW:2 ways  1:static_cast:compile time 2:dynamic_cast
//to give run time type safety use RTTI
//What is RTTI: Run Time Type Identification

//how to do RTTI
//use typeid

if(typeid(*basePtr)==typeid(SUV)){
    cout<<"\t\t dynamically basPtr holding address of SUV type"<<endl;
    //safe downCasting
    //Forcefully convert basePtr into type SUV
    SUV *obj=dynamic_cast<SUV*>(basePtr);
    obj->safety();
}
else
{
  cout<<"\t\t NOT  of SUV type"<<endl;
  
}


//create array


Car *arr[3];
arr[0]=&c;//car
arr[1]=&Thar;//Thar
arr[2]=&Ferrari;

cout<<"\n\t\t use of overrding ad RTTI and DwnCasting"<<endl;
//use of overrding ad RTTI and DwnCasting
for(int i=0;i<3;i++){

    arr[i]->speed();//
    //if in array we have suv car added
    //then invoke methods of suv
    //to do this use RTTI
    //step 1: find the type using typeid
    if(typeid(*arr[i])==typeid(SUV)){
        cout<<"\t\t *********SUV**********"<<endl;
    //Step2: downcast using dynamic_cast
   SUV *obj=dynamic_cast<SUV*>(arr[i]);
   obj->safety();//
    }//chk for Racing car
    else if(typeid(*arr[i])==typeid(Racing)){
        //cast to Racing

     Racing *obj1=dynamic_cast<Racing*>(arr[i]);
     obj1->startNOS (); 
    }

}

}