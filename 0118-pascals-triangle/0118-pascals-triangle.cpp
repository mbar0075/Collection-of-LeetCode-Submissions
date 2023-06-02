class Solution {
public:
    // Function to generate Pascal's triangle
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle;

        for (int i = 0; i < numRows; i++) {
            vector<int> row(i + 1, 1);  // Initialize each row with 1s

            if (i >= 2) {
                // Calculate values for rows other than the first two
                for (int j = 1; j < i; j++) {
                    // Each value is the sum of the two values above it in the previous row
                    row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

            triangle.push_back(row);
        }

        return triangle;
    }
};