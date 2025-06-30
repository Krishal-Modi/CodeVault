#include <stdio.h>

// Define an enumeration for days of the week
enum Day {
    SUNDAY,    // 0
    MONDAY,    // 1
    TUESDAY,   // 2
    WEDNESDAY, // 3
    THURSDAY,  // 4
    FRIDAY,    // 5
    SATURDAY   // 6
};

int main() {
    // Declare a variable of enum type
    enum Day today;

    // Assign a value from the enum
    today = WEDNESDAY;

    // Print the value
    printf("Today is day number: %d\n", today);

    // Check the day using if-else
    if (today == WEDNESDAY) {
        printf("It's midweek!\n");
    }

    return 0;
}

