# Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) 
# element from the unsorted portion of the list and moving it to the sorted portion of the list. 

# BASICALLY, GO AHEAD while  there are still elements in the unsorted portion of the list.
# If they are smaller, push them behind in the sorted list, then sort that small one in the sorted list~ Only then move 
# ahead to rest of the unsorted list.

# start ahead and come back~ First For loop +1 and second for loop all behind the first one -1. 

arr = [12, 11, 13, 5, 6]
n = len(arr)

def insertionSort(arr, n):
    for i in range(1, n):           #here i starts with a postion ahead.
        key = arr[i]
        
        #now, j start behind i.
        j=i-1
        
        # run while until val of j becomes zero(0) AND the front is small than back.
        while j >= 0 and key < arr[j]:
            arr[j+1], arr[j] = arr[j], arr[j+1]
            j = j-1
        # arr[j+1] = key
    return arr
print("Insertion Sort: ",insertionSort(arr, n))