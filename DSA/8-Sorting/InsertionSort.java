/*
- Insertion Sort is a simple comparison-based sorting algorithm.
- It builds the sorted array one element at a time by inserting each element into its correct position in the already sorted part of the array.
- Best case: O(n) → when the array is already sorted.
- Worst/Average case: O(n²) → when the array is reverse sorted or random.
- Space Complexity: O(1) (in-place sorting)
- Stable: Yes (does not change the relative order of equal elements)

Steps:

- Start from the second element (index 1).
- Compare it with elements in the sorted portion (left side) and shift larger elements to the right.
- Insert the element at its correct position.
- Repeat for all elements.
*/

import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements to sort:");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        // Insertion Sort Algorithm
        for(int i= 1 ; i< arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Sorted array:");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
        
}
