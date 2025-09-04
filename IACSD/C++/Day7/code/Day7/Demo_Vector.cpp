#include"Book.h"
#include<iostream>
#include<vector>
using namespace std;

int main()
{
vector<Book> myLib;

cout<<"1:Add Book 2:Show Book 3:Get Book By Id 4: All Authors 0:exit"<<endl;

int id;
string name,author;
double price;
int ch;
Book *newBook;//pointer
do{
cout<<"enter choice:";
cin>>ch;
switch (ch)
{
case 1:cout.width(10);
       cout<<"Enter Id name author price ";
    cin>>id>>name>>author>>price;
    newBook=new Book(id,name,author,price);
            //add newBook in vector
            myLib.push_back(*newBook);
            cout<<"Book Added......"<<endl;
    /* code */
    break;
case 2://show all books
       for(Book b:myLib){
        cout.width(10);
        b.display();
       }
   break;
 case 3:
     cout<<"Enter Id";
      break;
case 4: for(Book b:myLib){
         cout.width(10);
        cout<<b.getAuthor()<<endl;
       }
 break;

default:
    break;
}

}while(ch!=0);




}