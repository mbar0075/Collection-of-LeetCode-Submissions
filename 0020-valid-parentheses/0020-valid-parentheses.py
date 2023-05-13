class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack=[]
        brackets = {')': '(', '}': '{', ']': '['}
        for c in s:
            if c in brackets.values():
                stack.append(c)
            elif c in brackets.keys():
                if not stack or stack.pop() != brackets[c]:
                    return False
            else:
                return False
        return not stack








