#include<typeinfo>
#include<iostream>
using namespace std;

//base class
class laundry{
    protected:
        int order_id;
        string customername;
        int quantity;
    public:
        laundry(int order_id,string customername,int quality){
            this->order_id=order_id;
            this->customername=customername;
            this->quantity=quality;
    }   
  
    //overriding method
    public:virtual void display(){
        cout<<"\n order id= "<<order_id;
        cout<<"\ncustomer name= "<<customername;
        cout<<"\n"<<"quantity= "<<quantity<<endl;

    }
};

//derived class 
class regular_laundry:public  laundry{
    protected:
        double iron_price;
    
    public:
        regular_laundry(int order_id,string customername,int quality,double iron_price)
        :laundry(order_id,customername,quality){
            this->iron_price=iron_price;
        }

        void calculate_Regularprice(){
                cout<<"Regular price= " <<quantity*iron_price<<endl;
        }
        void display(){
            cout<<"Display of regular_laundry\n";
            laundry::display();
            cout<<"iron price! = "<<iron_price <<endl;
            calculate_Regularprice();
            
        }
};
//derived class
class dry_cleaning:public  laundry{
    protected:
        double dryclean_price;//additional charge for special dry cleaning
        //double special_type;
        
     
    public:
    
    dry_cleaning(int order_id,string customername,int quality,double dryclean_price)
    :laundry(order_id,customername,quality){
        this->dryclean_price=dryclean_price;
    
    }

    void calculate_DryCleanprice(){
    //calculate price as per the Quantity and 
        //if quantity is more than 10 then give additional discount of rs 10 per quantity
        int price=quantity*dryclean_price;
        if(quantity>=10){
            price=price-price*0.1;
            cout<<"Price for dryclean is : "<<price<<endl;
        }else{
            cout<<"Price for dryclean is : "<<price<<endl;
        }

    }

    void display(){
        cout<<"Display of dry_cleaning\n";
        laundry::display();
        cout<<"dryclean price= "<<dryclean_price<<endl;
        calculate_DryCleanprice();
    }

};
int main(){
    laundry* arr[100];
    regular_laundry* rl;
    dry_cleaning *dc; 
     int exit=0;
    int ch;
    int count=0;
    int checkType=1;
    do
    {
       cout<<"!!!!!!!!!!!!!!!LAUNDRY MANAGEMENT SYSTEM!!!!!!!!!\n"; 
       cout<<"1. Add Regular_Laundry\n"; 
       cout<<"2. Add Dry_Cleaning\n"; 
       cout<<"3. Display\n"; 
       cout<<"4. Special function(price regular_cleaning| dry_cleaning)\n"; 
       cout<<"5. Exit\n";
        cout<<"Enter your choice!!!: ";
        cin>>ch;
       switch (ch)
       {
       case 1:
         arr[count++]=new regular_laundry(101,"bharat",5,30);
            cout<<"Added in regular laundry!!\n";
        break;

       case 2:
       arr[count++]=new dry_cleaning(500,"rock",10,50);
         cout<<"Added  for dry cleaning !!\n";
       break;

       case 3:
            cout<<"Display!!!!";
            for(int i=0;i<count;i++){
                arr[i]->display();
                cout<<"Display successfully!!\n";
            }

       break; 

       case 4:
            for(int i=0;i<count;i++){
                if(typeid(*arr[i])==typeid(regular_laundry)){
                regular_laundry *re= dynamic_cast<regular_laundry*>(arr[i]);
                re->calculate_Regularprice();
                }else{
                    dry_cleaning * dr=dynamic_cast<dry_cleaning*>(arr[i]);
                    dr->calculate_DryCleanprice();
                }
            }

       break;

       case 6: 
        exit=1;
       break;
       
       default:
        break;
       }
    } while (exit!=1);
    
    return 0;
}