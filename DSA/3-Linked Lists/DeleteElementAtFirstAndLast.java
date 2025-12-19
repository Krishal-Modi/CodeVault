public class DeleteElementAtFirstAndLast{
    
    Node head;    
    private int size;
    // Constructor
    DeleteElementAtFirstAndLast(){
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

    
    // Add at first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // Delete First
    public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        size--;
        head = head.next;

   }

    // Delete Last
    public void deleteLast(){
        if(head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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


    public static void main(String[] args) {
        DeleteElementAtFirstAndLast list = new DeleteElementAtFirstAndLast();
        
        list.addFirst("World");
        list.addFirst("Hello");
        list.addFirst("World");
        list.addFirst("Hello");

        System.out.println("Original List:");
        list.printList();

        System.out.println("Now After performing deleteFirst() and deleteLast() operations:");
        list.deleteFirst();
        list.deleteLast();
        list.printList();

        System.out.println("Size : " + list.getSize());
    }
}
