import java.util.Scanner;

public class ImplementationOfLinearSearch {

    public void linearSearch(int[] arr, int searchedElement) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchedElement) {
                System.out.println("Element found at index: " + (i+1));
                found = true;
                break; // stop after finding
            }
        }

        if (!found) {
            System.out.println("Element not found in the array");
        }
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at arr[" + (i+1) + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchedElement = sc.nextInt();

        ImplementationOfLinearSearch search = new ImplementationOfLinearSearch();
        search.linearSearch(arr, searchedElement);

        sc.close();
    }
}
