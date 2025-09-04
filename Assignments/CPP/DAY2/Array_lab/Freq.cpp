#include <iostream>
#include <vector>
using namespace std;

void freq(int arr[], int n) {
    vector<bool> visited(n, false);

    for (int i = 0; i < n; ++i) {
        if (visited[i]) continue;

        int count = 1;
        for (int j = i + 1; j < n; ++j) {
            if (arr[i] == arr[j]) {
                visited[j] = true;   // assign, not compare
                ++count;
            }
        }
        cout << arr[i] << " = " << count << endl;
    }
}

int main() {
    int n;
    cout << "Enter the size: ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; ++i) {
        cout << "Enter element at index " << i << ": ";
        cin >> arr[i];
    }

    cout << "\nFrequencies:\n";
    freq(arr, n);
    return 0;
}
