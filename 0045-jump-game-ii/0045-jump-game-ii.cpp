class Solution {
public:
     int jump(vector<int>& nums) {
        // Declare Variables
        int n = nums.size();
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        // Loop through all elements in the list
        for (int i = 0; i < n - 1; i++) {
            // Retrieve the max
            farthest = max(farthest, i + nums[i]);
            
            // Updating currentEnd
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        
        return jumps;
    }
};