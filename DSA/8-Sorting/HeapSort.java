/*

-> What is Heap Sort?

- Heap Sort is a comparison-based sorting algorithm that uses a special data structure called a Heap.
- A heap is a complete binary tree where: 
- Max Heap → Parent node is greater than or equal to its children
- Min Heap → Parent node is less than or equal to its children
- Heap Sort uses a Max Heap to sort elements in ascending order.

-> Min Heap - Ascending Order
         10
        /  \
      9     8
     / \   / \
    7  6  5   4

-> Max Heap - Descending Order
         1
        /  \
      2     3
     / \   / \
    4  5  6   7

-> Basic Idea of Heap Sort

- Build a Max Heap from the given array
- The largest element will be at the root (index 0)
- Swap the root with the last element
- Reduce heap size by 1
- Heapify the root again
- Repeat until array is sorted

-> Why Heap Sort?

- Time Complexity: O(n log n) (best, average, worst)
- Space Complexity: O(1) (in-place)
- No extra memory needed
- Faster than Bubble/Selection Sort for large data

*/

public class HeapSort {
    // Function to heapify a subtree
    static void heapify(int arr[], int n, int i) {
        int largest = i;       // root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If root is not largest
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Main Heap Sort function
    static void heapSort(int arr[]) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    // Print array
    static void printArray(int arr[]) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int arr[] = {4, 10, 3, 5, 1};

        heapSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
