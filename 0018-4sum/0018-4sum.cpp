class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> output;
        sort(nums.begin(), nums.end()); // sort the input vector in ascending order
        int n = nums.size();
        
        // loop but skip last 3 elements due to 4 sum
        for (int i = 0; i < n - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            // loop but skip last 2 elements
            for (int j = i + 1; j < n - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates
                
                int left = j + 1;
                int right = n - 1;
                // loop whilst left is smaller than right
                while (left < right) {
                    long long sum = static_cast<long long>(nums[i]) + nums[j] + nums[left] + nums[right];
                    
                    if (sum < target) {
                        ++left;
                    } else if (sum > target) {
                        --right;
                    } else {
                        output.push_back({nums[i], nums[j], nums[left], nums[right]});
                        ++left;
                        --right;
                        // skip duplicates
                        while (left < right && nums[left] == nums[left - 1]) ++left; 
                        while (left < right && nums[right] == nums[right + 1]) --right; 
                    }
                }
            }
        }
        
        return output;
    }
};
