/* Class Template – Box
 Implement a class template Box<T> that stores one value of any type and provides          getValue() and setValue() methods.*/

 #include<iostream>
 using namespace std;

 template <class T>

 class box{
    private:
        T value;
    // public:
    // box(T V){
    //     value=V;
    // }
    // void Display(){
    //     cout<<"Value: "<<value;
    // }
    
    public:
        void setvalue(T v){
            value=v;
        }
        T getvalue(){
            return value;
        }

 };
 int main(){
    box<int> obj;
    obj.setvalue(42);
    cout<<"int value:"<<obj.getvalue()<<endl;

    box<double> obj1;
    obj1.setvalue(42.05);
    cout<<"double value:"<<obj1.getvalue()<<endl;

    box<string> obj2;
    obj2.setvalue("bharat");
    cout<<"String value:"<<obj2.getvalue()<<endl;
    
    return 0;
    
 }


 //theory
// *
//  A class template allows you to write a generic 
//  class where the type is a parameter, so the same code works for 
//  int , double, string, or even custom objects.
//  /