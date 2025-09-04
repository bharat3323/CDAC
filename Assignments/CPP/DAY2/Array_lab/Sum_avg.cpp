#include<iostream>
using namespace std;


int total(int arr[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    return sum;
}
double avg(int arr[],int n){
    int sum=total(arr,n);
    return (double)sum/n;
}

int main(){

    int n;
    cout<<"enter the size: ";
    cin>>n;
    int student[n];
    for(int i=0;i<n;i++){
        cout<<"enter the elemnet at "<<i <<" index=";
        cin>>student[i];
    }
    for(int i=0;i<n;i++){
        cout<<student[i]<<" "<<endl;
    }
    int res=total(student,n);
    cout<<"total is: "<<res<<endl;
    double res1=avg(student,n);
        cout<<"Avg is: "<<res1<<endl;
    
    return 0;

}