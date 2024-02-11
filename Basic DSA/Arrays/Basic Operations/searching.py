# THERE ARE TWO TYPES OF SEARCHING METHODS:

# 1. Sequential Search: In this, the list or array is traversed sequentially and every element is checked. For example: Linear Search.

# Q: Linear Search to find the element “20” in a given list of numbers

arr = [2, 3, 4, 10, 40] 
x = int(input("Enter the number you want to search: "))

def linear_search(arr, x):
    if x not in arr:
        return False
    n = len(arr)
    for i in range(0, n):
        if (arr[i]==x):
            return i
        else:
            continue
 

ans = linear_search(arr, x)
print("The value you entered", x , "is present at", ans ) 


# 2. Interval Search: These algorithms are specifically designed for searching in sorted data-structures. For Example: Binary Search
# They repeatedly target the center of the search structure and divide the search space in half. [more efficient than Linear Search]

# Q: Binary Search to find the element “20” in a given list of numbers

arr = [2, 3, 4, 10, 40] 
x = int(input("Enter the number you want to search: "))
n = len(arr)

def binary_iterative(arr, x, l, r):
    if x not in arr:
        return False
    while l <=r:
        mid = l + (r-l)//2
        
        if arr[mid] == x:
            return mid
        
        elif arr[mid] > x:
            r = mid + 1
            
        else:
            l = mid + 1
    return -1
print("The value you entered", x , "is present at", binary_iterative(arr, x, 0, n-1))

def binary_recursive(arr, x, l, r):
    if l<=r:
        mid = l+ (r-l)//2
        
        if arr[mid] > x:
            return binary_recursive(arr, x, l, mid-1)
        elif arr[mid] < x:
            return binary_recursive(arr, x, mid+1, r)
        else:
            return mid
    return -14
print("The value you entered", x , "is present at index", binary_recursive(arr, x, 0, n-1))

    
            
            
        
        
