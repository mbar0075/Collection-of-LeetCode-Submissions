class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValid(board, 0, 0);
    }
    
    // Method which holds the base cases for the recursion
    private boolean isValid(char[][] board, int row, int col) {
        if (col == 9) {
            // If we have reached the end of the current row, move to the next row
            return isValid(board, row + 1, 0);
        }
        
        if (row == 9) {
            // If we have reached the end of the board, all cells have been checked
            return true;
        }
        
        if (board[row][col] != '.') {
            // Check if the current cell value violates the rules
            if (!isValidPlacement(board, row, col)) {
                return false;
            }
        }
        
        // Move to the next column
        return isValid(board, row, col + 1);
    }
    
    // Checking whether current row and column have a valid placement
    private boolean isValidPlacement(char[][] board, int row, int col) {
        char value = board[row][col];
        
        // Check the current row for duplicate values
        for (int c = 0; c < 9; c++) {
            if (c != col && board[row][c] == value) {
                return false;
            }
        }
        
        // Check the current column for duplicate values
        for (int r = 0; r < 9; r++) {
            if (r != row && board[r][col] == value) {
                return false;
            }
        }
        
        // Check the current 3x3 sub-box for duplicate values
        int subBoxRow = 3 * (row / 3);
        int subBoxCol = 3 * (col / 3);
        for (int r = subBoxRow; r < subBoxRow + 3; r++) {
            for (int c = subBoxCol; c < subBoxCol + 3; c++) {
                if ((r != row || c != col) && board[r][c] == value) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
