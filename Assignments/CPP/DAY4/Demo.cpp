#include <iostream>
#include <vector>
#include <string>
using namespace std;

class User {
    int userid;
    string name, email, pwd;
public:
    User(int id, string n, string e, string p) : userid(id), name(n), email(e), pwd(p) {}
    int getId() { return userid; }
    string getName() { return name; }
    string getEmail() { return email; }
    string getPwd() { return pwd; }
    void setPwd(string newPwd) { pwd = newPwd; }

    void display() {
        cout << "ID: " << userid << " Name: " << name << " Email: " << email << " Pwd: " << pwd << endl;
    }
};

int main() {
    vector<User> users;
    int choice, id;
    string name, email, pwd;

    do {
        cout << "\n===== MENU =====\n";
        cout << "1. Add User\n2. Display All\n3. Search User\n4. Change Password\n5. Delete All\n6. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch(choice) {
            case 1: // add
                cout << "Enter ID, Name, Email, Password: ";
                cin >> id >> name >> email >> pwd;
                users.push_back(User(id, name, email, pwd));
                break;

            case 2: // display
                for(auto &u : users) u.display();
                break;

            case 3: // search
                cout << "Enter ID to search: ";
                cin >> id;
                {
                    bool found=false;
                    for(auto &u : users) {
                        if(u.getId()==id) { u.display(); found=true; }
                    }
                    if(!found) cout << "User not found!\n";
                }
                break;

            case 4: 
                cout << "Enter ID: ";
                cin >> id;
                {
                    string newPwd;
                    bool found=false;
                    for(auto &u : users) {
                        if(u.getId()==id) {
                            cout << "Enter new password: ";
                            cin >> newPwd;
                            u.setPwd(newPwd);
                            cout << "Password updated!\n";
                            found=true;
                        }
                    }
                    if(!found) cout << "User not found!\n";
                }
                break;

            case 5: 
                users.clear();
                cout << "All users deleted!\n";
                break;
        }
    } while(choice != 6);

    return 0;
}
