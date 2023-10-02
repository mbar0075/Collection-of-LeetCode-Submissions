class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        # Sorting the list
        nums = sorted(nums)
        # Declaring previous num
        prev_num = None
        
        # Looping through the whole list
        for num in nums:
            if(num == prev_num):
                return True
            prev_num = num
        return False