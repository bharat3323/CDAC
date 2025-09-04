#include<iostream>
using namespace std;

int Res(int num){
int fac=1;
for(int i=1;i<=num;i++){
    fac=fac*i;
}
return fac;
}
int main(){
    int num;
    cout<<"Enter the number: ";
    cin>>num;
    int result=Res(num);
    cout<<result;

}