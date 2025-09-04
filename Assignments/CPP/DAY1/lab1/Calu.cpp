#include<iostream>
using namespace std;

int main(){
    int num1,num2;
    char operator1;
    cout<<"Enter the numbe<1: ";
    cin>>num1;
    cout<<"Enter the number 2: ";
    cin>>num2;
    cout<<"Enter the operator(+|-|*|/) you want perform operation: ";
    cin>>operator1;

    switch(operator1){
        case '+':
        cout<<"Addition of two number is: "<<num1+num2;
        break;
        case '-':
        cout<<"Sub of two number is: "<<num1-num2;
        break ;
        case '*':
        cout<<"Multiplication of two number is: "<<num1*num2;
        break;
        case '/':
        cout<<"Division of two number is: "<<num1/num2;
        break;
        default:
        cout<<"Enter the valid Operator: ";
    }
}