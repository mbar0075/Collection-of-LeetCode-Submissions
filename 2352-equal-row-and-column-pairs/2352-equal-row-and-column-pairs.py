class Solution(object):
    def equalPairs(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        # Declare variables
        count = 0
        n = len(grid)
        
        # Convert each row into a tuple and store them in a list
        rows = []
        for i in range(n):
            row = tuple(grid[i])
            rows.append(row)
        
        # Convert each column into a tuple and store them in a list
        columns = []
        for j in range(n):
            column = tuple(grid[i][j] for i in range(n))
            columns.append(column)
        
        # Count the number of times each row appears in the columns list
        for row in rows:
            count += columns.count(row)
        
        return count
        
        