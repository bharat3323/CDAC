/*
Count Even and Odd Numbers
   * Count how many even and odd numbers are in the array.
*/

#include<iostream>
using namespace std;

pair<int ,int> odd_even(int arr[], int n) {
    int coute = 0; 
    int couto = 0;  
    for(int i = 0; i < n; i++) {
        if(arr[i] % 2 == 0) {
            coute++;
        } else {
            couto++;
        }
    }
    return {coute, couto}; 
}

int main() {
    int size;
    cout << "Enter the Size of array: ";
    cin >> size;
    
    int arr[size];
    for(int i = 0; i < size; i++) {
        cout << "Enter the element at " << i << " index = ";
        cin >> arr[i];
    }

    pair<int, int> result = odd_even(arr, size);
    cout << "Even count is : " << result.first << endl;
    cout << "Odd count is  : " << result.second << endl; 

    return 0;
}