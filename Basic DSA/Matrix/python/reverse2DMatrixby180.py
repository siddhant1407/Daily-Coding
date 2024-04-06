# Given a square matrix, the task is that turn it by 180 degrees in an anti-clockwise direction without using any extra space.
# Input : 1  2  3
#         4  5  6
#         7  8  9
# Output : 9 8 7 
#          6 5 4 
#          3 2 1

# There are four steps that are required to solve this problem to reverse a 2D array:
# 1- Find the transpose of a matrix. 
# 2- Reverse columns of the transpose. 
# 3- Find the transpose of a matrix. 
# 4- Reverse columns of the transpose

arr = [[1, 2, 3, 4 ],  
        [ 5, 6, 7, 8 ],  
        [ 9, 10, 11, 12 ],  
        [ 13, 14, 15, 16 ]]  


def transpose(arr):
    for i in range(len(arr)):
        for j in range(i, len(arr[i])):
            key = arr[i][j]
            arr[i][j] = arr[j][i]
            arr[j][i] = key
    return arr


def reverse_columns(arr):
    for i in arr:
        i.reverse()
    return arr

# OR
# Function to rotate the matrix by 180 degree 
# def reverseColumns(arr):  
#   for i in range(C):  
#     for j in range(0, int(C / 2)):  
#       x = arr[j][i]  
#       arr[j][i] = arr[C - 1 - j][i]  
#       arr[C - 1 - j][i] = x  

transpose(arr)
reverse_columns(arr)
transpose(arr)
ans = reverse_columns(arr)

print("The output is: ", ans)