/*

-> How it works (simple steps):
- Choose a pivot element (usually first, last, or middle).
- Partition the array:
- Elements smaller than pivot go to the left.
- Elements greater than pivot go to the right.
- Recursively apply the same steps to left and right subarrays.
- The array becomes sorted automatically.

Case	Time
Best	O(n log n)
Average	O(n log n)
Worst	O(n²) (when pivot is smallest or largest)



*/

public class QuickSort {
    // This function applies Quick Sort on the array
    static void quickSort(int[] arr, int low, int high) {

        // Check if there are at least two elements to sort
        if (low < high) {

            // Partition the array and get pivot's correct position
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // This function places the pivot element at correct position
    // and arranges smaller elements to left and larger to right
    static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot
        int pivot = arr[high];

        // i keeps track of the index for smaller elements
        int i = low - 1;

        // Traverse through all elements from low to high-1
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++; // Move index of smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of pivot element
        return i + 1;
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Given unsorted array
        int[] arr = {8, 3, 1, 7, 0, 10, 2};

        // Call quick sort on the full array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
