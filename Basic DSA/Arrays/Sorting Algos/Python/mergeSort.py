# Merge sort is defined as a sorting algorithm that works by dividing an array into smaller subarrays, 
# sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.

# In simple terms, we can say that the process of merge sort is to divide the array into two halves, sort each half, 
# and then merge the sorted halves back together. This process is repeated until the entire array is sorted.

# Merge sort is a recursive algorithm that continuously splits the array in half until it cannot be further divided 
# i.e., the array has only one element left (an array with one element is always sorted). Then the sorted subarrays are merged 
# into one sorted array.

# T(n) = θ(Nlog(N))  - The time complexity of the merge sort algorithm in the average case.
# S(n) = O(N)        - The space complexity of the merge sort

arr = [12, 11, 13, 5, 6, 7]

def mergeSort(arr):
    if len(arr) >1:
        
        # Find the mid to divide.
        mid = len(arr)//2
        
        # Divide into left and right from mid
        left = arr[:mid]
        right = arr[mid:]
        
        # After dividing, only work on left part and go until only one elem is remaining in subarray.
        # BUT, in recurrsion BOTH might work after only one elem is remaining in subarray.
        mergeSort(left)
        
        # After dividing, only work on right part and go until only one elem is remaining in subarray.
        # BUT, in recurrsion BOTH might work after only one elem is remaining in subarray.
        mergeSort(right)
        
        # "i" for tracking left, "j" for tracking right, "a" for getting final answer.
        i ,j, a = 0,0,0
        
        # when both have elemnets left to compare
        while i<len(left) and j<len(right):
            if left[i] <= right[j]:
                arr[a] = left[i]
                i+=1
            else:
                arr[a] = right[j]
                j+=1
            a+=1
            
        # When the right one has only one elem is remaining in subarray.
        # So we need to add the remaiing to the main sorted array
        while  i < len(left):
            arr[a]=left[i]
            i+=1
            a+=1
            
        # When the left one has only one elem is remaining in subarray.
        # So we need to add the remaiing to the main sorted array
        while j  < len(right):
            arr[a] = right[j]
            j+=1
            a+=1
    return arr

print("The array after Merge Sort is: ", mergeSort(arr))