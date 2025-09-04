#include<iostream>
using namespace std;

class parent{
    private:
        int a ;
    public:
        parent(){
            cout<<"Inside the default constructor of parent:"<<endl;
        }
    public:
        parent(int a){
            cout<<"Inside the paramertized constructor of parent:"<<endl;
            this->a=a;
        }       
        void dispaly(){
            cout<<"value of a in parent: "<<a <<endl;
        } 
};
class child : public parent{
    private:
        int b;
    public: 
        child(){
            cout<<"Inside the default constructor of child:"<<endl;
        }  
    public :
        child(int a,int b):parent(a){
            cout<<"Inside the paramertized constructor of child:"<<endl;
            this->b=b;
        }      
};


int main(){
  // parent p; //object of the parent 
child c(10,20);
//p.dispaly();//this print the garbage value;
c.dispaly();

}