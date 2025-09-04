#include<iostream>
using namespace std;

int main(){
    int arr[]={10,20,30,4,30,6,88};
    int max=arr[0];
        int min=arr[0];
    for(int i=1;i<7;i++){
        
        if(arr[i]>max){
            max=arr[i];
            
        }else if(arr[i]<min){
            min=arr[i];
          
        }
    }
    cout<<"max element is : "<<max<<endl;
    cout<<"min element is : "<<min<<endl;

    return 0;
}