// import java.util.*;
import java.util.LinkedList;


public class LL_CollFrame {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");

        // by default it adds last
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i =0; i<list.size(); i++){
            String element = list.get(i);
            System.out.print(element + "-->");
        }
        System.out.println("null");

        // last and also from a particular index.
        list.removeFirst();
        System.out.println(list);
        

    }
    
}
