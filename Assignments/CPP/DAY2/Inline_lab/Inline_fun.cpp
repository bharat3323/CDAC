// Write a program using inline functions to calculate: 
// Area of a square (side × side)
// Area of a rectangle (length × breadth)
// Area of a circle (π × r × r, use π = 3.14159)
#include <iostream>
using namespace std;

inline int square(int x){
    return x*x;
}
inline int Areasqr(int l,int b){
    return l*b;
}
inline double AreaCircle(int r){
    return 3.14*r*r;
}
int main(){
    int num=5;
    int res=square(num);
    cout<<"Square of "<<num <<"= "<<res<<endl;
    int l=5,b=10;
    int res1=Areasqr(l,b);
    cout<<"Area of rectangle is "<<res1<<endl;
    int r=4;
    double res2=AreaCircle(r);
    cout<<"Area of circle= "<<res2<<endl;
}