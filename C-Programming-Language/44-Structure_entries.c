#include <stdio.h>

// Define structure for Student
struct Student {
    char name[20];
    int age;
    float marks;
};

int main() {
    // Declare and initialize multiple students
    struct Student students[3] = {
        {"Alice", 20, 85.5},
        {"Bob", 22, 90.0},
        {"Charlie", 21, 78.3}
    };

	int i;
    // Display student records
    printf("Student Records:\n");
    printf("------------------------------\n");
    for (i = 0; i < 3; i++) {
        printf("Name: %s, Age: %d, Marks: %.2f\n", students[i].name, students[i].age, students[i].marks);
    }

    return 0;
}

