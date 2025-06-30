#include <iostream>
using namespace std;
// Function with parameters and return value
int add(int a, int b) {
    return a + b;  // Returns the sum of a and b
}

int main() {
    int num1 = 5, num2 = 10;
    
    // Function call with arguments
    int sum = add(num1, num2);

    cout << "Sum: " << sum << endl;  // Output the returned value
    return 0;
}

