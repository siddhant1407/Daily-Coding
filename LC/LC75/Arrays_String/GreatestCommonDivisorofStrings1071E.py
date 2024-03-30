# For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t.
# (i.e., t is concatenated with itself one or more times).
# Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

# Asnwer
# Here, if string are not equal after front and back concat, return empty.
# Until the two strings are not same, slice the str1 with the len of str2 and vice versa to get the common gcd. 

def gcdOfStrings(str1, str2):
    if str1 + str2 != str2 + str1:
        return ""

    while str1 != str2:
        if len(str1) > len(str2):
            str1 = str1[len(str2):]
        else:
            str2 = str2[len(str1):]
    return str1

str1 = "ABCABC"
str2 = "ABC"

print("The GCD of string is: ", gcdOfStrings(str1, str2))