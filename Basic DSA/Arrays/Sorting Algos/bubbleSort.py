# Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
# This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

# In Bubble Sort algorithm, ~ takes the largest values first (efficient)

# 1. traverse from left and compare adjacent elements and the higher one is placed at right side. 
# 2. In this way, the largest element is moved to the rightmost end at first. 
# 3. This process is then continued to find the second largest and place it and so on until the data is sorted.


# Time Complexity: O(N2)        Becz two for loops
# Auxiliary Space: O(n)         Becz stored memory in n.


arr = [14, 34, 25, 12, 22, 11, 90]
n = len(arr)

def bubbleSort(arr, n):
    for i in range(n):
        swap_flag = False           #breaking condition for the loop~ the code executes without it, but to optimize it.
        
        for j in range(0, n-i-1): # Last i elements are already sorted
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swap_flag = True
        if swap_flag == False:      #when i is greated and j has no values to traverse
            break
    return arr
  
print("The sorted Array after Bubble Sort is: ", bubbleSort(arr, n))