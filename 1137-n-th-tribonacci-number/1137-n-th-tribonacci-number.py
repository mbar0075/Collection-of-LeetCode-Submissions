class Solution(object):
    hmap={}
    def tribonacci(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n in self.hmap):
            return self.hmap[n]
        if(n==1):
            return 1
        elif(n<=0):
            return 0
        else:
            answer= self.tribonacci(n-1)+self.tribonacci(n-2)+self.tribonacci(n-3)
            self.hmap[n]=answer
            return answer