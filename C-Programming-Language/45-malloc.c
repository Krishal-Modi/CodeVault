#include <stdio.h>
#include <stdlib.h>  // Required for malloc()

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

    // Print values
    printf("Malloc allocated values: ");
    for (i = 0; i < 5; i++) {
        printf("%d ", ptr[i]);
    }

    free(ptr);  // Free allocated memory
    return 0;
}

