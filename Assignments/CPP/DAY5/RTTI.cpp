#include<iostream>
#include<typeinfo>
using namespace std;

class fruit{
    public:
   virtual void taste(){
        cout<<"No taste";
    }
};
class Mango: public fruit{
    public:
    void taste(){
        cout<<"Mango taste is sweet "<<endl;
    }
    void pulp(){
        cout<<"Mnago pulp"<<endl;
    }
};
class orange: public fruit{
    public:
    void taste(){
        cout<<"orange taste "<<endl;
    }
    void juice(){
        cout<<"orange juice "<<endl;
    }
};
class Apple: public fruit{
    public:
    void taste(){
        cout<<"Apple taste"<<endl;
    }
    void jam(){
        cout<<"Apple JAm"<<endl;
    }
};
int main(){
     Mango *m;
     orange *o;
     Apple *a;
    int ch ;
    bool flag=0;
    int index=0;
    fruit * basket[3];
    do{
         cout<<"1.Add mango 2.Add orange 3.Add Apple 4.Display Basket 5.exit" <<endl;
          cout<<"Enter the choice : ";
         cin>>ch;
         switch (ch)
         {
         case 1:m=new Mango();
                basket[index]=m;
                index++;
                cout<<"Mango is added!!!"<<endl;
            break;
         case 2:o=new orange();
                basket[index]=o;
                index++;
                cout<<"orange is added!!!!"<<endl;
            break;
         case 3:a=new Apple();
         //upcaste done here
                basket[index]=a;
                index++;
                cout<<"Apple is added!!!!"<<endl;
            break;
         case 4:
         //upcaste display
                for(int i=0;i<5;i++){
                basket[i]->taste();
         //downcast dispaly       
                if(typeid(* basket[i])==typeid(Mango)){
                    cout<<"mango in basket"<<endl;
                    Mango * man=dynamic_cast<Mango *>(basket[i]);/*basket[i] is a Fruit*.You cannot directly call Mango-specific methods (pulp()) on it.dynamic_cast safely converts (downcasts) the Fruit* into a Mango*.If basket[i] is not really a Mango, dynamic_cast will return nullptr (instead of crashing).Concept: Safe Downcasting using dynamic_cast.*/
                    man->pulp();
                }
                if(typeid(* basket[i])==typeid(orange)){
                    cout<<"orange in  basket"<<endl;
                    orange * og=dynamic_cast<orange *>(basket[i]);
                    og->juice();
                }
                if(typeid(*basket[i])==typeid(Apple)){
                    cout<<"Apple in basket"<<endl;
                    Apple *app=dynamic_cast<Apple *>(basket[i]);
                    app->jam();
                }
                }

            break;
         case 5:
         cout<<"exit===============";
         flag=1; 
         default:
            cout<<"invalid choice!!!!!!!!!!!";
            break;
         }
    
        }while(flag==0);  

}