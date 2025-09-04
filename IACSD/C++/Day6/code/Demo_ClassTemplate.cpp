#include<iostream>
using namespace std;

template<class T>
class MyGenericClass
{
    private :T value1,value2;
    public:MyGenericClass(T v1,T v2){
        this->value1=v1;
        this->value2=v2;

    }
    void display()
    {
        cout<<"\t\t value1="<<value1<<"     value2="<<value2<<endl;;
    }
};
int main()
{
    MyGenericClass obj(23,34);

    obj.display();
    MyGenericClass strObj("abc","  xyz");
    strObj.display();
}