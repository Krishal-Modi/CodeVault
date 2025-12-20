import java.util.Scanner;
public class ImplementationOfBinarySearch {
    
    public int binarySearch(int[] arr, int searchElement){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] == searchElement){
                return mid;
            }
            else if(arr[mid] < searchElement){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            }
        return -1;
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element at arr[" + (i+1) + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();
        ImplementationOfBinarySearch search = new ImplementationOfBinarySearch();
        int result = search.binarySearch(arr, searchElement);
        if(result == -1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: " + (result + 1));
        }
        sc.close();
    }

}
