# Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element 
# from the unsorted portion of the list and moving it to the sorted portion of the list. Basically traverse the entire list, and bring the smallest to leftmost. VV.

# Taking the smallest value is effiecint than the largest value first approach.

# Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops:
# Space : Only storing n1. So space complexity is O(n).

#gwtting the smallest num
arr1 = [64, 25, 12, 22, 11]
n1= len(arr1)
def selectionSortSN(arr1, n1):
    for i in range(n1):
        min_idx = i
        #remember that the second for loop is for the range between the seocond to first (i+1) untill end.
        for j in range(i+1, n1):
            if arr1[min_idx] >  arr1[j]:
                min_idx = j
        arr1[i], arr1[min_idx] = arr1[min_idx], arr1[i]
    return arr1

print("The Sorted Array/List using smallest after Selection Sort is: ", selectionSortSN(arr1, n1))

# The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with
# the first element of the unsorted part. This process is repeated for the remaining unsorted portion until the entire list is sorted. 

# Getting the Largest number

arr2 = [64, 25, 12, 22, 11]
n2= len(arr1)

def selectionSortLN(arr2, n2):
    for i in range(n2-1, -1, -1):
       max_val_at_idx = i
       #remember that the second for loop is for the range between the seocond to last (i-1) untill start.
       for j in (range(i-1, -1, -1)):
           if arr2[max_val_at_idx] <  arr2[j]:
               max_val_at_idx = j
       arr2[i], arr2[max_val_at_idx] = arr2[max_val_at_idx], arr2[i]
    return arr2

print("\n\nThe Sorted Array/List using largest first after Selection Sort is: ", selectionSortLN(arr2, n2))
           
           
        