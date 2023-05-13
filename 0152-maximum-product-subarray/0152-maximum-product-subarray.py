class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        
        max_so_far = nums[0]
        min_so_far = nums[0]
        max_product = nums[0]
        
        for i in range(1, len(nums)):
            num = nums[i]
            
            temp_max = max(num, max_so_far*num, min_so_far*num)
            min_so_far = min(num, max_so_far*num, min_so_far*num)
            
            max_so_far = temp_max
            max_product = max(max_product, max_so_far)
        
        return max_product