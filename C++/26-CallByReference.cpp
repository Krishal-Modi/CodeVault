#include <iostream>
using namespace std;
void addTen(int &num) {  // Function takes 'num' by reference
    num = num + 10;      // Modify the original variable
}

int main() {
    int a = 5;
    addTen(a);  // Call by Reference: 'a' is directly modified

    cout << "Updated value of a: " << a << endl; // 'a' is changed
    return 0;
}

