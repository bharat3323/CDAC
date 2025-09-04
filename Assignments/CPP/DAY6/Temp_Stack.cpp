#include <iostream>
#include <string>
using namespace std;

template <class T>
class Stack {
private:
    T* arr;
    int capacity;
    int top;

public:
    Stack(int size = 100) {
        capacity = size;
        arr = new T[capacity];
        top = -1;
    }

    ~Stack() {
        delete[] arr;
    }

    void push(T val) {
        if (top == capacity - 1) {
            cout << "Stack Overflow!" << endl;
            return;
        }
        arr[++top] = val;
        cout << val << " pushed to stack" << endl;
    }

    void pop() {
        if (isEmpty()) {
            cout << "Stack Underflow!" << endl;
            return;
        }
        cout << arr[top--] << " popped from stack" << endl;
    }

    T peek() {
        if (isEmpty()) {
            throw runtime_error("Stack is empty!");
        }
        return arr[top];
    }

    bool isEmpty() {
        return (top == -1);
    }
};

int main() {
    cout << "----- Stack of Integers -----" << endl;
    Stack<int> s(5);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(50);

    cout << "Top Element is = " << s.peek() << endl;
    s.pop();
    cout << "Top element after pop = " << s.peek() << endl;

    cout << "\n----- Stack of Strings -----" << endl;
    Stack<string> s1(5);
    s1.push("Hello");
    s1.push("World");
    s1.push("End");

    cout << "Top Element is = " << s1.peek() << endl;
    s1.pop();
    cout << "Top element after pop = " << s1.peek() << endl;

    return 0;
}