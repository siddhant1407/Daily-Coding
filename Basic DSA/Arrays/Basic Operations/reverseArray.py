#Given an array (or string), the task is to reverse the array/string.

arr = [1, 2, 3, 4, 5]

#1. REVERSED USING ANOTHER ARRAY
def reverse_using_another_array(arr):
    rev_arr = arr[::-1]
    return rev_arr

print("Reversed Array USING ANOTHER ARRAY:", reverse_using_another_array(arr))


# 2. Using Build-In functions
def reverse_using_build_in_functions(arr):
    return list(reversed(arr))
print("Reversed Array Using Build-In :", reverse_using_build_in_functions(arr))


# 3. Using reverse Stack
def reverse_stack(arr):
    stk = []
    for i in arr:
        stk.append(i)
    
    for j in range(len(arr)):
        arr[j] = stk.pop()
    return arr
print("Reversed using stack: ",reverse_stack(list(arr)))

#. Using Loop
def reverse_using_loop(arr, l, r):
    while l < r: 
        arr[l], arr[r] = arr[r], arr[l] 
        l += 1
        r -= 1
    return arr
print("Reversed Loop Magic",  reverse_using_loop(arr, 0, len(arr)-1))


# using recurssion
def reverseListRecurssion(arr, l, r): 
    if l >= r: 
        return
    arr[l], arr[r] = arr[r], arr[l] 
    reverseListRecurssion(arr, l+1, r-1)
    return arr
print("The Recurssion Methood is:",  reverseListRecurssion(arr[:], 0, len(arr)-1))  