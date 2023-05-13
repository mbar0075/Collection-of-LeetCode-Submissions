class Solution(object):
    def isPalindrome(self, x):
        num=str(x)
        firstCount=0
        secondCount=len(num)-1
        while(firstCount<=secondCount):
            if(num[firstCount]!=num[secondCount]):
                return False
            firstCount+=1
            secondCount-=1

        return True