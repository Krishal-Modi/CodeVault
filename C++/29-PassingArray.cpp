#include <iostream>

// Function to display elements of an array
void printArray(int arr[], int size) {
    std::cout << "Array elements: ";
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
}

int main() {
    int numbers[] = {1, 2, 3, 4, 5}; // Array declaration
    int size = sizeof(numbers) / sizeof(numbers[0]); // Calculate size of array

    printArray(numbers, size); // Function call, passing array and its size

    return 0;
}

