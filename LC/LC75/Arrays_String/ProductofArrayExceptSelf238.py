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