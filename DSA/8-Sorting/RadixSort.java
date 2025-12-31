/*

-> What is Radix Sort? 

- Radix Sort is a non-comparison sorting algorithm.
- That means it does not compare numbers directly like bubble sort or quick sort.
- Instead, it sorts numbers digit by digit.

-> Key Idea (Very Important)

-> Radix Sort:
- Sorts numbers from the least significant digit (LSD) to the most significant digit (MSD)
- Uses a stable sort (usually Counting Sort) for each digit

*/
public class RadixSort {
    
    
    static void radixSort(int[] arr) {
        int max = arr[0];

        // find maximum number
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        // sort by each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] output = new int[arr.length];
            int[] count = new int[10];

            // count digits
            for (int i = 0; i < arr.length; i++)
                count[(arr[i] / exp) % 10]++;

            // cumulative count
            for (int i = 1; i < 10; i++)
                count[i] += count[i - 1];

            // build output array
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            // copy back
            for (int i = 0; i < arr.length; i++)
                arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }

}
