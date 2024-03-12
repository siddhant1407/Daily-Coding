# Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. 
# The task is to find whether element X is present in the matrix or not.

# Sol1: A Simple Solution is to one by one compare x with every element of the matrix. If matches, then return true. 
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