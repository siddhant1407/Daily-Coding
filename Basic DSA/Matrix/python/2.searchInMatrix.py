# Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. 
# The task is to find whether element X is present in the matrix or not.

# SOLUTION1: A Simple Solution is to one by one compare x with every element of the matrix. If matches, then return true. 
# If we reach the end then return false. The time complexity of this solution is O(n x m).
val = 14
arr = [[0, 6, 8, 9, 11], 
       [20, 22, 28, 29, 31], 
       [36, 38, 50, 61, 63], 
       [64, 66, 100, 122, 128]] 

def searchMat(arr, val):
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if arr[i][j] == val:
                return True
    return False

print("After Searching the Array, the value is: ",searchMat(arr,val))



# SOLUTION 2 (Typecasting): 

# SOLUTION 3 (w/o Typecasting): The araay sould be "SORTED"

# 1) Perform binary search on the middle column till only two elements are left or till the middle element of some row in the search is
#    the required element 'x'. This search is done to skip the rows that are not required.
# Consider:    | 1  2  3  4| 
# x = 3, mat = | 5  6  7  8|   Middle column:
#              | 9 10 11 12|    = {2, 6, 10, 14}
#              |13 14 15 16|   perform binary search on them
#                              since, x < 6, discard the 
#                              last 2 rows as 'a' will 
#                              not lie in them(sorted matrix)

# 2) The two left elements must be adjacent. Consider the rows of two elements and do following
#    a) check whether the element 'x' equals to the middle element of any one of the 2 rows
#    b) otherwise according to the value of the element 'x' check whether it is present in the 1st half of 1st row, 2nd half of 1st row, 
#       1st half of 2nd row or 2nd half of 2nd row. 

# Now, only two rows are left
#              | 1  2  3  4| 
# x = 3, mat = | 5  6  7  8|   Check whether element is present
#                              on the middle elements of these
#                              rows = {2, 6}
#                              x != 2 or 6
# If not, consider the four sub-parts
# 1st half of 1st row = {1}, 2nd half of 1st row = {3, 4}
# 1st half of 2nd row = {5}, 2nd half of 2nd row = {7, 8}

# According the value of 'x' it will be searched in the
# 2nd half of 1st row = {3, 4} and found at (i, j): (0, 2)  


# Python3 implementation 
# to search an element in a
# sorted matrix
MAX = 100

# This function does Binary 
# search for x in i-th
# row. It does the search 
# from mat[i][j_low] to
# mat[i][j_high]
def binarySearch(mat, i, j_low,
                j_high, x):

    while (j_low <= j_high):
    
        j_mid = (j_low + j_high) // 2

        # Element found
        if (mat[i][j_mid] == x):
        
            print("Found at (", i, ",", j_mid, ")")
            return

        elif (mat[i][j_mid] > x):
            j_high = j_mid - 1

        else:
            j_low = j_mid + 1
    
    # Element not found
    print("Element not found")

# Function to perform binary 
# search on the mid values of
# row to get the desired pair of rows
# where the element can be found
def sortedMatrixSearch(mat, n, m, x):

    # Single row matrix
    if (n == 1):
    
        binarySearch(mat, 0, 0, m - 1, x)
        return

    # Do binary search in middle column.
    # Condition to terminate the loop 
    # when the 2 desired rows are found
    i_low = 0
    i_high = n - 1
    j_mid = m // 2
    while ((i_low + 1) < i_high):
    
        i_mid = (i_low + i_high) // 2

        # element found
        if (mat[i_mid][j_mid] == x):
        
            print ("Found at (", i_mid, ",", j_mid, ")")
            return

        elif (mat[i_mid][j_mid] > x):
            i_high = i_mid

        else:
            i_low = i_mid

    # If element is present on the mid of the
    # two rows
    if (mat[i_low][j_mid] == x):
        print ("Found at (" , i_low, ",", j_mid , ")")
    elif (mat[i_low + 1][j_mid] == x):
        print ("Found at (", (i_low + 1), ",", j_mid, ")")

    # search element on 1st half of 1st row
    elif (x <= mat[i_low][j_mid - 1]):
        binarySearch(mat, i_low, 0, j_mid - 1, x)

    # Search element on 2nd half of 1st row
    elif (x >= mat[i_low][j_mid + 1] and x <= mat[i_low][m - 1]):
        binarySearch(mat, i_low, j_mid + 1, m - 1, x)
     
    # Search element on 1st half of 2nd row
    elif (x <= mat[i_low + 1][j_mid - 1]):
        binarySearch(mat, i_low + 1, 0, j_mid - 1, x)
  
    # Search element on 2nd half of 2nd row
    else:
        binarySearch(mat, i_low + 1, j_mid + 1, m - 1, x)

# Driver program to test above
if __name__ == "__main__":

    n = 4
    m = 5
    x = 100
    mat = [[0, 6, 8, 9, 11],
        [20, 22, 28, 29, 31],
        [36, 38, 50, 61, 63],
        [64, 66, 100, 122, 128]]
    sortedMatrixSearch(mat, n, m, x)
