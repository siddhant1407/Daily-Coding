import java.util.*;
public class StackColl {

    public static void pushAtBottom(int val, Stack<Integer>s){
        if (s.isEmpty()){
            s.push(val);
            return;
        }
        // get the top elem out.
        int top = s.pop();

        // call recurssion with a new head. (this will reach the end).
        pushAtBottom(val, s);
        // again push the top inside.
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Only activate when only doinf the "Push at the Bottom Operation".
        // pushAtBottom(4, stack);

        reverse(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
    
}
