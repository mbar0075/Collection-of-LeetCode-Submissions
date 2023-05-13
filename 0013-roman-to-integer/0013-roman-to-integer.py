class Solution(object):
    def romanToInt(self, s):
        mappings={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        sum=0
        previous= 0
        for i in range(len(s) - 1, -1, -1):
            current = mappings[s[i]]
            if current < previous:
                sum -= current
            else:
                sum += current
            previous = current
        return sum