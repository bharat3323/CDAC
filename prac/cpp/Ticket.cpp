#include <iostream>
#include<typeinfo>
#include<vector>
using namespace std;

class myexception : exception{
    const char *msg;
    public:
    myexception(const char * messages): msg(messages){}
        const char *what(){
            return msg;
        }
};

class ticket
{
protected:
    int ticket_no;
    string passenger_name;
    double fare;

public:
    ticket(int ticket_no, string passenger_name, double fare)
    {
        this->ticket_no = ticket_no;
        this->passenger_name = passenger_name;
        this->fare=fare;
    }
    virtual void display()
    {
        cout<<"------display of ticket-----";
        cout<<"ticket_no= "<<ticket_no<<endl;
        cout<<"passenger_name = "<<passenger_name<<endl;
        cout<<"Fare= "<<fare<<endl;
    }
};
class bus : public ticket
{
    protected:
        int seat_no;
        int age;
        double distance;
        bool is_ac;
      public:

      bus(int ticket_no,string passenge_name,double fare,int seat_no,int age,double distance,bool is_ac) 
      :ticket(ticket_no,passenge_name,fare) {
        this->seat_no=seat_no;
        this->age=age;
        this->distance=distance;
        this->is_ac=is_ac;
        }

        
      void calc_fare(){
        int price=distance*2;
        if(is_ac){
            price=price+price*0.2;
            cout<<"fare price is: "<<price<<endl;
        }else{
            cout<<"fare price is: "<<price<<endl;
        }

      }
        void display(){
            cout<<"-------diaply of bus------------";
            ticket::display();
            cout<<"seat no : "<<seat_no<<endl;
            cout<<"age : "<<age<<endl;
            cout<<"distance: "<<distance<<endl;
        }
        


};
class train : public ticket
{
    private:
        string coach_type;
        double distance_km;

     public:
     train(int ticket_no, string passenger_name, double fare,string coach_type,double distance_km)
     :ticket(ticket_no,passenger_name,fare){
        this->coach_type=coach_type;
        this->distance_km=distance_km;
     } 
    
     void calc_fare(){
         double price=distance_km*1.5;
        if(coach_type=="AC"){
            price=price+price*0.3;
            cout<<"price with Ac : "<<price<<endl;
        }else{
            cout<<"Price without Ac: "<<price<<endl;
        }
     }
    void display(){
        cout<<"dipslay of  train";
     }  
};

int main()
{
    vector<ticket*> tr;
    int ch;
    int exit=0;
    do
    {
        cout<<"!!!!!!!!!!!!!!!!!!!!Ticket Booking System!!!!!!!!!!!!!!!!!!\n";
        cout<<"1. Add Bus \n";
        cout<<"2. Add Train \n";
        cout<<"3. Display all tickets(with calculated fare)\n";
        cout<<"4. dipslay special fun\n";
        cout<<"5. exit\n";
        cout<<"Enter your choice!: ";
        cin>>ch;
        try{
        switch (ch)
        {
        case 1:{
            int ticket_no;
            string passenger_name;
            double fare;
            int seat_no;//valid;1-40
            int age;
            double distancekm;
            bool is_ac;
            cout<<"Enter the ticket_no: ";
            cin>>ticket_no;
            cout<<"\nEnter the passenger name: ";
            cin>>passenger_name;
            cout<<"\nEnter fare :";
            cin>>fare;
            cout<<"\n Enter SeatNo(1-40): ";
            cin>>seat_no;
            if(seat_no>40 || seat_no <1 )
            throw myexception("please enter the seat between 1-40");
            
            cout<<"\n Enter your age: ";
            cin>>age;
            cout<<"\n Enter distance_km: ";
            cin>>distancekm;
            cout<<"\n Enter is_ac(true/false): ";
            cin>>is_ac;
            tr.push_back(new bus(ticket_no,passenger_name,fare,seat_no,age,distancekm,is_ac));
            cout<<"Added successfully into bus!!!!!!!";
            break;
        }
        case 2:   {
         int ticket_no;
            string passenger_name;
            double fare;
            string coach_type;
            double distance_km;

          
            cout<<"Enter the ticket_no: ";
            cin>>ticket_no;
            cout<<"\nEnter the passenger name: ";
            cin>>passenger_name;
            cout<<"\nEnter fare :";
            cin>>fare;
            cout<<"\nEnter coach_type: ";
            cin>>coach_type;
            cout<<"\nEnter distance: ";
            cin>>distance_km;
            
            tr.push_back(new train(ticket_no,passenger_name,fare,coach_type,distance_km));
            cout<<"Added successfuly into train!!!!";
            break;
        }
        case 3:
        for(int i=0;i<tr.size();i++){
            tr[i]->display();
        }
            break; 
            
        case 4:
            for(int i=0;i<tr.size();i++){
                if(typeid(*tr[i])==typeid(bus)){
                    bus *b=dynamic_cast<bus*>(tr[i]);
                    b->calc_fare();
                }else{
                    train * t=dynamic_cast<train*>(tr[i]);
                    t->calc_fare();
                }
            }   
            break;

            case 5: 
            exit=1; 
            break;
            
        default:
        cout<<"Please enter valid input"<<endl;
            break;
        }
    }catch(myexception e){
        cout<<e.what();
    }
    } while (exit!=1);
    
    return 0;
}