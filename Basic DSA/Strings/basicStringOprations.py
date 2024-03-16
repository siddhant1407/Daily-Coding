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
# TASK4: Deletion of Character in String
# TASK5: Concatenating strings (combining multiple strings into one).
# TASK6: Finding the length of a string
# TASK7: Comparing strings for equality or lexicographical order

