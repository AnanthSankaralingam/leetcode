"""
Given a string, find the length of the longest substring without repeating characters.
*Note that the answer must be a substring (e.g. "abcd" is a subsequence of “abbbcccd”, not a substring).

Examples:
“abcabcbb” → 3 ("abc", with the length of 3)
“bbbbb” → 1 ("b", with the length of 1.)
“pwwkew” → 3 ("wke", with the length of 3)

writeup (in a comment with your code) of how your code works + time + space complexity
"""

'''
Using a sliding window, we can find the longest substring without any repeating 
characters. We first initialize a left and right pointer to the beginning of the
string, and loop while the right pointer is within the length of the string. We 
also maintain a max variable to return, as well as a hash set containing the
characters of the current substring. A hash set is used because it is most 
optimal for accessing elements in O(1) time. We loop through the string with the
right pointer, adding each character to the set. When a repeated character is 
found, we remove the character at the left pointer and increment the left 
pointer. At the end of each loop iteration, the max is updated and the char is 
added to the set.
This algorithm works in O(n) time since the string is iterated only once by the 
right and left pointer. The space complexity is O(n), since at most each character
is stored in the set when each character is unique in the string.
'''
def longestString(s):   
    right = 0
    left = 0
    max_len = 0
    hash_set = set()

    while right < len(s):
        char = s[right]
        #to remove consecutive repeating characters, use while
        while char in hash_set:
            #need valid string in order, so remove at left
            hash_set.remove(s[left])
            left += 1

        max_len = max(max_len, right - left + 1)
        hash_set.add(char)
        right += 1

    return max_len