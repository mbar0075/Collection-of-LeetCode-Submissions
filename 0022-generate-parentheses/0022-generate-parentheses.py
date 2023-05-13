class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        def generate(p, left, right, result):
            if left == 0 and right == 0:
                result.append(p)
                return

            if left > 0:
                generate(p + "(", left - 1, right, result)

            if right > left:
                generate(p + ")", left, right - 1, result)
                
        result = []
        generate("", n, n, result)
        return result

   