// Inserting Element at the desired index position in an array
import java.util.Scanner;
public class InsertingElementAtTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int n;

        System.out.println("Enter the Size of an Array (max 10): ");
        n = sc.nextInt();

        // Input the Element 
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        if(n >= arr.length){
            System.out.println("Array is full, cannot insert more elements.");
        } else {
            System.out.println("Enter the element to be inserted at the end: ");
            int element = sc.nextInt();
            arr[n] = element; // Insert at the end
            n++; // Increment the count of elements
        }

        // Display the array after insertion
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}