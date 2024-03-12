# Printing elements of a matrix or two-dimensional array can be done using two “for” loops.

arr = [ [ 1, 2, 3, 4 ], [ 5, 6, 7, 8 ], [ 9, 10, 11, 12] ] 

for i in range(len(arr)):
    for j in range(len(arr[i])):
        print(arr[i][j], end = " ")
    print("") 
        
   
