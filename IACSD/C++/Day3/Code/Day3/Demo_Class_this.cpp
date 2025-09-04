#include<iostream>
using namespace std;


class Book{
     private:int bookid;
             string name,author;
             double price;
    public:
           //constr
             Book(){
            cout<<"\t\t ----default constr-------"<<endl;
           cout<<"\n \t\t---New book Object Created At Loc:"<<this<<endl;

            bookid=10;
            name="Default Name";
            author="Vaishali";
            price=100;
          }
          Book(int bookid,string name,string author,double price){
            cout<<"------------Parameter---------"<<endl;

    this->bookid=bookid;
    this->name=name;
    this->author=author;
    this->price=price;




          }


          //bkObj2.displayDetails();
       void displayDetails()
       { 
cout<<"\t\t-----Book Details---------"<<endl;
cout<<"\t\tBookID :"<<this->bookid<<endl;
cout<<"\t\t Name :"<<this->name<<endl;
cout<<"\t\t Author :"<<this->author<<endl;
cout<<"\t\t Price :"<<this->price<<endl;


       }

     //to moify individual data memebrs
     //write seprate methods to read and to assign value to data member

     //getters setters
     //getters are used for reading individual data member
     //get author of book
     string getAuthor(){
        return author;
     }
  //write getters for bookid,name,price

  //setters:to update/edit
  //writeOnly
  void setAuthor(string newAuthorName)
   {
    this->author=newAuthorName;
   }


};

int main(){
    Book bkObj1;//
    cout<<"bkObj1  created at loc:"<<&bkObj1<<endl;
    bkObj1.displayDetails();



    Book bkObj2(707,"Learn CPP","Jems K",800);//
   bkObj2.displayDetails();
   cout<<"Book Aouthor Name:"<<bkObj2.getAuthor();

   cout<<"Change Name ";
   string str;
   cin>>str;

   bkObj2.setAuthor(str);
   bkObj2.displayDetails();
   

}