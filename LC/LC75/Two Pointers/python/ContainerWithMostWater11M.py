# You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) 
# and (i, height[i]).
# Find two lines that together with the x-axis form a container, such that the container contains the most water.
# Return the maximum amount of water a container can store.
# Notice that you may not slant the container.

# Example 1:
# Input: height = [1,8,6,2,5,4,8,3,7]
# Output: 49
# Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) 
# the container can contain is 49.


# 1) SOLUTION:- Brute Force Method (pointers from two loops)
# Here, we consider every possible area between each points and output the biggest one.
# complexity: O(n^2)
height = [1,8,6,2,5,4,8,3,7]
# height = [1,1]
def maxArea1(height):
    area_max = 0
    for l in range(len(height)-1):
        for r in range(l+1, len(height)):
            area = (r-l) * min(height[l], height[r])
            area_max = max(area_max, area)
    return area_max

print("BRUTE FORCE METHOD: The area of maximun water storage is: ", maxArea1(height))



# 2) TWO POINTER LESS COMPLEX METHOD (Pointers in a Single Loop):

def maxArea(height):
    # initialize the left and right pointers:
    left = 0
    right = len(height) -1
    # initialize the result variable:
    final_max = 0
    
    # loop for parsing, here the left should always be less than right because we do not want it equal or passed.
    while left < right:
        area = (right-left) * min(height[left], height[right])
        final_max = max(final_max, area)
        
        if height[left] < height[right]:   # move the pointer which contains smaller value to next position
            left += 1                       # point to the next element on the left side
        else:
            right -= 1
    return final_max
print("Two Pointer single loop METHOD: The area of maximun water storage is: ", maxArea(height))