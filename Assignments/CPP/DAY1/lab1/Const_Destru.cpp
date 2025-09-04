#include<iostream>
using namespace std;

class Demo{
    int * data;
    public :
        Demo(){
            cout<<"inside the default constuctor"<<endl;
        }
        Demo(int data){
            cout<<"inside the parametrized constructor"<<endl;
            this->data=new int(3);

        }
        //rules:destructor name must be same class
        ~Demo(){
            cout<<"Destructor:"<<endl;
            delete data;
        }
};
int main(){
    Demo d(10);
}