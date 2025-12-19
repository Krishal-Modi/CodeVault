/*

 **** Asymptotic Notations ****
 * Asymptotic notations are used to describe the behavior of functions as they approach infinity.
 * The most common asymptotic notations are:
 * 1. Big O Notation (O): Describes an upper bound on the time complexity.
 * 2. Omega Notation (Ω): Describes a lower bound on the time complexity.
 * 3. Theta Notation (Θ): Describes a tight bound on the time complexity.
 

 **** Best Case ****
    * Best case refers to the scenario where the algorithm performs the minimum number of operations.
    * Notation: Often described using Ω (Omega).
    Example: 
        int[] arr = {3, 5, 7, 9};
        int target = 3;  // Found at index 0
    Time Complexity: Ω(1)

 **** Average Case ****
    * Average case refers to the expected performance of the algorithm over all possible inputs.
    * Notation: Often described using Θ (Theta).
    Example: 
        On average, the linear search will find the target in the middle of the array.
    Time Complexity: Θ(n/2) = Θ(n)

 **** Worst Case ****
    * Worst case refers to the scenario where the algorithm performs the maximum number of operations.
    * Notation: Often described using O (Big O).
    Example: 
        int[] arr = {1, 2, 3, 4, 5};  // Target not found
        Time Complexity: O(n)

*/

/*

    **** Asymptotic Notations ****

    ** Big O Notation (O) **

      - Describes the maximum time an algorithm can take.
      - At most this much time
      - Ignores constants and lower-order terms.
      - Upper bound and worst case scenario.
      - Example: O(n^2) means the algorithm's time complexity grows quadratically with the input size.

    ** Omega Notation (Ω) **

        - Describes the minimum time an algorithm can take.
        - At least this much time
        - Ignores constants and lower-order terms.
        - Lower bound and best case scenario.
        - Example: Ω(n) means the algorithm's time complexity grows linearly with the input size.

    ** Theta Notation (Θ) **

        - Describes the exact time an algorithm takes.
        - Both upper and lower bound.
        - Ignores constants and lower-order terms.
        - Example: Θ(n log n) means the algorithm's time complexity grows logarithmically with the input size.
    
    ** Small o Notation (o) **

        - Describes a function that grows slower than another function.
        - Example: o(n^2) means the algorithm's time complexity grows slower than n^2.
    
    ** Small omega Notation (ω) **
        - Describes a function that grows faster than another function.
        - Example: ω(n) means the algorithm's time complexity grows faster than n.
*/
