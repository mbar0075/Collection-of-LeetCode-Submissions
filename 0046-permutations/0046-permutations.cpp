class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result; // Stores the generated permutations
        backtrack(nums, 0, result); // Call the backtrack function to generate permutations
        return result; // Return the result vector
    }
    
private:
    void backtrack(vector<int>& nums, int start, vector<vector<int>>& result) {
        if (start == nums.size()) { // If start index reaches the end of the array
            result.push_back(nums); // Add the current permutation to the result vector
            return;
        }
        
        for (int i = start; i < nums.size(); i++) {
            swap(nums[start], nums[i]); // Swap the current element with the element at the start index
            backtrack(nums, start + 1, result); // Recursively call backtrack with the updated start index
            swap(nums[start], nums[i]); // Backtrack by swapping the elements back to the original order
        }
    }
};
