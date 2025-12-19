#include <stdio.h>

// Define structure
struct mystudent {
    char name[20];
    int age;
};

int main() {
    // Initialize structure using direct initialization
    struct mystudent s1 = {"Ram", 20};

    // Print values
    printf("%s is %d years old\n", s1.name, s1.age);

    return 0;
}

