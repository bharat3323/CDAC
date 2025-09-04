/*
Sort Array (Ascending & Descending)**

   * Implement a simple bubble sort.
*/

#include<iostream>
using namespace std;

void bubble(int arr[],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

void display(int arr[],int n){
     for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
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
    cout<<"Array Before bubble sort: ";
    display(arr,n);
    cout<<endl;
    cout<<"Array after sorting: " ;
    bubble(arr,n);
    display(arr,n);
}