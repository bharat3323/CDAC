/*Basic Template Assignments
Function Template – Swap
 Write a function template swapValues() that swaps two variables of any type.


Test with int, double, and string.
*/

#include <iostream>
using namespace std;
template<class T>
    T swapno(T &n1, T &n2){
        T temp=n1;
        n1=n2;
        n2=temp;
    }


int main(){
    int n1=100,n2=200;
   char ch1='a',ch2='b';
   string str="bharat";
   string str1="Bhandari";
   swapno(n1,n2);
 
   cout<<"Number after Swap n1= "<<n1<<endl;
   cout<<"Number after swap n2= "<<n2<<endl;
  swapno(ch1,ch2);
   cout<<"charscter after Swap ch1= "<<ch1<<endl;
   cout<<"character after swap ch2= "<<ch2<<endl;
   swapno(str,str1);
    cout<<"String after Swap ch1= "<<str<<endl;
   cout<<"String after swap ch2= "<<str1<<endl;
   
   

}