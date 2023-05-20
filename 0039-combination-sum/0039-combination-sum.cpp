class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        // Sorting List
        sort(candidates.begin(), candidates.end());
        
        // Declaring variables
        vector<vector<int>> output;
        vector<int> currentCombination;
        
        // Calling backtracking function
        backtrack(candidates, target, 0, currentCombination, output);
        
        return output;
    }
    
private:
    void backtrack(vector<int>& candidates, int target, int start, vector<int>& currentCombination, vector<vector<int>>& output) {
        if (target == 0) {
            // Target sum is achieved, add the current combination to the output
            output.push_back(currentCombination);
            return;
        }
        
        for (int i = start; i < candidates.size(); i++) {
            if (candidates[i] > target) {
                // The current candidate is greater than the remaining target,
                // so there's no need to consider candidates after this point.
                break;
            }
            
            // Include the current candidate in the combination
            currentCombination.push_back(candidates[i]);
            
            // Recursively find combinations using the remaining candidates
            backtrack(candidates, target - candidates[i], i, currentCombination, output);
            
            // Remove the current candidate from the combination for backtracking
            currentCombination.pop_back();
        }
    }
};
