# You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

# Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new
# flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

# Example 1:
# Input: flowerbed = [1,0,0,0,1], n = 1
# Output: true


# Here, first consider that the curretn num is a 0. 
# After that step 2 would be to see if the left position is zero (or alternatively current position is zero, if 0 is first place)
# Step 3 would be to see if the right position is zero (or alternatively current position is last place). We already checked in prev step,
# that the left is zero. All in all, if everything satisfies, make current i as 1.


def canPlaceFlowers(flowerbed, n):
    for i in range(len(flowerbed)):
        if flowerbed[i] == 0:
            if i == 0 or flowerbed[i-1] == 0:
                if (i == len(flowerbed) - 1) or flowerbed[i+1] == 0:
                    flowerbed[i] = 1
                    n = n-1
                    if n == 0:
                        return True
    return False

flowerbed = [1,0,0,0,1]
n = 1

print("Can the additional flower be added?: ", canPlaceFlowers(flowerbed, n))