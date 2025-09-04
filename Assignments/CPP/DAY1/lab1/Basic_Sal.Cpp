//  Write a program, which accepts annual basic salary of an employee and calculates and displays the 
// Income tax as per the following rules. 
// Basic: < 1, 50,000 Tax = 0
//  1, 50,000 to 3,00,000 Tax = 20% 
//  > 3,00,000 Tax = 30% 

#include<iostream>
using namespace std;

int main(){
    int basic_salary,income_tax;
    cout<<"Enter the Basic_Salary :";
    cin>>basic_salary;
    if(basic_salary<150000){
        income_tax=0;
    }else if(basic_salary >= 150000 && basic_salary< 300000){
        income_tax=(basic_salary-150000)*0.20;
        cout<<income_tax;
    }else{
        income_tax=(150000 *0.20)+(basic_salary-150000)*0.30;
        cout<<income_tax;
    }

    return 0;
}
