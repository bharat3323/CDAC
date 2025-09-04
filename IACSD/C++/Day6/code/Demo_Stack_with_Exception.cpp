#include<iostream>
#include<string.h>
using namespace std;
class StackException:public exception
{
	public:char* message;
	  StackException(char *mgs):message(mgs){}
	  
	char* what(){
		return message;
	}
};
class MyStack{
private:	int *arr;
		int top,size;
	public:MyStack(int size){
		this->size=size;
		arr=new int[this->size];
		top=-1;
	}
	void push(int no){
		cout<<"----:"<<top<<endl;
		if(top<size-1)
		arr[++top]=no;
		else
		throw   StackException("Stack is Full");
		//cout<<"stack full....."<<endl;
	}
	int pop(){
		return arr[top--];
	}
};

int main(){
	cout<<"---stack---"<<endl;
	try{
	
	MyStack ms(5);
	ms.push(10);
	ms.push(20);
	ms.push(30);
	ms.push(40);
	ms.push(50);
		//ms.push(500);
	cout<<ms.pop()<<endl;
	cout<<ms.pop()<<endl;
	cout<<ms.pop()<<endl;
	cout<<ms.pop()<<endl;
	cout<<ms.pop()<<endl;
	//	cout<<ms.pop()<<endl;
	}
	catch(StackException ex ){
		cout<<ex.what();
	}
}
