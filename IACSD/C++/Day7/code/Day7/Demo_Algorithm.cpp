#include<iostream>
#include<vector>
#include<algorithm>
#include<numeric>
using namespace std;

int main(){

    int ch;
    vector<int> myNumbers={10,20,30,40,50,60};
    int no;
     auto total=0;
    cout<<"\t\t 1:add number 2: show 3:search no 4:sort 5:reverse 6:sum of vector";
do{

    cout<<"\t\tEnter Choice";
    cin>>ch;
  switch (ch)
  {
  case 1:cout<<"\t\t Please Enter No:";
         cin>>no;
         //add number into vector
         myNumbers.push_back(no);
         cout<<"\t\t Added...."<<endl;
    
    break;
 case 2:for(int n:myNumbers){
         cout<<"\t\t\t"<<n<<endl;

          }
        break;
 case 3:cout<<"\t\t Enter Number:";
         cin>>no;
         for(int n:myNumbers){
            if(n==no){
                cout<<"\t\t\t Number is Present :"<<endl;
            }
         }
 
       break; 
    case 4://sort
    cout<<"\t\t\t  Sorted Vector "<<endl;
          sort(myNumbers.begin(),myNumbers.end()); 
          break;
    case 5:cout<<"\t\t\t  Reverse Sort "<<endl;
        reverse(myNumbers.begin(),myNumbers.end());
        break;
    case 6:cout<<"\t\t sum of vector elements :";
         total=accumulate(myNumbers.begin(),myNumbers.end(),0);
            cout<<total<<endl;
            break;
  default:
    break;
  }
}while(ch!=0);



}