#include <stdio.h>

int main() {
    int i, j;
    int a[3][3];  // Declare a 3x3 matrix

    // Input matrix values
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
            printf("Enter the value of a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }

    // Display the matrix
    printf("\nThe matrix is:\n");
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
            printf("%d ", a[i][j]);  // Print each value with space separation
        }
        printf("\n");  // New line after each row
    }

    return 0;  // Return statement to indicate successful execution
}

