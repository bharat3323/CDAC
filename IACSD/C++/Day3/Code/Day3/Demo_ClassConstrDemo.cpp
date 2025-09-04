
#include<iostream>
using namespace std;

class Date{
        //data members
    private:int day,month,year;


    public:
    //Constructor
    //Why?to initialise data members 
    //how?rules:
    //1:constr name must be same as class name
    //2:no return type not even void

//when get called?
//as soon as object of class get created

    //types of constr
    //1:default constr:constr with no arguments
    //2:parameter constr:constr with args

    //write default constr for Date class

    Date(){
cout<<"\t\t--------default constr of Date class--------"<<endl;
    //initialise data members
    day=1;
    month=6;
    year=1950;
    }
   
    //parameter constr
    Date(int d,int m,int y){
        cout<<"\t\t---------Parameter Constr Date class------"<<endl;
       
        day=d;
        month=m;
        year=y;

        
  
    }

    void displayDate()
    {
        cout<<"\t\t Date:"<<day<<"-"<<month<<"-"<<year<<endl;
    }
};

int  main()
{
 Date dob;//dob is an object of Date class :

dob.displayDate();//

//store 250 students dob using Date class
//how many objects need to create?

Date ramDob(8,5,2000);//parameter constr of Date class invoked

ramDob.displayDate();//8-5-2000





}