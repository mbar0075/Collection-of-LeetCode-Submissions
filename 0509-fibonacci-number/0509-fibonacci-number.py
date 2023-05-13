class Solution(object):
    hmap={}
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n in self.hmap):
            return self.hmap[n]
        if(n==1):
            return 1
        elif(n==0):
            return 0
        else:
            answer= self.fib(n-1)+self.fib(n-2)
            self.hmap[n]=answer
            return answer