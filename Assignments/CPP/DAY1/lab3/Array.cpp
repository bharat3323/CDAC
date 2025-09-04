/*
1:Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user. 
*/
#include<iostream>
using namespace std;

//sum of array
int arrsum(int arr[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    return sum;
}
//avg of array

int Avg(int arr[],int n){
    int avg=0;
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    cout<<sum;
    avg=sum/n;
    return avg;
}
//max and min in the array


pair <int,int>Max_Min(int arr[],int n){
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<n;i++){
       if(arr[i]>max){
        max=arr[i];
       }else if(arr[i]>min){
        min=arr[i];
       }
    }
    return {max,min};
}

int main(){

    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the elemnet int the array: "<<endl;
    for(int i=0;i<n;i++){
        cout<<"Element at "<<i<<"= ";
        cin>>arr[i];
    }
    cout<<"Display Array: ";
    for(int i=0;i<n;i++){
        cout<<arr[i] <<" ";
    }
    int res=arrsum(arr,n);
    cout<<endl <<"The sum of Array is: "<<res;
     int res1=Avg(arr,n);
    cout<<endl <<"The Avg of Array is: "<<res1<<endl;

    pair<int,int>result =Max_Min(arr,n);
    cout<<"Maxmium number is :"<<result.first<<endl;
    cout<<"Minimum nuber is : "<<result.second<<endl;

    return 0;
}