import java.util.*;

public class ImplementingStackInTheFormOfArrayList {
    class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        
        public boolean isEmpty(){
            return list.size() == 0;
        }

        public int pop(){
            int top = list.get(list.size() - 1); // Get the top element
            list.remove(list.size() - 1); // Remove the top element
            return top; // Return the top element
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        ImplementingStackInTheFormOfArrayList stack = new ImplementingStackInTheFormOfArrayList();
        Stack s = stack.new Stack();
        
        s.list.add(10);
        s.list.add(20);
        s.list.add(30);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
