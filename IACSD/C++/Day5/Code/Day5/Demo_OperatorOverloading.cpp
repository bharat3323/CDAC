#include<iostream>
using namespace std;


class ComplexNumber{

    int r,i;
    public:ComplexNumber(int r,int i){
        this->i=i;
        this->r=r;

    }
    void display(){
        cout<<"Real:"<<r<<" Imagnery:"<<i<<"i"<<endl;
    }

    //operator overloading
//  ComplexNumber complex3=complex1+complex2;
//complex1 object is invoking +
ComplexNumber  operator +( const ComplexNumber& obj)
{
    //how to get complex1 object here
    //complex1 is responsible for invoking operator +
    //ComplexNumber complex3=complex1+complex2;
    //  this keyword will hold address of complex1
     //to get i number from complex1 use  this->i  
     //
     int i1=this->i+obj.i;
     int r2=this->r+obj.r;
     //this is ne complexNumber 
     ComplexNumber result(r2,i1);//
     return result;
           //
}

};

int main(){

    ComplexNumber complex1(10,20);
    ComplexNumber complex2(30,40);

    ComplexNumber complex3=complex1+complex2;
    complex1.display();
    complex2.display();
    complex3.display();

}