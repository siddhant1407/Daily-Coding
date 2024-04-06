# In an unsorted array, the search operation can be performed by linear traversal from the first element to the last element. 

arr = [12, 34, 10, 6, 40]
x = 12
n = len(arr)


# 1. SEARCH
# Time Complexity: O(N) 
# Auxiliary Space: O(1
def lin_serachUSA(arr, x):
    if x not in arr:
        return False
    for i,j in enumerate(arr):
        if j == x:
            return i
print("The Linear Search Unsorted array Value postion is:", lin_serachUSA(arr,x))
        
        

# 2. INSERT
# 2.1 Insert at the end:
# Time Complexity: O(1) 
# Auxiliary Space: O(1)
arr1 = [12, 34, 10, 6, 40]

def  insertAtEnd(arr1):
    arr1.append(14)
    return arr1
print("Array after inseritng at the end is:", insertAtEnd(arr1))


# 1.2 Insert at any position
# Can be performed by shifting elements to the right, which are on the right side of the required position.

arr2 = [12, 34, 10, 6, 40]
pos = 2
val = 10
n1 = len(arr)

# Time complexity: O(1)
# Auxiliary Space: O(1)
# Using the Built-in Function!!
def insertAtPos1(arr2, pos, val):
    arr2.insert(pos, val)
    return arr2
print("Array after inserting at pos using built-in is:",  insertAtPos1(arr2, pos, val))


# Using the loop structure.
# Time complexity: O(N)
# Auxiliary Space: O(1)
def insertAtPos2(arr2, pos, val, n1):
    arr2.append(None)
    for i in range(n1 - 1, pos-1, -1):
        arr2[i + 1] = arr2[i]
    arr2[pos] = val
    return arr2
print("Array after inserting at pos using loop is: ", insertAtPos2(arr2, pos, val, n1))



# 3. DELETE Operation:
# 3.1 You can shift everything to the left: Eg~ arr[i] = arr[i + 1];

# 3.2 Using Built-in fucntion

arr3 = [12, 34, 10, 6, 40]
val = 10

def del_fun(arr3, val):
    arr3.remove(val)
    return arr3
print("After deleting a value from array using remove function of list:", del_fun(arr3,val))