#include <stdio.h>
#include <string.h>

// Define a structure
struct Student {
    int id;
    char name[50];
    float marks;
};

int main() {
    // Declare a structure variable
    struct Student s1 = {101, "Alice", 89.5};

    // Declare a pointer to the structure
    struct Student *ptr;

    // Assign the address of s1 to the pointer
    ptr = &s1;

    // Access structure members using the arrow operator
    printf("Student ID: %d\n", ptr->id);
    printf("Student Name: %s\n", ptr->name);
    printf("Student Marks: %.2f\n", ptr->marks);

    return 0;
}

