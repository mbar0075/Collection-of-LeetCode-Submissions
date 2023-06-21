class Solution {
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>> result; // Stores the generated permutations
        set<vector<int>> uniquePermutations; // Set to store unique permutations
        backtrack(nums, 0, uniquePermutations); // Call the backtrack function to generate permutations
        
        // Convert the set of unique permutations to the result vector
        for (const auto& permutation : uniquePermutations) {
            result.push_back(permutation);
        }
        
        return result; // Return the result vector
    }
    
private:
    void backtrack(vector<int>& nums, int start, set<vector<int>>& uniquePermutations) {
        if (start == nums.size()) { // If start index reaches the end of the array
            uniquePermutations.insert(nums); // Add the current permutation to the set
            return;
        }
        
        for (int i = start; i < nums.size(); i++) {
            swap(nums[start], nums[i]); // Swap the current element with the element at the start index
            backtrack(nums, start + 1, uniquePermutations); // Recursively call backtrack with the updated start index
            swap(nums[start], nums[i]); // Backtrack by swapping the elements back to the original order
        }
    }
};
