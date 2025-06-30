#include <stdio.h>

int main() {
    int i, j;

    for (i = 0; i < 6; i++) {
        for (j = 0; j < 6; j++) {
            if (i >= 1 && i <= 4 && j >= 1 && j <= 4) {
                printf(" ");
            } else {
                printf("*");
            }
        }
        printf("\n");
    }

    return 0;
}

