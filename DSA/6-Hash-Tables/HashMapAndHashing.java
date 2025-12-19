/* 

    HashMap and Hashing

    HashMap : A Hash Map (also known as Hash Table) is a data structure that stores key-value pairs and 
    provides fast access (average-case O(1)) to values based on their keys.

    Example : 
        hash_map = {
        "name": "Alice",
        "age": 25,
        "city": "New York"
    }


    ** Why Hash Maps?
    Fast lookups, insertions, and deletions (O(1) average time complexity).

    Used in applications like:
    Caching
    Symbol tables in compilers
    Indexing data
    Counting frequencies

    ** Hashing 

    What is Hashing?
    Hashing is the process of converting a key into a fixed-size integer (called the hash code or hash value) using a 
    hash function.

    The hash code determines the index (or address) in the underlying array where the value will be stored.

    ** Hash Functions
    A hash function takes an input (or 'key') and returns an integer (the hash
    value). A good hash function should:

    ** Collisions
    A collision occurs when two different keys hash to the same index.
        hash("abc") % 10 = 3
        hash("xyz") % 10 = 3  # collision

        
        - Collision Resolution Strategies
            1) Chaining (Separate Chaining)
            Each index stores a linked list (or list/chain) of key-value pairs.

            If multiple keys hash to same index, they’re added to the list.

            Pros: Easy to implement
            Cons: Performance degrades with many collisions (becomes O(n))

            2) Open Addressing
            All elements are stored in the same array.

            If collision happens, find another open slot.

            Types:

            Linear Probing: Try next slot (index + 1) % size

            Quadratic Probing: Try (index + i²) % size

            Double Hashing: Use another hash function to determine the step size


    ** Load Factor
    Load Factor is the ratio of the number of elements in the hash map to the size of the underlying array.
    It helps determine when to resize the hash map.

    A = number of elements inserted
    N = size of the hash table
    Load Factor = A / N

    ** Rehashing 
    Rehashing is the process of resizing the hash map when the load factor exceeds a certain threshold (commonly 0.7).

    When rehashing, a new larger array is created, and all existing key-value pairs are rehashed and inserted into the new array.
    This ensures that the average time complexity remains O(1) for lookups, insertions, and deletions.


 */