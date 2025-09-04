#include <iostream>
#include <stdexcept>  // for runtime_error
using namespace std;

int main() {
    try {
        int choice;
        cout << "Enter choice (1-int, 2-char*, 3-string, 4-runtime_error): ";
        cin >> choice;

        switch (choice) {
            case 1:
                throw 404;  // throwing int
            case 2:
                throw "C-style string exception!";  // throwing const char*
            case 3:
                throw string("C++ string exception!");  // throwing std::string
            case 4:
                throw runtime_error("Standard runtime_error exception!");
            default:
                throw;  // unknown type
        }
    }
    catch (int x) {
        cout << "Caught int exception: " << x << endl;
    }
    catch (const char* msg) {
        cout << "Caught const char* exception: " << msg << endl;
    }
    catch (const string &s) {
        cout << "Caught string exception: " << s << endl;
    }
    catch (const runtime_error &e) {
        cout << "Caught runtime_error: " << e.what() << endl;
    }
    catch (...) {
        cout << "Caught an unknown exception!" << endl;
    }

    cout << "Program continues..." << endl;
    return 0;
}
