#include<iostream>
using namespace std;

class Test{
    private :int *data;

    public:Test(){
cout<<"-----object get created and data is stored at loc:"<<data<<endl;
        //store on heap
        data=new int(10);
        //value 10 get stored on heap

    }
         Test(int data){
cout<<"-----object get created and data is stored at loc:"<<this->data<<endl;
        //store on heap
        this->data=new int(data);
        //value 10 get stored on heap
         }
        //copy constr
        Test( Test &obj){
            this->data=new int(*obj.data);

cout<<"\t\t----copy constr----data at loc:"<<data<<endl;
        }
         void setData(int data){
            *this->data=data;
        }
         void show(){

            cout<<"\t\t Data:"<<*data<<endl;

         }
         ~Test(){
            cout<<"\t\t Object Get Destroyed for Data At:"<<data<<endl;
          delete data;
        }
};

int main()
{

Test t1(100);

//Test t2=t1;//copy
//or
Test t2(t1);// 
t2.show();

cout<<"\t\t change data of object t1 "<<endl;
t1.setData(900);

cout<<"\t\t change in orignal object"<<endl;
t1.show();//900
t2.show();//

}