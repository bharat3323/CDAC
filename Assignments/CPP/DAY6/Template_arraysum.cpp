/*Function Template – Array Sum
 Write a function template sumArray() that accepts an array of any type and returns the sum of its elements.
*/


#include<iostream>
using namespace std;


template<class T>


T sumarr(T arr[],int n){
    T sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    return sum;
}
int main(){
    int arr[]={10,20,30,0,40};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"Sum of  int array: "<<sumarr(arr,n)<<endl;

    double arr2[] = {1.1, 2.2, 3.3};
    int n2 = sizeof(arr2)/sizeof(arr2[0]);

    cout << "Sum of double array: " << sumarr(arr2, n2) << endl;

    return 0;

    return 0;

    
}
