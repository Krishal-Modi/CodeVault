#include <stdio.h>
#include <stdlib.h>  // Required for realloc()

int main() {
    int *ptr;

    // Allocate memory for 3 integers
    ptr = (int*) malloc(3 * sizeof(int));

    if (ptr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

	int i;
    // Assign values
    for (i = 0; i < 3; i++) {
        ptr[i] = i + 1;
    }

    // Resize memory to hold 5 integers
    ptr = (int*) realloc(ptr, 5 * sizeof(int));

    if (ptr == NULL) {
        printf("Memory reallocation failed!\n");
        return 1;
    }

    // Assign new values
    ptr[3] = 4;
    ptr[4] = 5;

    // Print values after reallocation
    printf("Realloc updated values: ");
    for (i = 0; i < 5; i++) {
        printf("%d ", ptr[i]);
    }

    free(ptr);  // Free allocated memory
    return 0;
}

