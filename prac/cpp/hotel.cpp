#include <iostream>
using namespace std;
class Room
{
protected:
    int room_number;
    string room_type;
    double price_per_day;
    int no_days;

public:
    Room()
    {
        room_number = 0;
        room_type = "";
        price_per_day = 0.0;
        no_days = 0;
    }

    Room(int room_number, string room_type, double price_per_day, int no_days)
    {
        this->room_number = room_number;
        this->room_type = room_type;
        this->price_per_day = price_per_day;
        this->no_days = no_days;
    }

    virtual double calculate_bill()
    {
        cout << "Inside room cal";
        return 0;
    }
    void display(){
        cout<<"\n Room-number="<<room_number;
        cout<<"\nRoom_type="<<room_type;
        cout<<"\nPrice_per_day"<<price_per_day;
        cout<<"\nNo_days"<<no_days;
    }
};
class StandardRoom : public Room
{
protected:
    string amenities;

public:
    StandardRoom(int room_number, string room_type, double price_per_day, int no_days, string amenities)
        : Room(room_number, room_type, price_per_day, no_days)
    {
        this->amenities = amenities;
    }


     double calculate_bill()
    {
        cout << "standardRoom calcu bill!!!";
    }
    string special_amenities()
    {
        return "special amenities standardRoom";
    }
    void display(){
        Room::display();
        cout<<"\n Amenities= "<<amenities;
        calculate_bill();
    }
};
class DeluxeRoom : public Room
{
private:
    string special_service;

public:
    DeluxeRoom(int room_number, string room_type, double price_per_day, int no_days, string special_service)
        : Room(room_number, room_type, price_per_day, no_days)
    {
        this->special_service= special_service;
    }

    double cakculate_bill()
    {
    }
    void special_services()
    {
        cout << "inside the special_service";
    }
    void display(){
        Room::display();
        cout<<"Special_service="<<special_service;
        cakculate_bill();
    }
};

int main()
{
    Room *arr[100];
    StandardRoom *sr;
    DeluxeRoom *dr;
    int count=0;
    int exit=0;
    int ch;
     int room_number;
    string room_type;
    double price_per_day;
    int no_days;
    string amenities;
    do
    {
        cout<<"1.Add standard room\n";
        cout<<"2.Add delux room\n";
        cout<<"3.Display detail\n";
        cout<<"4.Special service\n";
        cout<<"5.exit\n";
        cout<<"Enter your choice!!!\n";
        cin>>ch;

        switch (ch)
        {
        case 1:
            // cout<<"\n enter details room_number, room_type,price_per_day,no_days,amen!!!!\n";
            // cin>>room_number;
            // cin>>room_type;
            // cin>>price_per_day;
            // cin>>no_days;
            // cin>>amenities;
            
            //arr[count++]=new StandardRoom(room_number,room_type,price_per_day,no_days,amenities);
            arr[count++]=new StandardRoom(101,"single",1000,5,"free food");
            cout<<"added standardroom";
            break;
        case 2:
         arr[count++]=new StandardRoom(101,"single",1000,5,"free food");
            cout<<"added delux";
            break;
        case 3:
        for(int i=0;i<count;i++){
            arr[i]->display();
            if(typeid)
            break;
        }
            
            break;
        case 4:
            break;
        case 5:
        cout<<"exiting.......";
        exit=1;
            break;           
        default:
            break;
        }
    } while (exit!=1);
    
    return 0;
}