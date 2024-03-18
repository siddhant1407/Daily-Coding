# Representation of Single linked list:

# The Node class
# represents each element (or node) in the linked list.
class Node:
# The Node class encapsulates the data and logic related to individual nodes.
    def __init__(self, data):
        self.data= data
        self.next = None


# The Linked List Class
# This class represents the linked list itself and manages the nodes- [add, remove, search nodes]
class LinkedList:
# The LinkedList class encapsulates the logic for managing the nodes and the overall linked list structure.
    def __init__(self):
        self.head = None