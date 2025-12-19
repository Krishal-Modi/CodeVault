/*

    * HashMapIntroduction

    A HashMap in Java is a part of the java.util package and implements the Map interface. 
    It allows you to store key-value pairs, where each key is unique and maps to a specific value.

    Structure

    - Uses an array of Nodes (buckets).
    - Each node contains a key, value, hash, and next (pointer to next node).
    - The position of the key in the array is decided by hashing.

    Key Concepts

    1. Hash Function

    - A key is passed through hashCode() → hash value.
    - The hash value is used to find the index in the internal array.
    - Index = hash % capacity.

    2. Collision Handling

    - If two keys produce the same index (collision), HashMap stores them in a LinkedList (or Tree after Java 8 if too many collisions).
    - In that case, it checks .equals() to see if the key already exists.
 
    */

import java.util.HashMap;
public class HashMapIntroduction {

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("USA", 330);
        map.put("China", 140); 
   
        System.out.println(map);

        // Search
        if(map.containsKey("USA")){
            System.out.println("USA population: " + map.get("USA"));
        } else {
            System.out.println("USA not found in the map");
        }

        // for ( Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println("Country: " + entry.getKey() + ", Population: " + entry.getValue());
        // }

    }

}
