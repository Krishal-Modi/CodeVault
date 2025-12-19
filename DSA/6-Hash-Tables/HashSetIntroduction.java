/*

    ** HashSet

    A HashSet is a collection that:

    - Does not allow duplicate elements
    - Does not maintain any order
    - Allows null (only one null element)
    - Offers constant time (O(1)) performance for add, remove, and contains operations (on average)
    - It is defined in java.util package and implements the Set interface.

    ** Basic Operations

    | Operation      | Method Example           | Description                      |
    | -------------- | ------------------------ | -------------------------------- |
    | Add Element    | `set.add("apple");`      | Adds an element to the set       |
    | Remove Element | `set.remove("apple");`   | Removes an element from the set  |
    | Check Exists   | `set.contains("apple");` | Returns `true` if element exists |
    | Size           | `set.size();`            | Returns the number of elements   |
    | Iterate        | `for(String s : set)`    | Loops through elements           |
    | Clear Set      | `set.clear();`           | Removes all elements from set    |
    | Is Empty       | `set.isEmpty();`         | Checks if set is empty           |

    ** Internal Working of HashSet

    - HashSet internally uses a HashMap.
    - When you add an element to HashSet, it is stored as a key in the HashMap, 
      and a dummy object (PRESENT) is used as the value.
    - Hashing is used to store and retrieve elements quickly.


    ** Time Complexity
    | Operation | Time Complexity |
    | --------- | --------------- |
    | Add       | O(1) average    |
    | Remove    | O(1) average    |
    | Search    | O(1) average    |

    ** When to Use HashSet

    - You want to store a collection of unique elements.
    - You don’t care about the insertion order.
    - You want fast operations (add/search/delete).

 */


import java.util.HashSet; 
// import java.util.Iterator;
public class HashSetIntroduction{

    public static void main(String[] args){
        // Creating a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate, will not be added

        // Search 
        if(set.contains(20)){
            System.out.println("Set contains 20");
        } else {
            System.out.println("Set does not contain 20");
        }

        // Delete an element
        set.remove(20);
        System.out.println("After removing 20, set contains: " + set);
        
        // Size of the set
        System.out.println("Size of the set: " + set.size());

        // // Iterator
        // System.out.println("Iterating through the set:");
        // Iterator it = set.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

    }

}