import java.util.Scanner;

public class RemovingElementAtIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];  // Fixed-size array
        int n;  // Number of elements

        // Step 1: Input elements
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Input index to remove
        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();

        // Step 3: Validate index
        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
        } else {
            // Step 4: Shift elements left
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            n--;  // Reduce logical size

            // Step 5: Print result
            System.out.println("Array after removing element at index " + index + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
