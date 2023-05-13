class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0:
            x = -x # convert negative integer to positive
            is_negative = True
        else:
            is_negative = False
        
        # Convert integer to string and reverse it
        reversed_str = str(x)[::-1]
        
        # Convert reversed string back to integer
        reversed_int = int(reversed_str)
        
        if is_negative:
            reversed_int = -reversed_int # convert back to negative
                # Check for overflow
        if reversed_int > 2**31-1 or reversed_int < -2**31:
            return 0
        return reversed_int