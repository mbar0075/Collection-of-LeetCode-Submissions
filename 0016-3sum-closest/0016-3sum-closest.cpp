class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        //Sorting numbers array
        sort(nums.begin(), nums.end());
        //Initialising sum
        int closestSum = nums[0] + nums[1] + nums[2];
        //Looping through numbers array
        for(int i=0; i<nums.size()-2; i++) {
            //Retrieving indexes
            int left = i+1, right = nums.size()-1;
            //Looping until left is smaller than right
            while(left < right) {
                //Recalculating sum and performing the necessary checks
                int currentSum = nums[i] + nums[left] + nums[right];
                if(abs(currentSum - target) < abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if(currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
};
