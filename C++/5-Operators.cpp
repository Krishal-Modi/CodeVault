#include <iostream>
using namespace std;

int main() {
    // Variable initialization
    int a = 10, b = 5, c;
    float f1 = 3.14, f2 = 2.718, f3;

    // Arithmetic operators
    cout << "Arithmetic Operators:" << endl;
    cout << "a + b = " << a + b << endl;
    cout << "a - b = " << a - b << endl;
    cout << "a * b = " << a * b << endl;
    cout << "a / b = " << a / b << endl;
    cout << "a % b = " << a % b << endl;  // Modulo operation for integers

    // Relational operators
    cout << "\nRelational Operators:" << endl;
    cout << "a == b: " << (a == b) << endl;
    cout << "a != b: " << (a != b) << endl;
    cout << "a > b: " << (a > b) << endl;
    cout << "a < b: " << (a < b) << endl;
    cout << "a >= b: " << (a >= b) << endl;
    cout << "a <= b: " << (a <= b) << endl;

    // Logical operators
    cout << "\nLogical Operators:" << endl;
    cout << "(a > b) && (b < a): " << ((a > b) && (b < a)) << endl;
    cout << "(a > b) || (b > a): " << ((a > b) || (b > a)) << endl;
    cout << "!(a == b): " << !(a == b) << endl;

    // Bitwise operators
    cout << "\nBitwise Operators:" << endl;
    cout << "a & b: " << (a & b) << endl;  // AND operation
    cout << "a | b: " << (a | b) << endl;  // OR operation
    cout << "a ^ b: " << (a ^ b) << endl;  // XOR operation
    cout << "~a: " << (~a) << endl;        // NOT operation
    cout << "a << 1: " << (a << 1) << endl; // Left shift operation
    cout << "a >> 1: " << (a >> 1) << endl; // Right shift operation

    // Assignment operators
    cout << "\nAssignment Operators:" << endl;
    c = a; cout << "c = a: " << c << endl;
    c += b; cout << "c += b: " << c << endl;
    c -= b; cout << "c -= b: " << c << endl;
    c *= b; cout << "c *= b: " << c << endl;
    c /= b; cout << "c /= b: " << c << endl;
    c %= b; cout << "c %= b: " << c << endl;

    // Increment and Decrement operators
    cout << "\nIncrement and Decrement Operators:" << endl;
    cout << "a++: " << a++ << " (Post-increment), a = " << a << endl;
    cout << "++a: " << ++a << " (Pre-increment)" << endl;
    cout << "b--: " << b-- << " (Post-decrement), b = " << b << endl;
    cout << "--b: " << --b << " (Pre-decrement)" << endl;

    // Conditional (Ternary) operator
    cout << "\nTernary Operator:" << endl;
    c = (a > b) ? a : b;  // If a > b, c = a, else c = b
    cout << "c = (a > b) ? a : b;  c = " << c << endl;

    // Typecast operators
    cout << "\nTypecast Operators:" << endl;
    f3 = static_cast<float>(a) / b;  // Typecasting int to float
    cout << "f3 = static_cast<float>(a) / b: " << f3 << endl;

    return 0;
}

