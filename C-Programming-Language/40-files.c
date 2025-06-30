#include <stdio.h>

int main() {
    FILE *filePtr;  // File pointer declaration
    char data[100];

    // Step 1: Create and Write to a File
    filePtr = fopen("example.txt", "w"); // Open file in write mode
    if (filePtr == NULL) {
        printf("Error opening file for writing!\n");
        return 1; // Exit if file cannot be opened
    }

    // Write data to the file
    fprintf(filePtr, "Hello, this is a test file!\n");
    fprintf(filePtr, "Writing to a file in C programming.\n");

    // Close the file after writing
    fclose(filePtr);
    printf("Data written to file successfully!\n");

    // Step 2: Read from the File
    filePtr = fopen("example.txt", "r"); // Open file in read mode
    if (filePtr == NULL) {
        printf("Error opening file for reading!\n");
        return 1;
    }

    printf("\nReading from file:\n");

    // Read and display the file content line by line
    while (fgets(data, sizeof(data), filePtr) != NULL) {
        printf("%s", data);
    }

    // Close the file after reading
    fclose(filePtr);

    return 0;
}

