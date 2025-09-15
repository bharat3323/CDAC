#include<iostream>
using namespace std;

class Bankaccount{
    private:
    int acc_no;
    string cust_name;
    double balance;
    public:
    Bankaccount(int an,string name,double bal){
        this->acc_no=an;
        this->cust_name=name;
        this->balance=bal;
    }

    void withdraw(double amt){
        if(amt>0 && amt<=balance){
            balance-=amt;
            cout<<"Withdrawn:"<<amt<<"|New balance="<<balance<<endl;
        }
        else if(amt>balance){
            cout<<"Insufficient balance!Current balance="<<balance<<endl;
        }
        else{
            cout<<"Withdraw amout must be positive"<<endl;
        }

    }
    void deposit(double amt){
        if(amt>0){
            balance+=amt;
            cout<<"Deposited:"<<amt<<"|New balance="<<balance<<endl;
        }
        else{
            cout<<"Deposite amoutnt must be positive"<<endl;
        }
    }
    void display(){
        cout<< "Account No: " << acc_no << " | Name: " << cust_name<< " | Balance: " << balance << endl;
    }
};

int main(){
    int acn;
    string name;
    double bal;

    cout<<"Enter account no=";
    cin>>acn;
    cout<<"Enter customer name=";
    cin>>name;
    cout<<"Enter balance= ";
    cin>>bal;

    Bankaccount obj(acn,name,bal);
    cout<<"----- Account Details-----"<<endl;
    obj.display();
    
    cout<<"\n---Testing both methods -----"<<endl;
    double amt;
    cout<<"Enter amount for deposite="<<endl;
    cin>>amt;
    obj.deposit(amt);
    
    cout<<"Enter amount for withdrawn="<<endl;
    cin>>amt;
    obj.withdraw(amt);

    obj.display();

    return 0;

}
