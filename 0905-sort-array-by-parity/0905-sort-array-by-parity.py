class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        even_list =[]
        odd_list =[]
        for num in nums:
            if(num % 2 == 0):
                even_list.append(num)
            else:
                odd_list.append(num)
        return even_list + odd_list
        