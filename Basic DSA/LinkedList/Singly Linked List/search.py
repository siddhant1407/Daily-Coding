class Node:
	def __init__(self, key):
		self.key = key
		self.next = None

class LinkedList:
	def __init__(self):
		self.head = None

	def push(self, new_key):
		new_node = Node(new_key)
		new_node.next = self.head
		self.head = new_node

listobj = LinkedList()
listobj.push(100)
listobj.push(32)
listobj.push(14)
listobj.push(29)
listobj.push(1144)
listobj.push(1142)

x = 14
temp = listobj.head
v = []
cnt = 0
while(temp):
    v.append(temp.key)
    cnt += 1
    temp = temp.next
 
print("The Count of node is: ", cnt)
if x in v:
	print("YES")
else:
	print("NO")
