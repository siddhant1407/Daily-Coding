# The problem is to sort the given matrix in strict order. Here strict order means that the matrix is sorted in a way such that 
# all elements in a row are sorted in increasing order and for row ‘i’, where 1 <= i <= n-1, the first element of row ‘i’ is greater 
# than or equal to the last element of row ‘i-1’.


# Input : mat[][] = { {5, 4, 7}, 
#                     {1, 3, 8}, 
#                     {2, 9, 6} }
# Output : 1 2 3
#          4 5 6
#          7 8 9

# Solution: 
# The idea to solve this proble is Create a temp[] array of size n^2. Starting with the first row one by one copy the elements 
# of the given matrix into temp[]. Sort temp[]. Now one by one copy the elements of temp[] back to the given matrix.

# Basically, baher kadla 2D to 1D array karun eka temp array madhe, tya 1D array la sort kela, and mag parat 2D tayaar kela. Tadaaa, sorted array!

arr = [[5, 4, 7],  
       [1, 3, 8],  
       [2, 9, 6]]  

def sortMat(arr):  
    
    # temporary matrix of size n^2  
    temp = [0]*len(arr)*len(arr)  
    k = 0
    
    # copy the elements of matrix one by one  
    # to temp[]  
    for i in range(0, len(arr)):  
        for j in range(0, len(arr)):  
            temp[k] = arr[i][j]  
            k += 1
    
    # sort temp[]  
    temp.sort()  
    
    # copy the elements of temp[] one by one  
    # in mat[][]  
    k = 0
    for i in range(0, len(arr)):  
        for j in range(0, len(arr)):  
            arr[i][j] = temp[k]  
            k += 1
    return arr

sortMat(arr)  
print("\nMatrix After Sorting:", arr)  
