/*

 *** Introduction to Arrays in Java
    * An array is a collection of elements of the same type, stored in contiguous memory locations.
    * Arrays are used to store multiple values in a single variable, instead of declaring separate variables 
        for each value.
    * Arrays can be of any data type, including primitive types (int, char, etc.) and reference types (String, objects, etc.).
    * The length of an array is fixed once it is created, and cannot be changed.
    * Arrays are zero-indexed, meaning the first element is at index 0, the second at index 1, and so on.
    * The length of an array can be accessed using the `length` property.
    * Arrays can be multidimensional, allowing for the creation of matrices or tables.

    | Index | Value | Memory Address (Assume base = 1000) |
    | ----- | ----- | ----------------------------------- |
    | arr[0]| 10    | 1000                                |
    | arr[1]| 20    | 1004                                |
    | arr[2]| 30    | 1008                                |
    | arr[3]| 40    | 1012                                |


    * Formula to find address of an Element 
    Address(arr[i]) = BaseAddress + (i × SizeOfElement)



    * 4 operations of Array
        1. Insertion
        2. Deletion
        3. Updation
        4. Traversal

    */

public class Introduction{
    public static void main(String[] args){

        // int arr[] = new int[5];   OR
        // int arr[] = {10, 20, 30, 40, 50}; // Array Initialization
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Array Length: " + arr.length);
        System.out.println("arr[3] : " + arr[3]);
        System.out.println("Array Elements:");
        
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

         

    }
}