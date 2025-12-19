/*

    Circular Queue

    A Circular Queue is a linear data structure that follows the FIFO principle, but unlike a normal queue, 
    it connects the end back to the beginning, making a circle.

    This solves the problem of wasted space in a normal (linear) queue when we keep removing elements from the front.   


    Front: Index of the first element.
    Rear: Index of the last element.
    Size: Total capacity of the queue.  
    Queue: The actual array or list to hold elements
 
    
    Example: 

    - Initial State:

    | Property | Value |
    | -------- | ----- |
    | `Front`  | `-1`  |
    | `Rear`   | `-1`  |

    - Enqueue

    Check if the queue is full:
    (rear + 1) % size == front

    If empty (front == -1), set both front and rear to 0.

    Else, move rear in a circular manner:
    rear = (rear + 1) % size

    Insert element at queue[rear].
 
    - Dequeue

    Check if the queue is empty (front == -1).

    Access and remove element at queue[front].

    If it's the last element, reset both front and rear to -1.

    Else, move front in a circular way:
    front = (front + 1) % size

    - Peek

    Check if the queue is empty (front == -1).
    Return the element at queue[front] without removing it.
   

    ** Working Example 

    Let’s say size = 5

    After 3 enqueues: [10, 20, 30, _, _], front=0, rear=2

    After 2 dequeues: [_, _, 30, _, _], front=2, rear=2

    Add two more: [_, _, 30, 40, 50], rear=4

    Now enqueue one more:
    (rear + 1) % 5 = 0, place at index 0: [60, _, 30, 40, 50], rear=0


    */

// Queue Implementation using Arrays in Java


public class CircularQueue {

    static class Queue {
        static int[] arr;
        int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
