# Given an array of characters chars, compress it using the following algorithm:
# Begin with an empty string s. For each group of consecutive repeating characters in chars:

# If the group's length is 1, append the character to s.
# Otherwise, append the character followed by the group's length.
# The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that 
# are 10 or longer will be split into multiple characters in chars.

# After you are done modifying the input array, return the new length of the array.
# You must write an algorithm that uses only constant extra space.

# Example 1:
# Input: chars = ["a","a","b","b","c","c","c"]
# Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
# Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

# Example 2:
# Input: chars = ["a"]
# Output: Return 1, and the first character of the input array should be: ["a"]
# Explanation: The only group is "a", which remains uncompressed since it's a single character.


def compress(chars):
    index = 0  # Index to keep track of the current position in the original array
    write_index = 0  # Index to keep track of the position to write compressed characters
    while index < len(chars):
        curr_char = chars[index]  # Current character
        count = 0  # Counter for consecutive characters
        
        # this check if the current position of index and the curr_character is same!
        while index < len(chars) and chars[index] == curr_char:
            index += 1
            count += 1
            
        # Write the current char value on the index.
        chars[write_index] = curr_char  # Write the current character
        
        # increment to write the count of that current char.
        write_index += 1
        
        if count > 1:
            for digit in str(count):
                chars[write_index] = digit  # Write the count of consecutive characters
                write_index += 1
    return chars, write_index  # Return the length of the compressed array

chars = ["a","a","b","b","c","c","c"]
print("Original Array : ", chars)
charactrers, compress_length = compress(chars)
print("\nCompressed Array : ", charactrers[:compress_length]) 
        
            
    