class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        # Initialize an empty n by n matrix
        matrix = [[0] * n for i in range(n)]
        
        # Define the boundaries of the matrix
        top = 0
        bottom = n - 1
        left = 0
        right = n - 1
        
        # Define the counter and the maximum number of elements
        count = 1
        max_count = n*n
        
        # Fill the matrix in a spiral order
        while count <= max_count:
            # Traverse from left to right
            for i in range(left, right+1):
                matrix[top][i] = count
                count += 1
            top += 1
            
            # Traverse from top to bottom
            for i in range(top, bottom+1):
                matrix[i][right] = count
                count += 1
            right -= 1
            
            # Traverse from right to left
            for i in range(right, left-1, -1):
                matrix[bottom][i] = count
                count += 1
            bottom -= 1
            
            # Traverse from bottom to top
            for i in range(bottom, top-1, -1):
                matrix[i][left] = count
                count += 1
            left += 1
        
        return matrix