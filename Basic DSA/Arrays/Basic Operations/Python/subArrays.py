# Subarray/Substring

# 1. ITERATIVE APPROACH
# We can run two nested loops, the outer loop picks starting element and, 
# inner loop considers all elements on right of the picked elements as ending element of subarray. 

arr = [1, 2, 3, 4]
n = len(arr)

def subArray(arr, n):

    # Pick starting point
    for i in range(0,n):

        # Pick ending point
        for j in range(i,n):


            # Print subarray between Starting (i) and End Point (j)
            for k in range(i,j+1):
                print (arr[k],end=" ")
            print ("\n",end="")


print ("All Non-empty Subarrays by iterative method are: ", subArray(arr, n))



# 2. Using Recursion
# Approach: We use two pointers start and end to maintain the starting and ending point of the array

def printSubArraysRecurssions(arr, start, end):
	
	# Stop if we have reached the end of the array 
	if end == len(arr):
		return
	
	# Increment the end point and start from 0
	elif start > end:
		return printSubArraysRecurssions(arr, 0, end + 1)
		
	# Print the subarray and increment the starting point
	else:
		print(arr[start:end + 1])
		return printSubArraysRecurssions(arr, start + 1, end)
		
arr = [1, 2, 3]
printSubArraysRecurssions(arr, 0, 0)

