#include<iostream>
using namespace std;


class Test{
private:int *data;

public:Test(){
    cout<<"\t\t Default constructor----object get created----"<<endl;

     data=new int(3);//on heap
}
Test(int data){
    cout<<"\t\t parameter constructor----object get created----"<<endl;
    //this->data=data;
    this->data=new int(data);
}

//destructor
//rules:destructor name must be same class
 ~Test(){
cout<<"\t\t--------Object get destroyed-------"<<endl;
delete data;//imp
}
};
int main(){

Test t1;//constr
Test t2(10);//constr


}
