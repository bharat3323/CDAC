/*
Second Largest Element**

   * Find the second largest number without sorting.
*/

#include<iostream>
using namespace std;

int Sec_large(int arr[],int n){
   int large=0;
   int small=0;
   for(int i=0;i<n;i++){
      if(arr[i]>large){
         small=large;
         large=arr[i];
      }
      else if(arr[i]>small && arr[i]!=large){
         small=arr[i];
      }
   }
   return small;
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
    int res= Sec_large(arr,n);
    cout<<"Second Largest Number is : "<<res<<endl;
    
}