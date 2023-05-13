class Solution(object):
    def diagonalSum(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        diagonalSum=0
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                if i==j:#Diagonal 1
                    diagonalSum+=mat[i][j]
                elif len(mat[i])-1-i==j:#Diagonal 2
                    diagonalSum+=mat[i][j]
        return diagonalSum
