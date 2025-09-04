#include<iostream>
#include<set>
using namespace std;


int main()
{
    set<int> myset;
    myset.insert(10);
    myset.insert(40);
    myset.insert(15);
    myset.insert(7);
     cout<<"\t\t\t------100-----"<<myset.insert(15).second<<endl;
    
    for(int i:myset)
    {   cout.width(10);
        cout.fill('*');
        cout<<i<<endl;
    }
    cout<<"----------------"<<endl;
   auto d=myset.find(10);
   
   if(d!=myset.end()){

    cout<<"find"<<endl;
   }
   else{
    cout<<"not find"<<endl;
   }

   //
   myset.erase(7);

}