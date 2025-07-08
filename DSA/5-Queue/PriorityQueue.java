/*

    Priority Queue

    A Priority Queue is a special type of queue where each element has a priority,
    and elements with higher priority are dequeued before elements with lower priority, 
    regardless of the order in which they were added.

    Unlike a regular queue (FIFO), the element that is served is not necessarily 
    the one that was added first—it’s the one with the highest priority.

    Types of Priority Queues:
    1. Min-Priority Queue: The element with the smallest value has the highest priority.
    2. Max-Priority Queue: The element with the largest value has the highest priority.

 */

public class PriorityQueue{
    static class Node {
        int data;
        int priority;
        Node next;

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // Add element in the right place based on priority
        public void add(int data, int priority) {
            Node newNode = new Node(data, priority);
            if (isEmpty() || priority > head.priority) {
                newNode.next = head;
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null && temp.next.priority >= priority) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        // Remove highest priority element
        public int remove() {
            if (isEmpty()) {
                System.out.println("Priority Queue is empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        // Peek highest priority element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Priority Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue pq = new Queue();

        // add(data, priority)
        pq.add(10, 2);  // lower priority
        pq.add(20, 4);  // higher priority
        pq.add(30, 3);
        pq.add(40, 5);  // highest priority
        pq.add(50, 1);  // lowest priority

        while (!pq.isEmpty()) {
            System.out.println("Processing: " + pq.peek());
            pq.remove();
        }
    }
}