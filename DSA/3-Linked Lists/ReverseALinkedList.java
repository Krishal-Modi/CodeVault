// Reverse a Linked List without using extra memory
// Space Complexity: O(1) 

/*  If we do like traverse from end to first node and store it in the new list then its complexity becomes O(n)
 and we are using extra memory.
*/
 public class ReverseALinkedList {
   Node head;    
    private int size;
    // Constructor
    ReverseALinkedList(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add at last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Returning Size of the list
   public int getSize(){
    return size;
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

    // Reverse the linked list
    public void reverseIterate() {
        if(head == null || head.next == null) {
            System.out.println("List is empty, nothing to reverse.");
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next; // Store the next node
            currNode.next = prevNode; // Reverse the link
            prevNode = currNode; // Move prevNode to current
            currNode = nextNode; // Move to the next node
        }
        head.next = null; // Set the old head's next to null
        head = prevNode; // Update head to the new first node
    }


    public static void main(String[] args) {

        ReverseALinkedList list = new ReverseALinkedList();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.printList();
        list.reverseIterate();
        list.printList();
    }
    
}
