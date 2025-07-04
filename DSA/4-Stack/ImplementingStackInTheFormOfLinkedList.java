// Implementation of stack using Linked List 

public class ImplementingStackInTheFormOfLinkedList{
    
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head; // Link the new node to the current head
            head = newNode; // Update head to be the new node
        }

        public int pop(){
            int top = head.data; // Get the top element
            head = head.next; // Move head to the next element
            return top; // Return the popped element
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            return head.data; // Return the top element without removing it
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        while(!stack.isEmpty()){
            System.out.println("Top element: " + stack.peek());
            System.out.println("Popped element: " + stack.pop());
        }
    }
}