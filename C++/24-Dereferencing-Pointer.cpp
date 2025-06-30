#include <iostream>
using namespace std;
int main() {
    int num = 42;       // Declare an integer variable
    int* ptr = &num;    // Pointer storing the address of 'num'

    // Dereferencing the pointer to access the value
    cout << "Value of num: " << num << endl;
    cout << "Value using pointer dereferencing: " << *ptr << endl;

    // Modifying value using pointer
    *ptr = 100;  
    cout << "Updated value of num: " << num << endl;

    return 0;
}

