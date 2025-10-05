#include <iostream>
#include <vector>
#include <typeinfo>
using namespace std;

static int idgenerator = 0;

// ---------------- Base Class ----------------
class Laundry {
protected:
    int order_id;
    string cus_name;
    int qty;

public:
    Laundry(string cus_name, int qty) {
        this->order_id = ++idgenerator;
        this->cus_name = cus_name;
        this->qty = qty;
    }

    virtual void display() {
        cout << "Order id : " << order_id << endl;
        cout << "Customer name : " << cus_name << endl;
        cout << "Quantity : " << qty << endl;
    }

    int getOrderId() { return order_id; }
    int getQty() { return qty; }
    void setQty(int q) { qty = q; }  // allow update

    virtual void calculatePrice() = 0; // pure virtual
    virtual ~Laundry() {}
};

// ---------------- Regular Laundry ----------------
class Regular_Laundry : public Laundry {
private:
    double iron_rate; // price per cloth

public:
    Regular_Laundry(string cus_name, int qty, double rate)
        : Laundry(cus_name, qty) {
        cout<<"in ctr"<<endl;
        this->iron_rate = rate;
        //this->calculatePrice();
    }

    void display() override {
        cout << "Regular Laundry :" << endl;
        Laundry::display();
        cout << "Rate per cloth : " << iron_rate << endl;
        cout << "Total Price : " << (iron_rate * getQty()) << endl;
    }

    void calculatePrice() override {
        cout<<"Here"<<endl;
        cout << "Regular Laundry Total price = " << (iron_rate * getQty()) << endl;
    }
};

// ---------------- Dry Clean Laundry ----------------
class DryClean_Laundry : public Laundry {
private:
    double dryclean_rate; // base rate per cloth

public:
    DryClean_Laundry(string cus_name, int qty, double rate)
        : Laundry(cus_name, qty) {
        this->dryclean_rate = rate;
    }

    void display() override {
        cout << "DryClean Laundry :" << endl;
        Laundry::display();
        cout << "Rate per cloth : " << dryclean_rate << endl;
        double total;
        if (getQty() < 10) total = dryclean_rate * getQty();
        else total = dryclean_rate * getQty() + (10 * getQty());
        cout << "Total Price : " << total << endl;
    }

    void calculatePrice() override {
        double total;
        if (getQty() < 10) total = dryclean_rate * getQty();
        else total = dryclean_rate * getQty() + (10 * getQty());
        cout << "Dryclean Laundry Total price = " << total << endl;
    }
};

// ---------------- Main ----------------
int main() {
    vector<Laundry*> orders;
    bool exit = false;
    int ch;

    do {
        cout << "\nEnter choice" << endl;
        cout << "1. Add Laundry order" << endl;
        cout << "2. Display all orders" << endl;
        cout << "3. Remove order" << endl;
        cout << "4. Update order" << endl;
        cout << "5. Exit" << endl;
        cout << "Choice: ";
        cin >> ch;

        switch (ch) {
        case 1: {
            string type;
            cout << "Enter type (Regular / DryClean): ";
            cin >> type;
            if (type == "Regular") {
                orders.push_back(new Regular_Laundry("Isha", 2, 200));
                // for(auto itr=orders.begin();itr!=orders.end();itr++){
                //     if(typeid(*itr)==typeid(Regular_Laundry)){
                //         Regular_Laundry *rl=dynamic_cast<Regular_Laundry*>(*itr);
                //         rl->calculatePrice();
                //     }
                // }
                for(size_t i=0;i<orders.size();i++){
                    if(typeid(*orders[i])==typeid(Regular_Laundry)){
                        Regular_Laundry *rl=dynamic_cast<Regular_Laundry*>(orders[i]);
                        rl->calculatePrice();
                    }
                }
            } else if (type == "DryClean") {
                orders.push_back(new DryClean_Laundry("Riya", 4, 300));
            } else {
                cout << "Invalid type!" << endl;
            }
            break;
        }

        case 2: {
            cout << "\n------- Display Details --------------" << endl;
            for (Laundry* order : orders) {
                order->display();
                cout << "--------------------------------------" << endl;
            }
            break;
        }

        case 3: {
            int id;
            cout << "Enter Order ID to remove: ";
            cin >> id;
            bool found = false;
            for (auto it = orders.begin(); it != orders.end(); it++) {
                if ((*it)->getOrderId() == id) {
                    //delete *it;
                    orders.erase(it);
                    cout << "Order removed!" << endl;
                    found = true;
                    break;
                }
            }
           
            if (!found) cout << "Order ID not found!" << endl;
            break;
        }

        case 4: {
            int id;
            cout << "Enter Order ID to update: ";
            cin >> id;
            bool found = false;

            for (Laundry* order : orders) {
                if (order->getOrderId() == id) {
                    found = true;
                    int newQty;
                    cout << "Enter new quantity: ";
                    cin >> newQty;
                    order->setQty(newQty);
                    cout << "Order updated successfully!" << endl;
                    order->display();
                    break;
                }
            }
            if (!found) cout << "Order ID not found!" << endl;
            break;
        }

        case 5:
            cout << "Exiting..." << endl;
            exit = true;
            break;

        default:
            cout << "Invalid choice!" << endl;
        }
    } while (!exit);

    // cleanup memory
    for (Laundry* order : orders) {
        delete order;
    }

    return 0;
}