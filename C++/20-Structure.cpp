#include <iostream>

using namespace std;

// Define a structure
struct Person {
    string name;
    int age;
};

int main() {
    // Create a structure variable
    Person p1;

    // Assign values
    p1.name = "Alice";
    p1.age = 25;

    // Print values
    cout << "Name: " << p1.name << endl;
    cout << "Age: " << p1.age << endl;

    return 0;
}

