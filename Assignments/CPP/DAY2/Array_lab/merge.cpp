/*
10. Merge Two Arrays**

* Take two arrays and merge them into a third array.
*/

#include<iostream>
using namespace std;

int main(){
    int arr1[]={10,20,30,40};
    int arr2[]={50,60,70,80};
    int n1=4;
    int n2=4;
    int arr3[n1+n2];
    for(int i=0;i<n1;i++){
        arr3[i]=arr1[i];
    }
    for(int i=0;i<n2;i++){
        arr3[n1+i]=arr2[i];
    }
    for(int i=0;i<n1+n2;i++){
        cout<< arr3[i] <<" ";
    }
    cout<<endl;
    return 0;

}