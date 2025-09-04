#include<iostream>
using namespace std;

class Product
{
 private:   int prdid;
            string prdName;
            double price;
        //     Product(int id){
        //   cout<<"-----private------"<<endl;
        //     }
  public://default constr
         Product(){
            cout<<"\t\t ------Product created------default constr--------"<<endl;
            prdid=1;
            prdName="default name";
            price=10.00;

         }          

         Product(int prdid,string prdName,double price){
            cout<<"\n\t\t ----Product Created with Parameter Constr-------"<<endl;
            
            this->prdid=prdid;
            this->prdName=prdName;
            this->price=price;
         }
         void show(){
            cout<<"\n\t\t------Details---------"<<endl;
            cout<<"\t\t PrdId:"<<prdid<<endl;
            cout<<"\t\t Name:"<<prdName<<endl;
            cout<<"\t\t Price:"<<price<<endl;
         }


};

int main(){

//to access class data we need to create an object of class
Product obj1;//default constr
obj1.show();

cout<<"\t\t Enter PrdId Name Price "<<endl;
int prdid;
string name;
double price;
cin>>prdid>>name>>price;

//create another object of Product class
Product obj2(prdid,name,price);//parameter
obj2.show();


//store object on heap memory

Product *ptr=new Product(801,"Bottle",250);
ptr->show();
delete ptr;//imp

}