/*

-> What is Counting Sort? 

- Counting Sort is a non-comparison sorting algorithm that works by:
- Counting how many times each value appears
- Using those counts to place elements in sorted order
- It works only when numbers are in a small, known range.

-> Time & Space Complexity 
Case	                Complexity
Best / Average / Worst	O(n + k)
Space	                O(k)

Where:
- n = number of elements
- k = range of values (max − min)

-> When to Use Counting Sort 

- Small range of integers (like 0–100)
- Repeated values
- As a sub-step in Radix Sort

- Not good for:

- Large ranges (0 to 10⁹)

- Floating-point numbers

*/

public class CountingSort {
    static void countingSort(int[] arr) {
        int n = arr.length;

        // 1. Find the maximum value
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // 2. Create count array
        int[] count = new int[max + 1];

        // 3. Store the count of each number
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // 4. Modify count array to store cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // 5. Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // 6. Copy the sorted elements back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}