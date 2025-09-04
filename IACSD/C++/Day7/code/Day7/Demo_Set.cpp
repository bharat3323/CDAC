#include<iostream>
#include<set>
using namespace std;


int main()
{

int ch,no;
    
cout<<" 1:add number 2:show 3:serach 4:clear "<<endl;

set<int> mySet;
    do{
cout<<"\t\t Enter ch:";     
     cin>>ch;
  switch (ch)
  {
  case 1:cout<<"\t\t Enter no:";  
        cin>>no;
       cout<<"\t\t\t inserted:"<<mySet.insert(no).second<<endl;
    break;
 case 2:  for(int n:mySet){
          cout<<"\t\t\t "<<n<<endl;
 }
      break;
 case 3: break;  
  default:
    break;
  }
}while(ch!=0);






}