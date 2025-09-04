#include<iostream>
using namespace std;

class Box{
    int h;

public:Box(int h){
     this->h=h;
}
    void disp(){
    cout<<"--------------------"<<h<<endl;
}
};

int main(){
    Box b1(3);//default constr
    b1.disp();
}