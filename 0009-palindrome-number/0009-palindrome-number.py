class Solution:
    def isPalindrome(self, x: int) -> bool:
        c = str(x)
        return c == c[::-1]