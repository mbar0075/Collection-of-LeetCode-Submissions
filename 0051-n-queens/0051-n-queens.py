class Solution(object):
    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """
        def backtrack(board, row):
            # Base case: all rows have been filled, so add current board to output
            if row == n:
                output.append(["".join(row) for row in board])
                return
            
            # Try placing a Queen in each column of the current row
            for col in range(n):
                if is_valid(board, row, col):
                    board[row][col] = "Q"
                    backtrack(board, row+1)
                    board[row][col] = "."
        
        def is_valid(board, row, col):
            # Check row
            if "Q" in board[row]:
                return False
            
            # Check column
            for i in range(n):
                if board[i][col] == "Q":
                    return False
            
            # Check diagonal (upper left)
            i, j = row-1, col-1
            while i >= 0 and j >= 0:
                if board[i][j] == "Q":
                    return False
                i, j = i-1, j-1
            
            # Check diagonal (upper right)
            i, j = row-1, col+1
            while i >= 0 and j < n:
                if board[i][j] == "Q":
                    return False
                i, j = i-1, j+1
            
            return True
        
        output = []
        board = [["."]*n for _ in range(n)]
        backtrack(board, 0)
        return output
