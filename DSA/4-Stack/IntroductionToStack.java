/*

    * Introduction to Stack Data Structure
    
    ** Definition:
        A stack is a linear data structure that follows the Last In First Out (LIFO) principle.


    ** Operations:
         Common Stack Operations (all in O(1) time):
            1. push(element):
            Adds an element to the top of the stack.

            2. pop():
            Removes and returns the top element from the stack.

            If the stack is empty, usually throws an error or returns null.

            3. peek() or top():
            Returns the top element without removing it.
            retrive the top element without removing it.
            Allows you to look at the current top of the stack.

            4. isEmpty():
            Returns true if the stack has no elements.

            5. size():
            Returns the number of elements in the stack.

            All operations above should ideally run in O(1) time (constant time).
 
    ** Use Of Top

        The top of the stack is the most recently added element that has not yet been removed.
        It is used to access the last element added to the stack without modifying the stack itself.
        This is useful for checking the current state of the stack or for decision-making based on the top element.
        If Stack is empty then top has value 0
        
            
*/