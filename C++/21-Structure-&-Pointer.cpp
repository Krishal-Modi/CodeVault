#include <iostream>

using namespace std;

// Define a structure
struct Person {
    string name;
    int age;
};

int main() {
    // Create a structure variable
    Person p1 = {"Alice", 25};

    // Create a pointer to the structure
    Person* ptr = &p1;

    // Access members using pointer
    cout << "Name: " << ptr->name << endl;
    cout << "Age: " << ptr->age << endl;

    return 0;
}

