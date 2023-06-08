class Solution(object):
    def countNegatives(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        count = 0  # Initialize count to zero
        rows = len(grid)  # Get the number of rows in the grid
        cols = len(grid[0])  # Get the number of columns in the grid
        
        # Start from the top-right corner of the matrix
        row = 0
        col = cols - 1
        
        while row < rows and col >= 0:
            if grid[row][col] < 0:
                # If the current number is negative, move to the left
                count += rows - row
                col -= 1
            else:
                # If the current number is non-negative, move down
                row += 1
        
        return count
        