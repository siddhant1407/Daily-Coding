# Given a string s, reverse only all the vowels in the string and return it.

# The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

# Example 1:
# Input: s = "hello"
# Output: "holle"


# Answer: Define a set with all Vowels (Sets are easy to access)
# convert given str into list and work on the indexes with a left and right pointer. 
# If the "Left pointer" lands on a vowels (the if block stops), "Right pointer" lands on a vowels (the elif block stops).
# And then finally as both have encountered a vowel, they are swapped in the else block while changing pointers.

def reverseVowels(s):

    vowels = set('AEIOUaeiou')
    s = list(s)
    leftPtr = 0
    rightPtr = len(s)-1

    while leftPtr < rightPtr:
        if s[leftPtr] not in vowels:
            leftPtr += 1
        elif s[rightPtr] not in vowels:
            rightPtr -= 1
        else:
            s[leftPtr], s[rightPtr] = s[rightPtr], s[leftPtr]
            leftPtr += 1
            rightPtr -= 1

    return "".join(s)

s = "hello"
print("The Reversed vowels string is: ", reverseVowels(s))