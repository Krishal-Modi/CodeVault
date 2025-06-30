import java.util.Scanner;

public class UpdatingAnArrayElement {
    public static void main(String[] args) {
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

        // Step 2: Input index to update
        System.out.print("Enter index to update (0 to " + (n - 1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
        } else {
        // Step 3: Input new value
            System.out.print("Enter new value: ");
            int newValue = sc.nextInt();

        // Step 4: Update
            arr[index] = newValue;

        // Step 5: Print updated array
            System.out.println("Array after update:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }   
}
