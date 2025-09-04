#include<iostream>
#include<fstream>
using namespace std;

//write data into file
void writeFile()
{
    cout<<"\t\t Writing data into File"<<endl;

    string filename="mydata.txt";
    //write: ofstream
    ofstream outfile(filename,ios::app);
    //
    //cout<<"Data will get display on console....";
    //write data into file
    outfile<<"This is My Data i am writing into file "<<endl;
    outfile<<" This is Names of Students"<<endl;
    
    cout<<"Enter Name of Student:";
    string name;
    cin>>name;
    outfile<<name<<endl;
    //close file
    outfile.close();//imp
    cout<<"\t\t Writing Data into file Done......"<<endl;


}

//read data from file
void readFile()
{
    cout<<"\t\t read data from File"<<endl;
    string filename="mydata.txt";
  //
  ifstream inputfile(filename);
  
  string line;
  if(inputfile.fail())
  {
cout<<"\t\t file not found:";
  }
   else{
 cout<<"\t\t Read from file:";
  
  //read line by line

  while(getline(inputfile,line))
   {
     cout<<line<<endl;
  }



   }

  inputfile.close();//imp



}
int main()
{

    //Menu
    cout<<"1:Write File 2:Read File 3:";

    int ch;
    do{

     cout<<"\n\t\tEnter Choice";
     cin>>ch;
  switch (ch)
  {
  case 1: writeFile();
          break;
 case 2: readFile();
         break;
 case 3: //Lab Task:copy data from one file into another
        break;  
  default:
    break;
  }
}while(ch!=0);


}


