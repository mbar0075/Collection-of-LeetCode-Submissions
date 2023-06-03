class Solution {
public:
    vector<int> getRow(int rowIndex) {
        // Initialize the row with `rowIndex + 1` elements, all set to 1
        vector<int> row(rowIndex + 1, 1);  
        
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                // Calculate the element at index `j` by summing the previous row elements
                row[j] += row[j - 1];
            }
        }
        
        return row;
    }
};
