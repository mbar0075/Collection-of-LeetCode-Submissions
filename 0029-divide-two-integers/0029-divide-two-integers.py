class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        # Handle edge cases
        if divisor == 0:
            return None
        if dividend == 0:
            return 0
        
        # Determine sign of the quotient
        sign = -1 if ((dividend < 0) ^ (divisor < 0)) else 1
        
        # Convert both dividend and divisor to positive
        dividend = abs(dividend)
        divisor = abs(divisor)
        
        # Initialize the quotient and the remainder
        quotient = 0
        remainder = 0
        
        # Perform bit manipulation to find the quotient
        for i in range(31, -1, -1):
            if (remainder + (divisor << i)) <= dividend:
                remainder += divisor << i
                quotient |= 1 << i
        
        # Handle overflow cases
        if sign == -1:
            quotient = -quotient
        if quotient > 2**31-1:
            quotient = 2**31-1
        
        return quotient