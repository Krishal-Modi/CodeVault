/*
    Queue

    Definition : A Queue is a linear data structure that follows the FIFO principle:
        First In First Out : The element added first is removed first.
 
    | Term                     | Meaning                                                                     |
    | ------------------------ | --------------------------------------------------------------------------- |
    | **Front**                | Points to the **first** element in the queue (the one to be removed next).  |
    | **Rear**                 | Points to the **last** element in the queue (where new elements are added). |
    | **Enqueue**              | Add an element **at the rear** of the queue.                                |
    | **Dequeue**              | Remove the element **from the front** of the queue.                         |
    | **Peek (or Front Peek)** | Just **view** the front element without removing it.                        |


    Queue:      [10, 20, 30, 40]
    Indexes:     ↑            ↑
               Front         Rear

    10 is the front (first to come out)
    40 is the rear (last added)


    ** Initial Value of Front and Rear:
    
    | Situation                   | Front                                       | Rear |
    | --------------------------- | ------------------------------------------- | ---- |
    | **Empty Queue**             | `-1`                                        | `-1` |
    | **After 1st Enqueue**       | `0`                                         | `0`  |
    | **Queue Full (Fixed Size)** | (Depends on implementation: rear == size-1) |      |


    ** Enqueue
    
    Check if queue is full (if using fixed-size array).
    If it's the first element, set front = 0.
    Increment rear, insert the element at rear.

    Initial: front = -1, rear = -1
    Enqueue(10): front = 0, rear = 0 → [10]
    Enqueue(20): rear = 1 → [10, 20]


    ** Dequeue
    
    Check if queue is empty (if front == -1).
    If it's the last element, reset front and rear to -1.
    Remove the element at front, increment front.

    Initial: front = 0, rear = 1 → [10, 20]
    Dequeue(): front = 1 → [20]
    Dequeue(): front = 2 → [] (reset front and rear to -1)
    Dequeue(): Queue is empty (front == -1)


    ** Peek
    
    Check if queue is empty (if front == -1).
    Returns the element at front without removing it.

    Queue: [_, 20, 30] front = 1
    Peek(): returns 20



    **) How Front and Rear Change During Operations

    | Operation   | Action                         | front     | rear |
    | ----------- | ------------------------------ | --------- | ---- |
    | Empty       | -                              | `-1`      | `-1` |
    | Enqueue(10) | first insert                   | `0`       | `0`  |
    | Enqueue(20) | another insert                 | stays `0` | `1`  |
    | Dequeue()   | remove element at `front` (10) | `1`       | `1`  |
    | Dequeue()   | remove 20 → queue empty again  | `-1`      | `-1` |



    ** Queue Overflow and Underflow

    Overflow: Trying to enqueue into a full queue (in fixed-size implementation).
    Underflow: Trying to dequeue from an empty queue.

*/




/*

    | Operation      | Description                                   | Time Complexity | Space Complexity |
    | -------------- | --------------------------------------------- | --------------- | ---------------- |
    | **Enqueue(x)** | Insert element at the **rear**                | `O(1)`          | `O(1)`           |
    | **Dequeue()**  | Remove element from the **front**             | `O(1)`          | `O(1)`           |
    | **Peek()**     | View front element without removing           | `O(1)`          | `O(1)`           |
    | **isEmpty()**  | Check if queue is empty                       | `O(1)`          | `O(1)`           |
    | **isFull()**   | Check if queue is full (only for fixed array) | `O(1)`          | `O(1)`           |

*/


/*

    Types of Queue 
    
    1. Simple Queue (Linear Queue)

    Follows FIFO (First In First Out)
    Insertion at rear, deletion from front
    Once the rear reaches the end, no more insertions (even if space at front is freed)
    Used in: printer queue, task scheduling

    2. Circular Queue
    
    Improves on simple queue by making the queue circular
    Uses modulo (%) to reuse space
    Rear wraps to 0 when it reaches the end
    Efficient for fixed-size memory
    Used in: CPU scheduling, memory buffers

    3. Priority Queue
    
    Elements are served based on priority, not just arrival time
    Higher priority elements are dequeued first
    FIFO order applies only for elements with same priority
    Used in: job scheduling, emergency systems

*/