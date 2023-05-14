class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        mappings={1000: 'M', 900: 'CM', 500: 'D', 400: 'CD', 
                    100: 'C', 90: 'XC', 50: 'L', 40: 'XL', 
                    10: 'X', 9: 'IX', 5: 'V', 4: 'IV', 1: 'I'}
        output="";
        #Looping through all the mappings in the dictionary
        for value, symbol in sorted(mappings.items(), reverse=True):
        #Checking whether number is greater than value in dictionary, and if so, will continue to loop until finding a number in the dictionary, and then breaking
            while num >= value:
                output += symbol
                num -= value
        
        return output;
        