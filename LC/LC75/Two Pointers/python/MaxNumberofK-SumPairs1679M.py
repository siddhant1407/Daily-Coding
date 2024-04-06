# You are given an integer array nums and an integer k.
# In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
# Return the maximum number of operations you can perform on the array.

# Example 1:
# Input: nums = [1,2,3,4], k = 5
# Output: 2
# Explanation: Starting with nums = [1,2,3,4]:
# - Remove numbers 1 and 4, then nums = [2,3]
# - Remove numbers 2 and 3, then nums = []
# There are no more pairs that sum up to 5, hence a total of 2 operations.

# Example 2:
# Input: nums = [3,1,3,4,3], k = 6
# Output: 1
# Explanation: Starting with nums = [3,1,3,4,3]:
# - Remove the first two 3's, then nums = [1,4,3]
# There are no more pairs that sum up to 6, hence a total of 1 operation.


# ANSWER: Two pointer approach, one from start and other from back. Add the values, if the sum is equal to key, then increase the counter.
# If greater than key then decrese right pointer and if smaller than  key then increase left pointer.


def maxOperations(nums, k):
    nums.sort()
    left = 0
    right = len(nums)-1
    counter = 0        

    while left < right:
        addVal = nums[left] + nums[right]
        if addVal == k:
            counter +=1
            right -=1
            left+=1
        elif (addVal >k):
            right -=1
        else:
            left +=1
    return counter

nums = [1,2,3,4]
k = 5
print("The num of pairs present to add upto k are: ", maxOperations(nums, k))