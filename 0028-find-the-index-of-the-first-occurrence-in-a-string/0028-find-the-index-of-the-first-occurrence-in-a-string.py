class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if not needle:
            return 0
        for i in range(len(haystack)):
            if i + len(needle) > len(haystack):
                return -1
            j = 0
            while j < len(needle) and haystack[i+j] == needle[j]:
                j += 1
            if j == len(needle):
                return i
        return -1
        