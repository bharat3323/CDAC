#include<iostream>
#include<vector>
using namespace std;

class Student{

    private :string name;
    public :Student(string name){this->name=name;}
            void display()
            {
                cout<<"\t\t Name:"<<name<<endl;
            }
 };

int main()
{
    //client code

    cout<<"\t\t Vector Demo "<<endl;
    vector<int> myNumbers={12,3,4,56};
    cout<<"\t\t  size:"<<myNumbers.size()<<endl;

     cout<<"\t\t  isEmpty:"<<myNumbers.empty()<<endl;

cout<<"\t\t Add Element in Vector:";
int no;
cin>>no;
myNumbers.push_back(no);
cout<<"\t\t  size:"<<myNumbers.size()<<endl;


cout<<"\t\t Vector For Student "<<endl;
//create vector for student
vector<Student> myStuds;
cout<<"\t\t Size:"<<myStuds.size()<<endl;
cout<<"\t\t isEmpty:"<<myStuds.empty()<<endl;

for(int i=0;i<5;i++){
cout<<"\t\t Enter 5  Student name ";
string name;
cin>>name;
//create an object of Student
Student s1(name);
myStuds.push_back(s1);
}
cout<<"\t\t  myStuds Size:"<<myStuds.size()<<endl;



cout<<"\t\t Show All Numbers from Vector"<<endl;


vector<int>::iterator it1=myNumbers.begin();
vector<int>::iterator it2=myNumbers.end();

while (it1!=it2)
{
   cout<<"\t\t "<<*it1<<endl;
   it1++;
}

//

// vector<Student>::iterator itStart=myStuds.begin();
// vector<Student>::iterator itEnd=myStuds.end();

// while (itStart!=itEnd)
// {
//     itStart->display();
//     itStart++;
// }


for(auto &s:myStuds){
    s.display();
}

}
