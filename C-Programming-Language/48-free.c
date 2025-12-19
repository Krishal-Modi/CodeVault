#include <stdio.h>
#include <stdlib.h>  // Required for malloc() and free()

int main() {
    int *ptr;

    // Allocate memory for 5 integers
    ptr = (int*) malloc(5 * sizeof(int));

    if (ptr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }
	int i;
    // Assign values
    for (i = 0; i < 5; i++) {
        ptr[i] = i + 1;
    }

    printf("Allocated values: ");
    for (i = 0; i < 5; i++) {
        printf("%d ", ptr[i]);
    }

    free(ptr);  // Free allocated memory
    ptr = NULL; // Avoid dangling pointer

    printf("\nMemory freed successfully!\n");
    return 0;
}

