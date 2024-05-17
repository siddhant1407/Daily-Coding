import java.util.ArrayList;

public class StackClass {
    // 1) STACK Implemetation using LinkedList.
    static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    // 1) STACK Implemetation using LinkedList.
    static class StackLL{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        // insert in a LL from Front [Stack].
        public static void push(int val){
            Node newNode = new Node(val);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if (isEmpty()){
                return -1;
            } 
            int top = head.val;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            } 
            return head.val;
        }
        
    }


    // 2) STACK Implemetation using ArrayList.
    static class StackAL{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int val){
            list.add(val);
        }

        public static int pop(){ 
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }


    public static void main(String[] args) {
        // StackLL s = new StackLL();           //for LinkedList
        StackAL s = new StackAL();              //for ArrayList
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();

        }   
    }
    
}

