#include<iostream>
#include<string.h>
#include<typeinfo>
using namespace std;

class Fruit{
	public: virtual void taste(){
		cout<<"\t\t----no taste as such----"<<endl;
	}
};


class Orange:public Fruit{
	public:void taste(){
		cout<<"\t\t----Orange Teste is sweet and sour----"<<endl;
	}
	void juice(){
		cout<<"\t\t----Orange Juice-----"<<endl;
	}
};

class Mango:public Fruit{
	public:void taste(){
		cout<<"\t\t----Mango Teste Is Sweet----"<<endl;
	}
	void pulp(){
		cout<<"\t\t---mango pulp----"<<endl;
	}
};
class Apple:public Fruit{
	public:void taste(){
		cout<<"----Apple Teste Is Sweetsometimes ----"<<endl;
	}
	void jam(){
		cout<<"---Apple jam----"<<endl;
	}
};
int main(){
	cout<<"----RTTI ------"<<endl;
	
	int i,ch,index=0;
	Mango *m;
	Orange *org;
	Apple *app;
	Fruit* shop[3];
	do{
	cout<<"\t\t Enter Choice  1:MAngo 2:Apple 3:Orange 4:Display "<<endl;
	cin>>ch;
	switch(ch){
		case 1:m=new Mango();
		       shop[index]=m;
		       index++;
		       cout<<"\t\t ---Mango Added----"<<endl;
		     	break;
		case 2:app=new Apple();
		      shop[index]=app;
		      index++;
		       cout<<"---apple Added----"<<endl;
		      break;
		case 3:org=new Orange();
		      shop[index]=org;
		      index++;
		       cout<<"\t\t---Orange Added----"<<endl;
		      break;
		case 4:for(i=0;i<5;i++){
			shop[i]->taste();
		     
		     if(typeid(*shop[i])==typeid(Apple))
		     {
		     	cout<<"\t\t----Apple In Basket-----"<<endl;
		     	Apple *pple=dynamic_cast<Apple*>(shop[i]);
		     	pple->jam();
                //or
               // (dynamic_cast<Apple*>(shop[i]))->jam();
			 }
			 if(typeid(*shop[i])==typeid(Mango)){
			 	cout<<"\t\t-----------Mango Is Here-----"<<endl;
			 Mango *ngo=	dynamic_cast<Mango*>(shop[i]);
			 ngo->pulp();
			 }
	        	}
			break;
	}
	
		
	}while(ch!=0);
	
	
	
	
	
}
