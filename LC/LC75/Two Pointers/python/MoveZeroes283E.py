# Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
# Note that you must do this in-place without making a copy of the array.

# Example 1:
# Input: nums = [0,1,0,3,12]
# Output: [1,3,12,0,0]

# Example 2:
# Input: nums = [0]
# Output: [0]


# ANSWER:  We can use two pointers to solve this problem. One pointer (r) will iterate over the input list and another will keep track of zeros (l).
# to swap whwnever r is non-zero.


def moveZeroes(nums):
    """
    Do not return anything, modify nums in-place instead.
    """
    # global
    l=0
    
    # 1) MOST EFFICIENT SOLUTION:
    for r in range(len(nums)):
        if nums[r]:
            nums[l], nums[r] = nums[r], nums[l]
            l+=1
    
    # 2)  LESS OPTIMIZED BUT MORE GENERAL SOLUTION. (Takes time)
    # r= 1
    # while r < (len(nums)):
    #     if nums[l] == 0 and nums[r] !=0:
    #         nums[l], nums[r] = nums[r],nums[l]
    #         r+=1
    #         l+=1
    #     elif nums[l] == 0 and nums[r] ==0:
    #         r+=1
    #     else:
    #         continue 
    
    
    # 3) BRUTE FORCE SOLUTION:
    # onlyZeros = []
    # onlydigi = []
    # for i in  range(len(nums)):
    #     if  nums[i]==0:
    #         onlyZeros.append(nums[i])
    #     else:
    #         onlydigi.append(nums[i])
    # nums = onlydigi+onlyZeros
    
    
    # global
    return nums

nums = [5,0, 0 ,1,0,3,12]
print("The List after moving zeors is: ", moveZeroes(nums))