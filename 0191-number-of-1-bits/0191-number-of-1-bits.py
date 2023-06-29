class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        while n != 0: # Loop until number larger than 0
            count += n & 1  # Check the least significant bit
            n >>= 1  # Right shift to discard the checked bit
        return count
        