#include<iostream>
using namespace std;


void add(){
    cout<<"\t\t Add()"<<endl;
}
void add(int i){
    cout<<"\t\t Add(i)"<<endl;
}
void add(int a,int b){
    cout<<"\t\t Add(a,b)"<<endl;
}
void add(double d){
    cout<<"\t\t Add(double)"<<endl;
}
void add(double d1,double d2){
    cout<<"\t\t Add(d1,d2)"<<endl;
}
void add(int a,double d){
    cout<<"\t\t Add(int,double)"<<endl;
}
void add(double a,int d){
    cout<<"\t\t Add(double ,int )"<<endl;
}

// void main(int a,int b){}

int main(){

add();
add(1);
add(1,2);
add(12.23,10);
add(1,23.33);
add(23.33,78.88);
add(33.444);

}