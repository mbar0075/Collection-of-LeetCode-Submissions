class Solution(object):
    def triangularSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        while len(nums) > 1:
                new_nums = [(nums[i] + nums[i+1]) % 10 for i in range(len(nums)-1)]
                nums = new_nums
        return nums[0]