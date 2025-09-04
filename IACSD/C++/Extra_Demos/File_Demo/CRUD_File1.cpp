#include <iostream>
#include <string.h>
#include <fstream>

using namespace std;


class Person{
	private:char name[20];
	        int age;
	        int id;
	public:Person(){}
	       Person(int id, const char *nm,int age){
	       	this->id=id;
	       	this->age=age;
	       	strcpy(name,nm);
		   }
		   void display(){
		   	cout<<id<<"   "<<name<<"   "<<age<<endl;
		   }
		   int getId(){
		   	return id;
		   }
		   
};
void write_file()
{
		cout<<"enter id name age "<<endl;
	int id,age;
	char name[20];
	cin>>id>>name>>age;
	Person p(id,name,age);
	p.display();
	
	ofstream fout;
	fout.open("person.dat", ios::app |ios::binary);
	cout<<"--file opend---"<<endl;
	fout.write((char *)&p,sizeof(Person));
	cout<<"----written successfully----"<<endl;
	fout.close();
	
}
void read_file(){
	ifstream fin;
	Person p;
	fin.open("person.dat",ios::binary);
	while(fin.read((char *)&p,sizeof(Person))){
		p.display();
	}
	fin.close();
}
 void search(int id){
 	ifstream fin;
	Person p;
	fin.open("person.dat",ios::binary);
	while(fin.read((char *)&p,sizeof(Person))){
	if(p.getId()==id)
		p.display();
	}
	fin.close();
 	
 }
 
 void modify(int id){
 //	cout<<"---size----"<<sizeof(Person)<<endl;
 cout<<"---total records---->"<<endl;
 	fstream fin;
	Person p;
	fin.open("person.dat", ios::binary | ios::in | ios::out);
	long no=-1L*static_cast<long>(sizeof(Person));
	while(fin.read((char *)&p,sizeof(Person))){
	
	if(p.getId()==id)
	{
	cout<<"---old vaues---"<<endl;
		p.display();
	cout<<" enter new id name age "<<endl;
	int id,age;
	char name[20];
	cin>>id>>name>>age;
	Person p1(id,name,age);
	
	fin.seekg(no,ios::cur);
	fin.write((char *)&p1,sizeof(Person));
	cout<<"----modifyed----:"<<no<<endl;
	
	}
	}
	
	
	
	fin.close();
	
 }
int main(){
	int ch,id;;
	cout<<"\n\t\t 1:write 2:read 3:search 4:update 5:delete "<<endl;
   do{
   	cout<<"enter ch "<<endl;
   	cin>>ch;
   	switch(ch){
   		case 1:
   			write_file();
   			break;
   		case 2:read_file();
   			break;
   		case 3:cout<<"enter id to search "<<endl;
   			cin>>id;
			 search(id);
			 break;	  
		case 4:cout<<"enter id to update "<<endl;
   				cin>>id;
				modify(id);
				break;
		case 5: int cnt = 0;
			    fstream file("person.dat", ios::out | ios::in | ios::binary);
			    file.seekg(0, ios::end);
			    long no = file.tellg();
			    cnt = no / sizeof(Person);
			    cout<<"---count--->"<<cnt<<endl;
			    break;
//   		default:cout<<"invalid"<<endl;
	   }
   	
   }while(ch!=0);


}
