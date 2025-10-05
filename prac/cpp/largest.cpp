#include<iostream>
using namespace std;

 static bool isprime(int num){
    if(num<=1){
        return false;
    }
    for(int i=2;i*i<num;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;    
}

int main(){
    //int arr[]={100,20,70,50,40,30,90};

    // int max=0;
    // for(int i=0;i<5;i++){
    //     if(arr[i]>max){
    //         max=arr[i];
    //     }
      
    // }
    //   cout<<"max= "<<max;
    // int max1=0;
    // int max2=0;
    // for(int i=0;i<=6;i++){
    //     if(max1< arr[i] ){
    //         max2=max1;
    //         max1=arr[i];
    //     }
    //     else if (arr[i]>max2 && arr[i]!=max1){
    //         max2=arr[i];
    //     }
    // }
//     int max1=0;
//     int max2=0;
//     int max3=0;
//     for(int i=0;i<7;i++){
//         if(arr[i]>max1){
//             max3=max2;
//             max2=max1;
//             max1=arr[i];
//         }else if(arr[i]>max2 && arr[i]>max2){
//             max3=max2;
//             max2=arr[i];
//         }else if(arr[i]> max3 && arr[i]!=max2 && arr[i]!=max1){
//             max3=arr[i];
//         }
//     }
//     cout<<"second largest element= "<<max3;
// }


// int num=9;
              
// if(isprime(num)) {
//         cout << "Number is prime";
//     } else {
//         cout << "Number is not prime";
//     }

//     return 0;
// int a=10;
// int b=20;
// int c;

//  a=a^b;
//  b=a^b;
//  a=a^b;
// a=a+b;
// b=a-b;
// a=a-b;
// cout<<a<<endl;
// cout<<b<<endl;
// c=a;
// a=b;
// b=c;
// cout<<a<<endl;
// cout<<b<<endl;
int num=102030;
int rev_no=0;

while(num!=0){
   int rem=num%10;
   rev_no=rev_no*10+rem;
   num=num/10; 
}
cout<<rev_no;



}
