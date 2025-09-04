#include<iostream>
using namespace std;

class product{
    private:
        int pid;
        string pname;
        int price;
     
     public:
        product(){
            cout<<"Product is created ----default const----"<<endl;
            pid=101;
            pname="soap";
            price:120;
        }
        product(int pid,string pname,int price){
            cout<<"Inside the paramertised the const:"<<endl;
            this->pid=pid;
            this->pname=pname;
            this->price=price;
        }
        void display(){
            cout<<"product id: "<<pid<<endl;
            cout<<"product name: "<<pname<<endl;
            cout<<"product price: "<<price<<endl;
        }   
};
int main(){
    product p;
    cout<<"enter the the pid pname and price of product:"<<endl;
    int pid;
    string pname;
    int price;
    //cin>>pid>>pname>>price;
   // product p2(pid,pname,price);
   // p2.display();

    //now we wanted to store on the heap:

    product *ptr=new product(101,"soap",500);
    ptr->display();
    delete ptr;    //destroying the constructor
    ptr->display();//after destroying the obj it will show garbage value
    
}