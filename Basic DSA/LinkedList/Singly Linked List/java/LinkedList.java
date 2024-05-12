// SINGLY LINKEDLIST FROM SCRATCH.

public class LinkedList {

    Node head;

    // to get to know the size of LL
    private int size;

    // constructor to track the size.
    LinkedList(){
        this.size = 0;
    }

    // The Node Class
    class Node{
        String data;
        Node next;                  //Hey, I'm a node, and I can point to another node! 
        // It's a way of saying, "Hey, this variable next is a Node just like me."

        // Constructor: get default call- we initialize the values for the first node.
        Node(String data){
            this.data = data;
            this.next = null;
            size++;             //to track the size.
        }
    }

    // ::::::::::::::ADD Operations.
    // 1. Add from first position. [STACK]
    public void addFirst(String data){
        // a new node created
        Node newNode = new Node(data);

        // If it is an empty list, make the new node as the first (i.e: head points the data )
        if (head == null){
            head = newNode;   
            return;            
        }

        // simply assign the curr head to the new node, and make head as new node.
        newNode.next = head;
        head = newNode;
    }

    // 2. Add from last position. [QUEUE]
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;   
            return;
        }

        // take a var to traverse from the head position
        Node Curr_Node = head;

        // traverse until you find that the next pos is null. Once found exit the loop (bec we are on the last node already)
        while (Curr_Node.next != null){
            Curr_Node = Curr_Node.next;
        }

        // once we reach the last node, assign the next to the newNode. Newnode is already pointing to null.
        Curr_Node.next = newNode;

    }


    // :::::::::::::::DELETE Operations.
    // 1) Delete from First.
    public void delFirst(){
        if (head == null){
            System.out.println("The List is Empty");
        }
        // make the curr head as the next head.
        head = head.next;
        size--;             //to track the size.
    }


    // 2) Delete from Last.
    public void delLast() {
        if (head == null){
            System.out.println("The list is Empty");
        }

        size--;             //to track the size

        // corner #case2
        // if only 1 node present in list, make it null
        if(head.next == null){
            head = null;
            return;
        }

        Node curr_node = head;
        // traverse till the second last elem before null.
        while(curr_node.next.next != null){
            curr_node = curr_node.next;
        }
        // make the cuuNode next as Null.
        curr_node.next = null;
        
    }


    public int getSize(){
        return size;
    }

    // PRINT THE LIST.
    public void printList() {
        if (head == null){
            System.out.println("List Empty");
            return;
        }

        Node Curr_Node = head;
        while (Curr_Node != null){
            System.out.print(Curr_Node.data + "-->");
            Curr_Node = Curr_Node.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();
        list.delLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
