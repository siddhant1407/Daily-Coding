# Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element 
# from the unsorted portion of the list and moving it to the sorted portion of the list. 


# Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops:
# Space : Only storing n1. So space complexity is O(n).

arr1 = [64, 25, 12, 22, 11]
n1= len(arr1)
def selectionSort(arr1, n1):
    for i in range(n1):
        min_idx = i
        for j in range(i+1, n1):
            if arr1[min_idx] >  arr1[j]:
                min_idx = j
        arr1[i], arr1[min_idx] = arr1[min_idx], arr1[i]
    return arr1

print("The Sorted Array/List after Selection Sort is: ", selectionSort(arr1, n1))

# The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with
# the first element of the unsorted part. This process is repeated for the remaining unsorted portion until the entire list is sorted. 