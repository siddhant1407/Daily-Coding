
# Given a 2D square matrix, print the Principal and Secondary diagonals.

# Input: 
# 1 2 3 4
# 4 3 2 1
# 7 8 9 6
# 6 5 4 3
# Output:
# Principal Diagonal: 1, 3, 9, 3
# Secondary Diagonal: 4, 2, 8, 6

# 1) The primary diagonal is formed by the elements A00, A11, A22, A33.
# Condition for Principal Diagonal: The row-column condition is row = column.

# 2) The secondary diagonal is formed by the elements A03, A12, A21, A30. 
# Condition for Secondary Diagonal: The row-column condition is row = numberOfRows – column -1.


arr = [ [ 1, 2, 3, 4 ], 
        [ 5, 6, 7, 8 ], 
        [ 1, 2, 3, 4 ], 
        [ 5, 6, 7, 8 ] ] 

def principal_diagonal(arr):
    for i in range(0, len(arr)):
        for j in  range(0, len(arr)):
            if i == j:
                print(arr[i][j], end=" ")
    print(" ")
def secondary_diagonal(arr):
    for i in range(0, len(arr)):
        for j in  range(0, len(arr)):
            if (i+j) == (len(arr)-1):
                print(arr[i][j], end=" ")

        
print("The Primary Diagonal: ", principal_diagonal(arr))
print("The Secondary Diagonal: ",secondary_diagonal(arr))
