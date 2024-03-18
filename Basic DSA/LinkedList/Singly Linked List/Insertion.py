# Given a Linked List, the task is to insert a new node in this given Linked List at the following positions: 

class Node:
# The Node class encapsulates the data and logic related to individual nodes.
    def __init__(self, data):
        self.data= data
        self.next = None
        
class LinkedList:
# The LinkedList class encapsulates the logic for managing the nodes and the overall linked list structure.
    def __init__(self):
        self.head = None

    # 1) At the front of the linked list  [STACKS]
    # Approach: 
    # To insert a node at the start/beginning/front of a Linked List, we need to:
    # 1.1) Make the first node of Linked List linked to the new node.
    # 1.2) Remove the head from the original first node of Linked List.
    # 1.3) Make the new node as the Head of the Linked List.
    
    def push(self, new_data):
        
        # Create a new node calling the node class. 
        # atta, ek unattched node ahe, with data as "valuePushed" &  next as NONE.
        # Node(10)
        new_node = Node(new_data)
    
        # This applies if more than one node present. Assigns the tail of new node to the prev node head. 
        # jo navin node cha next pointer ahe, toh current head la connect kara.
        # Head -> Node(10) <- Node(20)
        new_node.next = self.head
    
        # 4. Here the head is assigned to the new node!
        # Head -> Node(20) -> Node(10)
        self.head = new_node
    
    
    # 2) At the end of the linked list.
    #Approach: 
    # To insert a node at the end of a Linked List, we need to:
    # 2.1) Go to the last node of the Linked List
    # 2.2) Change the next pointer of last node from NULL to the new node
    # 2.3) Make the next pointer of new node as NULL to show the end of Linked List
    
    
    def append(self, new_data):
 
        # Create a new node calling the node class. 
        # atta, ek unattched node ahe, with data as "valuePushed" &  next as NONE.
        # Node(90)
        new_node = Node(new_data)
 
        # If the Linked List is empty, then make the new node as head
        # Fakta first iteration la satisfy honar first node sathi. Jo pahila yeil, toh head!
        if self.head is None:
            self.head = new_node
            return
 
        # pahila current head la assign karun bagitla.
        last = self.head
        
        # jar, tyacha next pointer empty nasel, tar next node la shift hoicha and tyacha next pointer bagaicha.
        # while condition toh paryant jo paryant next pointer None nahi yet, None ala mhanje last la pochlo!
        while (last.next):
            last = last.next
 
        # Ekda last la pochlo, mag last node cha next pointer, navin inserted node la point karaicha! 
        # Zala navin node end la attach!
        last.next = new_node
    
    
    
    
    
    # 3) After a given node. 

my_list = LinkedList()
# Inserting nodes at the beginning of the linked list
my_list.push(10)  # Insert node with data 10 at the beginning
my_list.push(20)  # Insert node with data 20 at the beginning
my_list.push(30)  # Insert node with data 30 at the beginning
my_list.append(90)
my_list.append(100)
my_list.append(110)



