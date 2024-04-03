# Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
# A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without 
# disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

# Example 1:
# Input: s = "abc", t = "ahbgdc"
# Output: true

# Example 2:
# Input: s = "axc", t = "ahbgdc"
# Output: false


# ANSWER: Use the 2-pointer approach, one pointer for string s and another for string t. Move both the pointers if subseq value match,
# and only t if values dont match. If pointer of s reaches its oroginal lenght, then the return value is True!


def isSubsequence(s, t):
    ptr_s, ptr_t =0,0

    while ptr_s < len(s) and ptr_t < len(t):
        if s[ptr_s] == t[ptr_t]:
            ptr_s+=1
        ptr_t+=1
    if ptr_s == len(s): return True
    return False

s = "abc"
t = "ahbgdc"
print("Is (s) the subsequence of (t)?  ",isSubsequence(s,t)) 