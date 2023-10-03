class Solution(object):
    def isValid(self, s):
        stack = []
        for c in s:
            if c=='(' or c=='{' or c=='[' or not stack:
                stack.append(c)
            elif c==')' and stack[-1]=='(':
                stack.pop()
            elif c=='}' and stack[-1]=='{':
                stack.pop()
            elif c==']' and stack[-1]=='[':
                stack.pop()
            else:
                return False
        return len(stack)==0
        """
        :type s: str
        :rtype: bool
        """