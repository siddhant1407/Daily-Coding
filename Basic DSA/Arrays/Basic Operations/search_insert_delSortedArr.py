# In a sorted array, the search operation can be performed by using binary search.

#1. SEARCH
arr1 = [5, 6, 7, 8, 9, 10] 
key = 10
n1 = len(arr1)

#This is done manually, but can also done by recurssion~ as done in commented code.
def search_S_key(arr1, key, f, l, n1):
    while (f <= l):
        mid = (f+l)//2
        
        if arr1[mid] == key:
            return mid
        elif (arr1[mid] < key):
            f = mid+1
            # return search_S_key(arr1, key, mid+1, l, n1)          #RECURSSION
        else:
            l = mid-1
            # return search_S_key(arr1, key, f, mid-1, n1)          #RECURSSION
    
    return -1

print("The Key element", key, "is present at position:", search_S_key(arr1, key, 0, n1-1, n1))


# 2. INSERT (US faster than S)
# a search operation is performed for the possible position of the given element by using Binary search,
# and then an insert operation is performed followed by shifting the elements.

arr2 = [5, 6, 7, 8, 20, 40] 
key = 14
n2 = len(arr1)
def insert_valS(arr2, key, n2):
    arr2.append(None)
    i = n2-1
    while i>=0 and arr2[i]>key:
        arr2[i+1] = arr2[i]
        i = i-1
    arr2[i+1] = key
    return arr2
print("The array after insertion of key is:", insert_valS(arr2,  key, n2))




# 3. DELETE
# the element to be deleted is searched using binary search,
# and then the delete operation is performed followed by shifting the elements.
#SIMPLY OVERWRITE THE CURRENT POSITION WITH THE NEXT TO DELETE THE CURRENT POSITION.

arr3 = [5, 6, 7, 8, 20, 40] 
key = 8
n3 = len(arr3)

def delete_keyS(arr3, key, n3):
    # Call the binarySearch to find the position of key
    pos = search_S_key(arr3, key, 0, n3-1, n3)
    
    if pos == -1:
        return -1
    
    for i in range(pos, n3 - 1):
        arr3[i] = arr3[i + 1]
    
    # Remove the last duplicate element, becz everthings gets copy-paste. NOT cut-paste
    arr3.pop()
    
    return arr3

print("\nThe array after deletion of key is:", delete_keyS(arr3, key, n3))

