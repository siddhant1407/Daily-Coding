class Node:
# The Node class encapsulates the data and logic related to individual nodes.
    def __init__(self, data):
        self.data= data
        self.next = None
        
class LinkedList:
# The LinkedList class encapsulates the logic for managing the nodes and the overall linked list structure.
    def __init__(self):
        self.head = None
        
    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node
    
    def append(self, new_data):
        new_node = Node(new_data)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while (last.next):
            last = last.next
        last.next = new_node
    
    def insertAfter(self, prev_node, new_data):
        if prev_node is None:
            print("The given previous node must inLinkedList.")
            return

        new_node = Node(new_data)
        new_node.next = prev_node.next
        prev_node.next = new_node
        
        
    # DELETE  from a Linked List:-
    # You can delete an element in a list from:

    # 1) Beginning
    # To do this Point head to the next node i.e. second node
    def deleteFromStart(self):
        if self.head is None:
            print("The linked list is empty. Nothing to delete.")
            return
        # eka temp madhe current head store karaicha.
        removed_data = self.head.data

        # mag, head.next chi value(next node), current head la assign karaicha.
        self.head = self.head.next

        # temp, jyachat juna head ahe, toh delete karun takaicha.   
    #     free(temp); or delete temp;
        removed_data.delete

    # 2) End
    def deleteFromEnd(self):
        
        # Check if the linked list is empty (if the head is None), in which case there's nothing to delete. So Terminate/return.
        if self.head is None:
            print("The linked list is empty. Nothing to delete.")
            return
        
        # If the list has only one node (head node), set the head to None to indicate an empty list (after deleting that one node).
        if self.head.next is None:
            # Only one node in the list (head node), remove that node by assigninig to a temp.
            removed_data = self.head.data
            # current head none la assign karun takaicha
            self.head = None
            
            # removed data delete kraicha aseltar karun takaicha.
            print(f"Delete node with data {removed_data} from the end.")
            return

        # Traverse the list to find the second-to-last node (penultimate node)
        # assign karaicha current head la as a prev node. 
        prev_node = self.head
        
        # check karaicha until the point where next to next is not none! (Copulsory loop run honar becz varti base case check kele ahet)
        while prev_node.next.next is not None:
            # last paryent check karun second to last elem store kela.
            prev_node = prev_node.next

        # Store the data of the removed node (optional)
        # second to last cha next pointer assigned val eka temp madhe ghetla.
        removed_data = prev_node.next.data

        # Update the next pointer of the penultimate node/second to last node to None
        prev_node.next = None
        
        # temp, jyachat juna last ahe, toh delete karun takaicha.
        removed_data.delete

     
    # 3) Middle

my_list = LinkedList()
my_list.push(10)  # Insert node with data 10 at the beginning
my_list.push(20)  # Insert node with data 20 at the beginning
my_list.push(30)  # Insert node with data 30 at the beginning
my_list.append(90) # at the end
my_list.append(100) # at the end
my_list.append(110) # at the end
node_to_insert_after = my_list.head.next
my_list.insertAfter(node_to_insert_after, 40)


