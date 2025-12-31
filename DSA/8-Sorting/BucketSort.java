/* 

-> What is Bucket Sort? 
- Bucket Sort works by:
- Dividing elements into buckets
- Sorting each bucket individually
- Merging all buckets to get the final sorted array
- It is mainly used when numbers are uniformly distributed.

Time & Space Complexity
Case        	Complexity
Best / Average	O(n + k)
Worst	        O(n²)
Space	        O(n + k)

*/

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void bucketSort(int[] arr) {
        int n = arr.length;

        // 1. Create buckets
        ArrayList<Integer>[] buckets = new ArrayList[10];

        for (int i = 0; i < 10; i++)
            buckets[i] = new ArrayList<>();

        // 2. Put elements into buckets
        for (int num : arr) {
            int bucketIndex = num / 10; // range 0–99
            buckets[bucketIndex].add(num);
        }

        // 3. Sort individual buckets
        for (int i = 0; i < 10; i++)
            Collections.sort(buckets[i]);

        // 4. Merge buckets
        int index = 0;
        for (int i = 0; i < 10; i++) {
            for (int num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {42, 32, 33, 52, 37, 47, 51};

        bucketSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
