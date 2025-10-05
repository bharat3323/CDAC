#include <typeinfo>
#include <iostream>
#include<vector>
using namespace std;

// base class
class myexception :public exception{
    const char * msg;
    public:
        myexception(const char * messages):msg(messages){}
       const char * what(){
            return msg;
        }

};
class laundry
{
protected:
    int order_id;
    string customername;
    int quantity;

public:
    laundry(int order_id, string customername, int quality)
    {
        this->order_id = order_id;
        this->customername = customername;
        this->quantity = quality;
    }

    // overriding method
public:
    virtual void display()
    {
        cout << "\n order id= " << order_id;
        cout << "\ncustomer name= " << customername;
        cout << "\n"
             << "quantity= " << quantity << endl;
    }
};

// derived class
class regular_laundry : public laundry
{
protected:
    double iron_price;

public:
    regular_laundry(int order_id, string customername, int quality, double iron_price)
        : laundry(order_id, customername, quality)
    {
        this->iron_price = iron_price;
    }

    void calculate_Regularprice()
    {
        cout << "Regular price= " << quantity * iron_price << endl;
    }
    void display()
    {
        cout << "Display of regular_laundry\n";
        laundry::display();
        cout << "iron price! = " << iron_price << endl;
        calculate_Regularprice();
    }
};
// derived class
class dry_cleaning : public laundry
{
protected:
    double dryclean_price; // additional charge for special dry cleaning
    // double special_type;

public:
    dry_cleaning(int order_id, string customername, int quality, double dryclean_price)
        : laundry(order_id, customername, quality)
    {
        this->dryclean_price = dryclean_price;
    }

    void calculate_DryCleanprice()
    {
        // calculate price as per the Quantity and
        // if quantity is more than 10 then give additional discount of rs 10 per quantity
        int price = quantity * dryclean_price;
        if (quantity >= 10)
        {
            price = price - price * 0.1;
            cout << "Price for dryclean is : " << price << endl;
         
        }
        else
        {
            cout << "Price for dryclean is : " << price << endl;
        }
    }

    void display()
    {
        cout << "Display of dry_cleaning\n";
        laundry::display();
        cout << "dryclean price= " << dryclean_price << endl;
        calculate_DryCleanprice();
    }
};
int main()
{
    int exit = 0;
    int ch;

    vector<laundry*> orders;
    
    do
    {
        cout << "!!!!!!!!!!!!!!!LAUNDRY MANAGEMENT SYSTEM!!!!!!!!!\n";
        cout << "1. Add laudry order\n";
        cout << "3. Display\n";
        cout << "4. Special function(price regular_cleaning| dry_cleaning)\n";
        cout << "5. Exit\n";
        cout << "Enter your choice!!!: ";
        cin >> ch;
        switch (ch)
        {
        case 1:
        {
            string type;
            cout<<"enter your type (regular|| dry_cleaning)= "<<endl;
            cin>>type;
            
            if(type=="Regular"){
                int id, q;
            string cname;
            double ironcost;
            cout << "Enter order id: ";
            cin >> id;
            cout << "Enter customer name: ";
            cin >> cname;
            cout << "Enter Quality: ";
            cin >> q;
            cout << "enter iron cost: ";
            cin >> ironcost;
                orders.push_back(new regular_laundry(id,cname,q,ironcost));
                 cout << endl;
            cout << "Added in regular laundry!!\n";
            }
           
            else{
              int id, q;
            string cname;
            double dcprice;

            cout << "Enter order id: ";
            cin >> id;
            cout << "Enter customer name: ";
            cin >> cname;
            cout << "Enter Quality: ";
            cin >> q;
            cout << "Dry_clean price: ";
            cin >> dcprice;
               
             orders.push_back(new dry_cleaning(id,cname,q,dcprice));
            cout << "Added  for dry cleaning !!\n";

            }
        }

        break;

        

        case 3:
            cout << "Display!!!!";
            for (int i = 0; i < orders.size(); i++)
            {
                orders[i]->display();
                cout << "Display successfully!!\n";
            }

            break;

        case 4:
            for (size_t i = 0; i <orders.size(); i++){
        
                if (typeid(*orders[i]) == typeid(regular_laundry))
                {
                    regular_laundry *re = dynamic_cast<regular_laundry *>(orders[i]);
                    re->calculate_Regularprice();
                }
                else
                {
                    dry_cleaning *dr = dynamic_cast<dry_cleaning *>(orders[i]);
                    dr->calculate_DryCleanprice();
                }
           
            }

            break;

        case 6:
            exit = 1;
            break;

        default:
            break;
        }
    } while (exit != 1);

    return 0;
}