#include <iostream>
using namespace std;

class Base {
public:
    int pub = 1;
protected:
    int prot = 2;
private:
    int priv = 3;  // never accessible in derived
};

// ----------------- Public Inheritance -----------------
class PublicDerived : public Base {
public:
    void show() {
        cout << "PublicDerived accessing members:\n";
        cout << "  pub = " << pub << endl;     // ✅ Accessible (public)
        cout << "  prot = " << prot << endl;   // ✅ Accessible (protected)
        // cout << priv;  // ❌ Not accessible
    }
};

// ----------------- Protected Inheritance -----------------
class ProtectedDerived : protected Base {
public:
    void show() {
        cout << "ProtectedDerived accessing members:\n";
        cout << "  pub = " << pub << endl;     // ✅ Becomes protected
        cout << "  prot = " << prot << endl;   // ✅ Still protected
        // cout << priv;  // ❌ Not accessible
    }
};

// ----------------- Private Inheritance -----------------
class PrivateDerived : private Base {
public:
    void show() {
        cout << "PrivateDerived accessing members:\n";
        cout << "  pub = " << pub << endl;     // ✅ Becomes private
        cout << "  prot = " << prot << endl;   // ✅ Becomes private
        // cout << priv;  // ❌ Not accessible
    }
};

// ----------------- MAIN -----------------
int main() {
    cout << "----- Public Inheritance -----\n";
    PublicDerived pubObj;
    pubObj.show();
    cout << "From main: pubObj.pub = " << pubObj.pub << endl; // ✅ Accessible (public)
    // cout << pubObj.prot;  // ❌ Protected
    // cout << pubObj.priv;  // ❌ Private

    cout << "\n----- Protected Inheritance -----\n";
    ProtectedDerived protObj;
    protObj.show();
    // cout << protObj.pub;  // ❌ Not accessible (protected in derived)
    // cout << protObj.prot; // ❌ Not accessible

    cout << "\n----- Private Inheritance -----\n";
    PrivateDerived privObj;
    privObj.show();
    // cout << privObj.pub;  // ❌ Not accessible (private in derived)
    // cout << privObj.prot; // ❌ Not accessible

    return 0;
}
