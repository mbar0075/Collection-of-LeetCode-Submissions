class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        # Start from the least significant digit
        for i in range(len(digits)-1, -1, -1):
            # If the current digit is less than 9, simply increment it and return the array
            if digits[i] < 9:
                digits[i] += 1
                return digits
            # If the current digit is 9, set it to 0 and continue to the next digit
            else:
                digits[i] = 0
        
        # If all digits are 9, add a new digit 1 to the front of the array
        digits.insert(0, 1)
        return digits