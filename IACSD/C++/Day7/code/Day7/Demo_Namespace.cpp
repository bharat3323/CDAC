#include<iostream>
using namespace std;


//
namespace  DAC{
class Student{
 public: void display()
 { 
    std::cout<<"\t\t DAC Student "<<std::endl;
 }
};
}
namespace DBDA{
class Student{
 public: void displayDbda()
 { 
    cout<<"\t\t DBDA Student "<<endl;
 }
};
}
int main()
{
    DAC::Student std1;
    std1.display();//


    DBDA::Student std2;
    std2.displayDbda();//

}