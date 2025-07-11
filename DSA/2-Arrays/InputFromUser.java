import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        scanner.close();
    }    
}
