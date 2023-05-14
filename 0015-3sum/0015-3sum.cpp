class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> output;
        sort(nums.begin(), nums.end()); // sort the input vector in ascending order
        for (int i = 0; i < nums.size(); ++i) {
            if (i > 0 && nums[i] == nums[i-1]) continue; // skip duplicates
            int target = -nums[i];
            int j = i + 1, k = nums.size() - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum < target) {
                    ++j; // increase left pointer to increase sum
                } else if (sum > target) {
                    --k; // decrease right pointer to decrease sum
                } else {
                    output.push_back({nums[i], nums[j], nums[k]});
                    ++j;
                    --k;
                    // skip duplicates
                    while (j < k && nums[j] == nums[j-1]) ++j;
                    while (j < k && nums[k] == nums[k+1]) --k;
                }
            }
        }
        return output;
    }
};
