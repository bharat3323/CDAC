#include<iostream>
#include<map>
using namespace std;

class Student{
    private :int id;
             string name;
             double marks;
   public:Student(int i,string nm ,double mks):id(i),name(nm),marks(mks)
   {

   }
};
int main()
{

    //create map for storing Student
    map<int,Student> iacsd;
    
    Student s1(101,"Nitin",89);
    iacsd[101]=s1;

//map is key value
//key:int
//value:string
map<int,string>  myMap;
myMap[101]="Ram";//key value  101:Ram
myMap[102]="Sham";
myMap[103]="Ramesh";
myMap[104]="Nisha";
myMap[101]="Manoj";//
//display map
for(auto key:myMap){
    cout<<"\t\t Key:"<<key.first<<"     Value:"<<key.second<<endl;
}

//MENU driven CRUD using Map using int ,string
//same using User Def Data Type i.e class 
}

