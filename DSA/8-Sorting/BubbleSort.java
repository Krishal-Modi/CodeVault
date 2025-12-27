/*
-> Bubble Sort (Concise Explanation)

    - Bubble Sort is a simple comparison-based sorting algorithm where adjacent elements are repeatedly compared and swapped if they are in the wrong order. After each pass, the largest element moves (“bubbles”) to the end of the list.

-> How It Works
    - Compare adjacent elements.
    - Swap if they are in the wrong order.
    - Repeat for the entire array.
    - After each pass, one element is placed in its correct position.
    - Stop early if no swaps occur (optimized version).

-> Complexity

    - Best Case: O(n) (already sorted)
    - Average/Worst Case: O(n²)
    - Space: O(1)
    - Stable: Yes
    - In-place: Yes

-> Use Case

    - Best for small datasets and learning purposes.

*/

import java.util.Scanner;

public class BubbleSort{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bubble Sort Implementation!!");
        System.out.println("Enter number of Element you want : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the a[" + (i+1) + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
        // Sorting 
        for(int i = 0; i<n-1 ;i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
    }

        // After Sorting 
        System.out.println("\nAfter Sorting : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}