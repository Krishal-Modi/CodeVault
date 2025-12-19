#include <iostream>
using namespace std;
void addTen(int num) {  // Function that takes a copy of 'num'
    num = num + 10;     // Modify the copy
    cout << "Inside function: " << num << endl;
}

int main() {
    int a = 5;
    addTen(a);  // Call by Value: 'a' is passed, but only a copy is used

    cout << "Outside function: " << a << endl; // 'a' remains unchanged
    return 0;
}

