# Rotations in the array is defined as the process of rearranging the elements in an array by shifting each element to a new position. 
# This is mostly done by rotating the elements of the array clockwise or counterclockwise.

# Types of Rotations in Array:
# 1. Right Rotation (Bring last to first)
# 2. Left Rotation (Bring  first element to last position)



arr = [1, 2, 3, 4, 5, 6]
n = len(arr)
d = 2

# #1. Using temporary arrays~ SLICING.
# # Right Rotation concept  
# def rotate1R(arr, n , d):
#     temp = arr[n-d:] + arr[0 : n - d]
#     return temp
# print("Array after Right 1 rotation", rotate1R(arr, n, d))
  
# #  Left Rotation concept    
# def rotate1L(arr, n, d):
#     temp = arr[d:] + arr[0:d]
#     return temp
# print("Array after Left 1 rotation", rotate1L(arr, n, d))


# # 2. Rotate one by one~ POP FEATURE W/ INSERT-APPEND CONCEPTS.
# #  Left Rotation concept 
# def rotate2L(arr, d, n):
#     for i in range(d):
#         arr.append(arr.pop(0))
#     return arr
# print("Array after Left 2 rotation", rotate2L(arr,d,n))

# #  Right Rotation concept 
# arr = [1, 2, 3, 4, 5]
# d = 2
# n = len(arr)
# def rotate2R(arr, d, n):
#     for i in range(d):
#         arr.insert(0, arr.pop(-1))
#         # arr.insert(0, arr.pop())
#     return arr
# print("Array after Right 2 rotation", rotate2R(arr, d, n))


# 3. Rotate by one:
#  Left Rotation concept 
def rotate3L(arr, d, n):
    nt = 1
    while nt<=d:
        last = arr[0]
        for i in range(n-1):
            arr[i] = arr[i+1]
        arr[n-1] = last
        nt= nt+1
    return arr
print("Array after Left 3 rotation", rotate3L(arr, d, n))
        
    
    

