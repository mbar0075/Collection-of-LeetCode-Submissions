class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1:
            return s

        rows = ['' for _ in range(numRows)]
        direction = -1
        row = 0

        for c in s:
            rows[row] += c
            if row == 0 or row == numRows - 1:
                direction *= -1
            row += direction

        return ''.join(rows)