#include<iostream>
using namespace std;

double division(int a,int b)
{

int c;
if(b==0)
{

    cout<<"\t\t b==0"<<endl;
    // string strErr("Thsi is error");
    // throw strErr;
    throw string("division by 0");
    //throw string("division by 0");
}
else
{
    c=a/b;
}
return c;
}

int main()
{

    try{
cout<<"Enter a ,b "<<endl;
int a,b,c;
cin>>a>>b;

c=division(a,b);

cout<<"\t\t After division ="<<c<<endl;

cout<<"\t\t-----main ends here--------"<<endl;
    }
    catch(int no){
        cout<<no<<endl;
    }
    catch(const string &str)
    {
        cout<<str<<endl;
    }
    catch(...){
        cout<<"\t\t ERROR:"<<endl;
    }
}