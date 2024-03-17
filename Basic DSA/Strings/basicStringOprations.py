# TASK1: Accessing characters by index in a string.

def access_char_by_index(string, idx, ebdl):
    return string[idx:ebdl]

def main():
    string = "wHATupSID?"
    idx = 4
    ebdl = 7        #yes, you can slice a string.
    print("The Accesssed value is: ", access_char_by_index(string, idx, ebdl))

if __name__ == "__main__":
    main()



# TASK2: Inserting character into a String.

def insert_demo(string, val, idx):
    # Inserts ch at kth index of s
    modified_string = string[:idx] + val + string[idx:]
    print("New String:", modified_string)

# Driver code
if __name__ == "__main__":
    string = "wHATupSID? "
    val = "Cool"
    idx = 6

    print("String:", string)
    insert_demo(string, val, idx)



# TASK3: Modifying character in String

def modify_string(string, idx, char):
    listy = list(string)
    listy[idx] = char
    
    return ''.join(listy)

def main():
    string = "it got mi like that"
    idx = 8
    char = 'e'
    ans = modify_string(string, idx, char)
    print("The Modified satring is: ", ans)
    

if __name__ == "__main__":
    main()




# TASK4: Deletion of Character in String
def removechar(string, char):
    counter = 0
    for i in range (len(string)):
        if string[i] != char:
            string[counter] = string[i]
            counter+=1
    return  ''.join(string[:counter])

def main():
    string = "WhatUpSidD"
    char = 'D'
    ans = removechar(list(string), char)
    print("The Char Removed satring is: ", ans)  

if __name__ == "__main__":
    main()




# TASK5: Concatenating strings (combining multiple strings into one).

def concatString(string1, string2):
    strign = string1 + " " + string2
    return strign

def main():
    string1 = "WhatUpSid?"
    string2 = "Do it~ Disciplined"
    ans = concatString(string1, string2)
    print("The concanated string is: ", ans)  

if __name__ == "__main__":
    main()




# TASK6: Finding the length of a string

def lenString(string):
    a = len(string)
    return a

def main():
    string1 = "WhatUpSid?"
    ans = lenString(string1)
    print("The Length of string is: ", ans)  

if __name__ == "__main__":
    main()




# TASK7: Comparing strings for equality or lexicographical order

def compareString(s1, s2, s3):
    if  s1 == s3:
        print("Strings S1 and S3 equal")
    else:
        print("String S1 and S3 not equal")

    if s1 == s2:
        print("Strings S1 AND S2 are equal")
    else:
        print("String S1 and S2 are not equal")

def main():
    string1 = "WhatUpSid?"
    string2 = "WhatUpSid?"
    string3 = "Not Equal"
    compareString(string1, string2, string3)

if __name__ == "__main__":
    main()