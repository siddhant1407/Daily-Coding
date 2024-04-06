# Given a matrix mat[][] having n rows and m columns. We need to find unique elements in the matrix 
# i.e, those elements not repeated in the matrix or those whose frequency is 1.

# Examples:
# Input :  20  15  30  2
#         2   3   5   30
#         6   7   6   8
# Output : 3  20  5  7  8  15

# Input :  1  2  3  
#          5  6  2
#          1  3  5
#          6  2  2
# Output : No unique element in the matrix

# Solution:

# The idea is to use hashing and traverse through all the elements of the matrix, If an element is present in the dictionary, 
# then increment its count. Otherwise insert an element with value = 1. 

# SOLUTION 1~ Using Python fumctionality.
# def find_unique_elements(arr):
#     #pahila matrix access honar, then sublist access honar and finally []madhe ahet so item direct append honar
#     flat_list = [item for sublist in arr for item in sublist]
    
#     # Use set to remove duplicates and get unique elements
#     unique_elements = set(flat_list)
    
#     return unique_elements


# arr = [[1, 2, 3, 20], 
#        [5, 6, 20, 25], 
#        [1, 3, 5, 6], 
#        [6, 7, 8, 15]] 

# # Find unique elements
# unique_elements = find_unique_elements(arr)

# print("Unique elements in the matrix:", unique_elements)




# SOLUTION~ GETTING THE UNIQUE ELEM THAT OCCURS ONLY ONCE IN THE LIST.
def find_unique_elements(matrix):
    # into a 1D list
    flattened = []
    for row in matrix:
        for num in row:
            flattened.append(num)

    # occurrences of each element
    counts = {}
    for num in set(flattened):
        counts[num] = flattened.count(num)

    # Print the unique elements
    unique_elements = []
    for num, count in counts.items():
        if count == 1:
            unique_elements.append(num)

    if unique_elements:
        print("Unique elements in the matrix:", unique_elements)
    else:
        print("No unique element in the matrix")

# Example matrix
matrix = [
    [1, 2, 3, 20],
    [5, 6, 20, 25],
    [1, 3, 5, 6],
    [6, 7, 8, 15]
]
find_unique_elements(matrix)
