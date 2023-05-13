class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        dp=[1]*n
        for i in range(len(dp)-1):
            dp[i]=dp[i-1]+dp[i-2]
        print(dp)
        return dp[n-2]