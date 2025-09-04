/*
. Search an Element (Linear Search)**

   * Input an array and search if a number exists.
*/

#include<iostream>
using namespace std;

int search(int arr[],int n,int search){
    for(int i=0;i<n;i++){
        if(arr[i]==search){
            return 1;
        }
    }
    return 0;
}

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
    int search1;
    cout<<endl <<"Enter the Serach element: ";
    cin>>search1;
    if(search(arr,n,search1)){
        cout<<"Element found !!!!";
    }else{
        cout<<"Element not found!!!!!";
    }
}