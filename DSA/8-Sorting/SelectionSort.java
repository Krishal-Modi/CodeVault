/*
-> Definition:
- Selection Sort repeatedly finds the smallest element from the unsorted part of the array and places it at the beginning.

-> How it works:

1. Start from index i
2. Find the minimum element from i to n-1
3. Swap it with element at index i
4. Repeat for all positions

-> Example:
- [64, 25, 12, 22, 11] → [11, 12, 22, 25, 64]

-> Complexity:

- Time: O(n²) (best/avg/worst)
- Space: O(1) (in-place)
- Stable: No

*/

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
