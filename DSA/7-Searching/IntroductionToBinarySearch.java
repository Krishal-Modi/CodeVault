/* 
-> Binary Search (Short & Clear Explanation)

- Binary Search is an efficient searching algorithm used to find an element in a sorted array.

-> How it works:

1. Find the middle element of the array.
2. Compare the middle element with the target:
- If equal → element found.
- If target is smaller → search the left half.
- If target is larger → search the right half.
3. Repeat until the element is found or the range becomes empty.
-> Important points:

- Array must be sorted (ascending or descending).
- Faster than Linear Search.

-> Time Complexity:

- Best case: O(1)
- Worst & Average case: O(log n)

Example:

Array: [10, 20, 30, 40, 50], Search: 30

Middle = 30 → element found.

- Binary Search reduces the search space by half each time, which makes it very efficient
*/