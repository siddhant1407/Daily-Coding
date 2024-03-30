# Given an input string s, reverse the order of the words.
# A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
# Return a string of the words in reverse order concatenated by a single space.
# Note that s may contain leading or trailing spaces or multiple spaces between two words. 
# The returned string should only have a single space separating the words. Do not include any extra spaces.

# ANSWER:
# Split the given string and then .reverse join each on ' ' spacces. 


def reverseWords(s):
    
    # Why not list? ~ It will index all the words letter by letter. This will be an FULL REVERSE.
    # words = list(s)

    words = s.split(" ")
    rev = ' '.join(reversed(words))
    return rev

s = "the sky is blue"
print("The Reversed words string is: ", reverseWords(s))