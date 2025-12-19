#include <stdio.h>
#include <stdlib.h>  // Required for calloc()

int main() {
    int *ptr;

    // Allocate memory for 5 integers (all initialized to 0)
    ptr = (int*) calloc(5, sizeof(int));

    if (ptr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

	int i;
    // Print values (default: 0)
    printf("Calloc allocated values: ");
    for (i = 0; i < 5; i++) {
        printf("%d ", ptr[i]);
    }

    free(ptr);  // Free allocated memory
    return 0;
}

