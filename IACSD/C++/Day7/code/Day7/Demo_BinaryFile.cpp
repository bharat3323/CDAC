#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;

class Employee
{
    private :int no;
             char name[30];
             double salary;
    public:Employee()
            {
         no=0;
         name[0]='\0';
         salary=0.0;
            }
            Employee(int id, char *nm,double salary)
            {
            this->no=id;
            this->salary=salary;
            strcpy(name,nm);
            }
            void show()
            {
                cout<<"\n\t\t Details Of Employee "<<endl;
                cout<<"\t\t id="<<no<<endl;
                cout<<"\t\t name="<<name<<endl;
                cout<<"\t\t salary="<<salary<<endl;
cout<<"\t\t--------------------------"<<endl;
            }
};

void writeBinaryStream()
{
 ofstream  writeFile("Employee.dat",ios::binary|ios::app);

   cout<<"Enter Id Name Salary:";
   int id;
   char name[20];
   double salary;
   cin>>id>>name>>salary;
   Employee e1(id,name,salary); 
   //write e1 object into file
   //use write method

    writeFile.write(((char*)&e1),sizeof(Employee));

    cout<<"\t\t Employee data stored into binary file"<<endl;


 writeFile.close();//imp
}
void readBinaryStream()
{

    Employee e;
    
    ifstream inputfile("Employee.dat");
    if(!inputfile.fail())
    {
      while(inputfile.read((char*)&e,sizeof(Employee)))
      {
        e.show();
    }
}
}

int main()
{

   int ch;
    cout<<"\n\t\t 1:wite 2:read  3:search 4:update emp 5:delete  0:exit"<<endl;
    do{

    cout<<"\t\tEnter Choice";
  cin>>ch;
  switch (ch)
  {
  case 1:
       writeBinaryStream();
    break;
 case 2: readBinaryStream();
 
 break;
 case 3: break;  
  default:
    break;
  }
}while(ch!=0);





}