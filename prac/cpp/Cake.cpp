#include<iostream>
#include<typeinfo>
using namespace std;
class Cake{
    protected:
        string cakename;
        double price;
    
    //constructor para
    public:
        Cake(string cakename,double price){
            this->cakename=cakename;
            this->price=price;
        }
      //Methods 
      virtual void display(){
        cout<<"cakename: "<<cakename<<endl;
        cout<<"price: "<<price<<endl;
      }     
};
class Chocolate : public Cake{

    protected:
       // string fudge_cake,black_forest;
       string caketype;
        
        public:
        Chocolate(string cakename,double price,string caketype)
        :Cake(cakename,price)
        {
            this->caketype=caketype;
        }
        //method of chocolate 5% extra to fud + price and 10 % on blac
        void Cal_chocolateprice(){
            if(caketype=="fudge"){
                cout<<"price of fudge cake is : "<<price+price*0.05<<endl;
            }else if( caketype=="blackforest"){
                cout<<"price of blackforest cake is : "<<price+price*0.1<<endl;
            }

        }

        void display(){
            Cake::display();
            cout<<"caketype: "<<caketype<<endl;
            Cal_chocolateprice();
        }
};

class VanilaCake : public Cake{
    protected:
    int discount;

    public:
    VanilaCake(string cakename,double price,int discount)
    :Cake(cakename,price){
        this->discount=discount;
    }
    
    //cal method of vanilacake
    void cal_valinaprice(){
        cout<<"Valina price with discount: "<<price-price*0.1<<endl;
    }

    void display(){
        Cake::display();
        cal_valinaprice();
    }
};

int main(){
    Cake * arr[100];
    Chocolate *c;
    VanilaCake *v;
    int count=0;
    int exit=0;
    int ch=0;

    do{
        cout<<"1.Add chocolate CAKE!!!\n";
        cout<<"2.Add valinka CAKE!!!\n";
        cout<<"3.display\n";
        cout<<"4.Special function call\n";
        cout<<"5.exit\n";
        cout<<"Enter your choice: ";
        cin>>ch;
        switch (ch)
        {
        case 1:
            arr[count++]=new Chocolate("cupcake",300,"fudge");
            arr[count++]=new Chocolate("pastry",50,"blackforest");
            cout<<"added chocalate cake\n";
            break;


        case 2:
        arr[count++]=new VanilaCake("valina",500,0.1);
        cout<<"added valina cake\n";
            break;


        case 3:
        cout<<"=============display====================\n";
        for(int i=0;i<count;i++){
            arr[i]->display();
        }
            break;
         
        case 4:
        for(int i=0;i<count;i++){
            if(typeid(*arr[i])==typeid(Chocolate)){
                Chocolate *co=dynamic_cast<Chocolate*>(arr[i]);
                co->Cal_chocolateprice();
            }else{
                VanilaCake *va=dynamic_cast<VanilaCake*>(arr[i]);
                va->cal_valinaprice();
            }
        }
            break;

        case 5: 
            exit=1;
            break;             
        default:
        cout<<"please enter the valid input!!!!";
            break;
        }

    }while (exit!=1);
    
}