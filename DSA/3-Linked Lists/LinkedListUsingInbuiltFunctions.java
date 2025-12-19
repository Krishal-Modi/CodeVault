import java.util.*;

public class LinkedListUsingInbuiltFunctions {
    
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("A");
        list.addFirst("B");
        list.addLast("C");
        list.add("D");

        System.out.println(list);
    
        System.out.println(list.size());

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + "->");

        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println("After removing first element: " + list);

        // list.removeLast();
        // System.out.println("After removing last element: " + list);

        list.remove(1);
        System.out.println("After removing element at index 3: " + list);
    }

}
