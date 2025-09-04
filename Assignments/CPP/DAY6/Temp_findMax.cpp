/*Function Template – Maximum
 Write a function template findMax() that returns the maximum of two values.


Test with int, float, and char.
*/
#include<iostream>
using namespace std;

template<class T>

T findMax(T &a,T &b){
    return (a>b)?a:b;
}
    int main(){
        int a=10,b=15;
        cout<<findMax(a,b)<<endl;
        char ch='a',ch1='b';
        cout<<findMax(ch,ch1)<<endl;
        float f=10.5,f1=11;
        cout<<findMax(f,f1)<<endl;
    }
