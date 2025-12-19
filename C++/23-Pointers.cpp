#include <iostream>

int main() {
    int num = 10;       // A normal integer variable
    int* ptr = &num;    // Pointer storing the address of 'num'

    std::cout << "Value of num: " << num << std::endl;
    std::cout << "Address of num: " << &num << std::endl;
    std::cout << "Pointer ptr stores: " << ptr << std::endl;
    std::cout << "Value pointed by ptr: " << *ptr << std::endl;

    return 0;
}

