# Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
# The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
# You must write an algorithm that runs in O(n) time and without using the division operation.

# Example 1:
# Input: nums = [1,2,3,4]
# Output: [24,12,8,6]


# make two passes, first in-order, second in-reverse, to compute products

def prodOfSelf(nums):
    result = [1] * len(nums)
    
    pre = 1
    for  i in range(len(nums)):
        result[i] *= pre
        pre *= nums[i]
        
    post = 1
    for j in range(len(nums)-1, -1,-1):
        result[j] *= post
        post *= nums[j]
        
    return result

nums = [1,2,3,4]
print("The resulting araay is: ", prodOfSelf(nums))