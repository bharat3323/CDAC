/*
 Create a class Point with data members as x,y. Create Default and Parameterized constructors. Write 
getters and setters for all the data members. Also add the display function. Create the object of this 
class in main method and invoke all the methods in that class. 
*/

#include <iostream>
using namespace std;

class Point {
private:
    int x, y;

public:
    Point() {
        x = 0;
        y = 0;
    }
    Point(int x, int y) {
        this->x = x;
        this->y = y;
    }
    void setX(int x) {
        this->x = x;
    }
    int getX() {
        return x;
    }
    void setY(int y) {
        this->y = y;
    }
    int getY() {
        return y;
    }
    void display() {
        cout << "Point: (" << x << ", " << y << ")" << endl;
    }
};

int main() {
    Point p1;
    p1.display();

    Point p2(5, 10);
    p2.display();

    p1.setX(20);
    p1.setY(30);
    cout << "Updated X: " << p1.getX() << endl;
    cout << "Updated Y: " << p1.getY() << endl;
    p1.display();

    return 0;
}
