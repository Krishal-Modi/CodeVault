// Pushing the element at the bottom of the stack using Recursion
import java.util.*;
public class PushAtTheBottomProblem {
    
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data); // if stack is empty, push the data
            return;
        }
        int top = s.pop(); // pop the top element
        pushAtBottom(data, s);
        s.push(top);
    } 

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottom(4, s);

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

}
