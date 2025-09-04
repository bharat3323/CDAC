/*
Write a program to accept array  from user .
Accept number from user and search number is present in array or not.
*/

#include<iostream>
using namespace std;

int Search(int arr[],int n,int search){
for(int i=0;i<n;i++){
if(arr[i]==search){
    return 1;
}
}
}

int main(){
    int n;
    int search;
    cout<<"Enter the Size of Array: ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cout<<"Enter the "<<i<<" element: ";
        cin>>arr[i];
    }
    cout<<"Enter the elemnert to search: ";
    cin>>search;
    if(Search(arr,n,search)==1){
        cout<<"Element found!!!!"<<endl;
    }else{
        cout<<"Element not found!!!"<<endl;
    }
    return 0;
}