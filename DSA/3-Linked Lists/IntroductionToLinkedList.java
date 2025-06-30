// Linked List

/*

    Definition
    A Linked List is a linear data structure where elements (called nodes) 
    are stored in non-contiguous memory locations. Each node contains:
    
    - Data
    - Address (reference) to the next node

    Unlike arrays, linked lists allow dynamic memory allocation and easy insertion/deletion operations.


    class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    }


    ** Memory Allocation
    Nodes are allocated dynamically using new.

    Each node holds:
    Data (primitive or object)
    Reference to the next node (address-like behavior in Java)
    Not stored continuously like arrays — enables flexibility.

    ** Core Terms

    Head: First node of the linked list.
    Tail: Last node, where next is null.


    | Operation          | Singly Linked List | Array            |
    | ------------------ | ------------------ | ---------------- |
    | Access             | O(n)               | O(1)             |
    | Search             | O(n)               | O(n)             |
    | Insertion (start)  | O(1)               | O(n)             |
    | Insertion (end)    | O(n)               | O(n)             |
    | Insertion (middle) | O(n)               | O(n)    expensive|
    | Deletion           | O(n)               | O(n)             |
    | Space              | O(n)               | O(n)             |


    Advantage over Arrays: Insertions in the middle are easy because we just change references. 
    In arrays, shifting is required.
    

 */




 /*
  
    ** Basic Operations
    - Insertion: Add a new node at the beginning, end, or middle.
    - Deletion: Remove a node from the beginning, end, or middle.
    - Traversal: Visit each node to access or display data.
    - Searching: Find a node with specific data.

    ** Types of Linked Lists
    - Singly Linked List: Each node points to the next node.
    - Doubly Linked List: Each node points to both the next and previous nodes and in center the data.
    - Circular Linked List: Last node points back to the first node.



    - Singly Linked List Example:

    class SinglyNode {
    int data;
    SinglyNode next;
    }

    - Doubly Linked List Example:

    class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;
    }

    - Circular Linked List Example:
    Same way as singly linked list, but the last node points to the first node instead of null.

  */