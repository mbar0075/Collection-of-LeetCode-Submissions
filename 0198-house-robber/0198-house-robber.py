class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        dp = [0] * (n + 1)
        for i in range(n):
            dp[i] = max(dp[i-2]+nums[i],dp[i-1])
        return dp[n-1]