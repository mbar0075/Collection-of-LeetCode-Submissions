class Solution(object):
    def mostPoints(self, questions):
        """
        :type questions: List[List[int]]
        :rtype: int
        """
        n = len(questions)
        dp = [0] * (n + 1)
        for i in range(n - 1, -1, -1):
            index=i+1+questions[i][1]
            next_val = 0 if index >= len(dp) else dp[index]
            skip = 0 if i + 1 >= len(dp) else dp[i + 1]
            dp[i] = max(skip,questions[i][0]+next_val)
        return dp[0]