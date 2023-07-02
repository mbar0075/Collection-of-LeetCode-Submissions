class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        # Calculating their xor operation
        xor = x ^ y
        distance = 0
        
        # Looping until xor is not 0
        while (xor is not 0):
            # Appending to distance and right shifting by 1
            distance += xor & 1
            xor >>= 1
        
        return distance
        