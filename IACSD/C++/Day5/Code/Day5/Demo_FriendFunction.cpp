#include<iostream>
using namespace std;

class Box{
private:int length;

public :Box(int l){
    length=l;
}
//Box class declare one friend function
friend int changeLength(Box obj);
};
int changeLength(Box b)
{
b.length+=100;
return b.length;
}
int main()
{Box box(100);
    
   int l= changeLength(box);
    cout<<"Inceremntd Length="<<l;
}