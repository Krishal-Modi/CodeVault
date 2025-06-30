// Inserting the element at a specific index in an array
import java.util.Scanner;
public class InsertingAtIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];  // Fixed array size
        int n;  // Logical size (number of elements currently in array)

        // Input current number of elements
        System.out.print("Enter number of elements (max 9): ");
        n = sc.nextInt();

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input desired index and new value
        System.out.print("Enter the index where you want to insert: ");
        int index = sc.nextInt();

        // Validate index and capacity
        if (index < 0 || index > n || n >= arr.length) {
            System.out.println("Invalid index or array is full. Insertion not possible.");
        }

        System.out.print("Enter the value to insert: ");
        int value = sc.nextInt();

        // Shift elements right from the end to the index
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert new element
        arr[index] = value;
        n++;  // Update logical size

        // Print updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }    
}
