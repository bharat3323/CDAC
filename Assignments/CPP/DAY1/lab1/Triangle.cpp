#include<iostream>
using namespace std;

int main(){
    int A,B,C;
    cout<<"Enter the Angle of Triangle: ";
    cin>>A>>B>>C;
    int sum=A+B+C;
    if(sum==180){
        cout<<" Triangle is Valid"<<endl;
    }else{
        cout<<"IS NOT VALID TRIANGLE"<<endl;
    }

}