public class InsertElementAtDifferentPositions {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    
    // Add at first
    public void addFirst(String data) {
        Node newNode = new Node(data);  // Create a new node with given data
        if (head == null) {             // If the list is empty
            head = newNode;             // Set head to new node
            return;
        }
        newNode.next = head;            // Link the new node to the current head
        head = newNode;                 // Update head to be the new node
    }



    // Add at last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;  // Start from the head
        while (current.next != null) { // going to the last node
            current = current.next; // Move to the next node
        }
        current.next = newNode; // Link the last node to the new node
    }


    // Add at a specific position (in between)
    public void addAtPosition(String data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        InsertElementAtDifferentPositions list = new InsertElementAtDifferentPositions();
        
        list.addFirst("World");
        list.addFirst("Hello");
        list.addLast("Friend");
        
        list.printList(); // Hello -> World -> Friend -> NULL
        
        list.addAtPosition("Dear", 2);  // Insert "Dear" at index 2
        list.printList(); // Hello -> World -> Dear -> Friend -> NULL
    }
}
