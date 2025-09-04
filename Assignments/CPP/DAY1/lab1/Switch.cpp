//Accept a single digit from the user and display it in words. For example, if digit entered is 9, display Nine.
#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter Single Digit Number: ";
    cin>>num;
    switch (num)
    {
    case 1:
    cout<<"one";
        break;
    case 2:
    cout<<"two";
        break;
    case 3:
    cout<<"three";
        break;
    case 4:
    cout<<"four";
        break;
    case 5:
    cout<<"five";
        break;
    case 6:
    cout<<"six";
        break;
    case 7:
    cout<<"Seven";
        break;
    case 8:
    cout<<"Eigth";
         break;
    case 9:
    cout<<"Nine";
         break;           
    default:
    cout<<"plz enter the valid input";
        break;
    }
}
