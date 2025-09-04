/*
 Reverse Array**

   * Reverse an array and display the result.
*/

#include<iostream>
using namespace std;

void rev(int arr[],int n){
    int start=0,end=n-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
    void display(int arr[],int n){
    
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
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
    cout<<"original array: ";
    display(arr,n);

    rev(arr,n);
    cout<<"reveerse array: ";
    display(arr,n);
    return 0;
}