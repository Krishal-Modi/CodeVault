/*
-> What is Merge Sort?

- Merge Sort is a sorting algorithm that works on the idea of “divide and combine.”

-> Simple idea:

- Divide the array into smaller parts
- Sort the small parts
- Merge them back in sorted order

-> Why use Merge Sort?

- Very fast
- Time Complexity: O(n log n) (always)
- Works well for large data

-> Important Points to Remember (for exams & interviews)

- Divide and Conquer algorithm
- Time Complexity: O(n log n)
- Space Complexity: O(n)
- Stable sorting algorithm

*/


public class MergeSort {
    // This method divides the array and calls itself recursively
    static void mergeSort(int[] arr, int left, int right) {

        // Check if there is more than one element
        if (left < right) {

            // Find the middle index
            int mid = (left + right) / 2;

            // Recursively sort the left half of the array
            mergeSort(arr, left, mid);

            // Recursively sort the right half of the array
            mergeSort(arr, mid + 1, right);

            // Merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    // This method merges two sorted parts of the array
    static void merge(int[] arr, int left, int mid, int right) {

        // Size of left sub-array
        int n1 = mid - left + 1;

        // Size of right sub-array
        int n2 = right - mid;

        // Temporary arrays to store left and right parts
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into left temporary array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy data into right temporary array
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Index variables
        int i = 0;     // index for left array
        int j = 0;     // index for right array
        int k = left;  // index for original array

        // Compare elements and merge them in sorted order
        while (i < n1 && j < n2) {

            // If left element is smaller or equal
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++; // move left index
            } 
            // If right element is smaller
            else {
                arr[k] = R[j];
                j++; // move right index
            }
            k++; // move original array index
        }

        // Copy remaining elements of left array (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array (if any)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main method (program starts here)
    public static void main(String[] args) {

        // Input array
        int[] arr = {8, 3, 5, 2, 7};

        // Call merge sort on full array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
