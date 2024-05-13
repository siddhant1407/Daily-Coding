// LC = 206. Reverse Linked List [Easy]

public class LC206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Iterative approach.
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while (currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }


    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (head != null) {
                System.out.print(head.val + " ->");
                head = head.next;
            }
            System.out.println(" null");
        }
    }

    public static void main(String[] args) {
        LC206 lc = new LC206();

        // Test case 1: Empty list
        // printList(lc.reverseList(null));

        // Test case 2: Single element list
        // ListNode single = lc.new ListNode(1);
        // printList(lc.reverseList(single));

        // Test case 3: Multiple elements
        ListNode head = lc.new ListNode(1);
        head.next = lc.new ListNode(2);
        head.next.next = lc.new ListNode(3);
        printList(head);
        printList(lc.reverseList(head));
    }
}
