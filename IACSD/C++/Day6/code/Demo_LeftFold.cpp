#include<iostream>
using namespace std;


template<typename... Args>
auto sum(Args...  args){

    return(...+args);
}

int main()
{
    cout<<"Sum="<<sum(1,2,3,4,5,6,7,8)<<endl;

    cout<<"Sum="<<sum(10,20,30,40)<<endl;
    cout<<"Sum="<<sum(10,20)<<endl;
}