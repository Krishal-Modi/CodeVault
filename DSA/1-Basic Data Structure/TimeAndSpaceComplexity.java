/*

 -> Any Algorithm can be analyzed in terms of time and space complexity.

 *****) Time Complexity

 - Definition: Time complexity tells you how much time an algorithm takes to finish, based on the size of the input.

     Types of cases:
        - Best Case: Fastest possible scenario (e.g., item found early)
        - Worst Case: Slowest scenario
        - Average Case: Expected case with random inputs

        - time depends on size of input

        - We always consider the worst case scenario when analyzing time complexity. 
        because time will never go above that, thatswhy we always talk about Big O (Worst case)

            Time complexity Comparision

          Compare         O(n)            O(n^2)            O(n^3)
            n=1            1                1                 1
            n=2            2                4                 8
            n=3            3                9                 27
            n=10^5        10^5            10^10              10^30


 *****) Space Complexity

 - Definition: Space complexity tells you how much extra memory (RAM) your algorithm needs to do its job.

     - Space complexity of an algorithm quantifies the amount of space or 
        memory taken by an algorithm to run as a function of the length of the 
        input

    ***) Cheat Sheet for Time and Space Complexity
         https://www.bigocheatsheet.com/

        
 */

 /*
 
    -> Example 1
    int x = 5;
    Time Complexity: O(1) (constant time, no loops)
    Space Complexity: O(1) (constant space, one variable)

    -> Example 2
    for (int i = 0; i < n; i++) {
        System.out.println(i);
    }
    Time Complexity: O(n) (linear time, loop runs n times)
    Space Complexity: O(1) (constant space, no extra data structures)

    -> Example 3
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println(i + ", " + j);
        }
    }
    Time Complexity: O(n^2) (quadratic time, nested loops)
    Space Complexity: O(1) (constant space, no extra data structures)
    
  */

/*

    ***** Common Runtimes

    -> Constant Time: O(1)
        int x = arr[0];
        - Definition: The algorithm takes the same amount of time regardless of input size. 
        - Time Complexity: O(1) (constant time, no loops)
        - Space Complexity: O(1) (constant space, one variable)

    -> Linear Time: O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        - Definition: The algorithm's time grows linearly with the input size.
        - Time Complexity: O(n) (linear time, loop runs n times)
        - Space Complexity: O(1) (constant space, no extra data structures)

    -> Logarithmic Time: O(log n)
        while (n > 1) {
            n /= 2;
        }
        - Definition: The algorithm's time grows logarithmically with the input size.
        - Time Complexity: O(log n) (logarithmic time, halving the input each iteration)
        - Space Complexity: O(1) (constant space, no extra data structures)

    -> Quadratic Time: O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
        - Definition: The algorithm's time grows quadratically with the input size.
        - Time Complexity: O(n^2) (quadratic time, nested loops)
        - Space Complexity: O(1) (constant space, no extra data structures)

    -> Exponential Time: O(2^n)
        int fib(int n) {
            if (n <= 1) return n;
            return fib(n - 1) + fib(n - 2);
        }
        - Definition: The algorithm's time grows exponentially with the input size.
        - Time Complexity: O(2^n) (exponential time, recursive Fibonacci)
        - Space Complexity: O(n) (linear space due to recursion stack)

    -> Factorial Time: O(n!)
        void permute(String str, String ans) {
            if (str.length() == 0) {
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                permute(ros, ans + ch);
            }
        }
        - Definition: The algorithm's time grows factorially with the input size.
        - Time Complexity: O(n!) (factorial time, generating permutations)
        - Space Complexity: O(n) (linear space due to recursion stack)
    
*/