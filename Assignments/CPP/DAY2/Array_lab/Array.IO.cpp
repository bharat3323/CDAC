#include<iostream>
using namespace std;

int main(){

    int n;
    cout<<"enter the size: ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cout<<"enter the elemnet at "<<i <<" index=";
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}