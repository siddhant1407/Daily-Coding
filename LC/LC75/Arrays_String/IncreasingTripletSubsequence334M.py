# Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
# If no such indices exists, return false.

# Example 1:
# Input: nums = [1,2,3,4,5]
# Output: true
# Explanation: Any triplet where i < j < k is valid.

# Example 2:
# Input: nums = [5,4,3,2,1]
# Output: false
# Explanation: No triplet exists.


# ANSWER: The examples given in the question are given to confuse us. The examples follow a strict order for 3 numbers (i,i+1,i+2).
# But, we do not have a order. i can be 1st, j can be 3rd and k can be 6th position.

# After interating, remeber, the smallest number to encounter in order will be "i". Bigger than i will be "j". If smaller than i encounters,
# then i is updated but  the value of j remains same as before. And, if we enter else, it means that k is present, so true.


# POWER OF IF-ELIF-ELSE STATEMENTS. Only one works on the current i/p.

def increasingTriplet(nums):
    
    # initialize to infinity.
    num_i = num_j = float('inf')
    for i in nums:
        if i<=num_i:
            num_i = i
        elif i<=num_j:
            num_j=i
        else:
            return True
    return False

nums = [20,100,10,12,5,13]
print("Are the triplets present in the array? ~", increasingTriplet(nums))