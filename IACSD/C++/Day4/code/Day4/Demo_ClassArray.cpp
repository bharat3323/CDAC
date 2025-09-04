#include<iostream>
using namespace std;

class Product
{
 private:   int prdid;
            string prdName;
            double price;
       
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
        
         //getters setters

         void setPrdName(string prdName){
            this->prdName=prdName;
         }
         string getPrdName(){
            return this->prdName;
         }
        void setPrice(double price){
            this->price=price;
        }
        double getPrice(){
            return this->price;
        }
};
int main(){

//create collection of Product type  for XYZ shop

Product shop[5];
//create First Product
Product prd1(101,"Pen",90);
Product prd2(102,"Color Box",190);
Product prd3(103,"Water Bottle",930);
Product prd4(104,"Xyz",40);
Product prd5(105,"Pqr",60);

//add product objects into array

shop[0]=prd1;
shop[1]=prd2;
shop[2]=prd3;
shop[3]=prd4;
shop[4]=prd5;

cout<<"\n \t\t------Display All Prds--------"<<endl;

int i=0;
for(i=0;i<5;i++){
    shop[i].show();
    cout<<"\n\t\t----------------------"<<endl;

}

cout<<"\n \t\t------Display Names Of Prdouct--------"<<endl;


for(i=0;i<5;i++){
   cout<<"\t\t Name:"<<shop[i].getPrdName();
    cout<<"\n\t\t----------------------"<<endl;

}


cout<<"\n \t\t------Display Price Of Prdouct--------"<<endl;


for(i=0;i<5;i++){
   
   cout<<"\t\t Price:"<<shop[i].getPrice();
    cout<<"\n\t\t----------------------"<<endl;

}


}