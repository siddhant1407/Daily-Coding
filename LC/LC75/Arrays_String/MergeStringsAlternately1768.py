# You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
# If a string is longer than the other, append the additional letters onto the end of the merged string.
# Return the merged string.


# ANSWER: Here, we inintialise a pointer and then  use it to iterate through both strings simultaneously.
# We add the values at the pointer position to the final answer string in order. While loop until the length lasts.
# The str that ends first, all other string elem are added to it. 


def mergeAlternately(word1, word2):
    ptr = 0
    str = ""
    while ptr < len(word1) or ptr < len(word2):
        if ptr < len(word1):
            str += word1[ptr]

        if ptr < len(word2):
            str += word2[ptr]
        
        ptr += 1
    return str

word1 = "abc"
word2 = "pqr"
print("The Alternatively merges string is: ", mergeAlternately(word1, word2))