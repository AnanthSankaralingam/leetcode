class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # map with key anagram and value array        
        res = {}
        
        for curr_str in strs:
            anagram = tuple(sorted(curr_str))  # Use tuple instead of list
            if anagram in res:
                res[anagram].append(curr_str)
            else:
                res[anagram] = [curr_str]

        return list(res.values())  # Return the list of grouped anagrams