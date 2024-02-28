# QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot 
# and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
# Basically, putting elem smaller than pivot to its left, and grater to its right. 
# Mhanje, pivot chay chote left la and mothe right la. Mag, left-right madhe parat part karaicha until last elem nahi urat.
# apap sort zalele asnar last elem paryant pochta pochta.

# The key process in quickSort is a partition(). The target of partitions is to place the pivot at its correct position in the sorted array 
# and put all smaller elements to the left of the pivot, and all greater elements to the right of the pivot.

# Partition is done recursively on each side of the pivot after the pivot is placed in its correct position and this finally sorts the array.

# Choice of Pivot: There are many different choices for picking pivots. 
# 1) Always pick the first element as a pivot.
# 2) Always pick the last element as a pivot
# 3) Pick a random element as a pivot.
# 4) Pick the middle as the pivot.

# SOLUTION-1:
# Basic Recursive Implementation: This is the most straightforward implementation where the quicksort function calls itself recursively 
# to sort subarrays. The pivot is usually chosen as the last element or the first element of the array.

arr1 = [10, 7, 8, 9, 1, 5]

def quicksol1(arr1):
    if len(arr1) <= 1:
        return arr1
    
    #  before accessing always check if the arrr1 is empty??
    pivot = arr1[0]
    leftOpiv = []
    rightOpiv = []
    
    for i in arr1[1:]:
        if i <= pivot:
            leftOpiv.append(i)
        if  i > pivot:
            rightOpiv.append(i)
            
    return  quicksol1(leftOpiv) + [pivot] + quicksol1(rightOpiv)
print("Quick Sort Solution 1 Basic Recursive Implementation: ",quicksol1(arr1))


# SOLUTION 2:
# Randomized Quick Sort: In this approach, the pivot is chosen randomly from the array, and then placed at the last[IMP].
# which helps avoid worst-case scenarios where the pivot choice may lead to unbalanced partitions.

import random
arr2 = [10, 7, 8, 9, 1, 5]
n2 = len(arr2)
def partition(arr2, low, high):
    pivot_idx = random.randint(low, high)
    pivot_val = arr2[pivot_idx]
    arr2[pivot_idx], arr2[high] = arr2[high], arr2[pivot_idx]
    
    # used to place all smaller elem then pivot to left and then swap with pivot. Start -1 for no initial set val.
    i = low - 1
    
    for j in range(low, high):
        if arr2[j] <= pivot_val:
            i+=1
            arr2[i], arr2[j] = arr2[j], arr2[i]
    arr2[i+1], arr2[high]  = arr2[high] , arr2[i+1]
    return  i + 1

def quicksol2(arr2, low, high):
    if low < high:
        pivot_idx = partition(arr2, low, high)
        
        # recursively sort elements on the left of pivot and elements on the right of pivot_index.
        # AFTER 
        
        quicksol2(arr2, low, pivot_idx-1)
        quicksol2(arr2, pivot_idx+1, high)
    
    return arr2

print("Quick Sort Solution 2 Randomized Quick Sort: ",quicksol2(arr2, 0, n2-1))
    