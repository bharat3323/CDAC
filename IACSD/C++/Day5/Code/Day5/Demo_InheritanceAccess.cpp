#include<iostream>
using namespace std;

class Parent{

    private: int privateData;
    public:int publicData;
    protected:int protectedData;

};
class Child1:protected Parent{
    private:int childPrivate;
    public:int childPublic;
    protected:int childProtected;
    public: void testAccess(){
           //can we access protectd data member of parent in child:YES
         protectedData=10;
           //can we access private data member of parent in child:NO
        //can we access public data member of parent in child:YES
       
       publicData=110;
    }
};
int main(){


    Child1 c1;
    //c1.publicData=100;//in case of private inheritance not accessible 

//c1.publicData=900;//
}

