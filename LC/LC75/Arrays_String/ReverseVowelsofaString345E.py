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