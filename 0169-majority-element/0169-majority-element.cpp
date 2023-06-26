class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();  // Get the size of the input vector
        int count = 1;  // Counter to keep track of the count of the current number
        int candidate = nums[0];  // Initialize the current number as the first element

        for (int i = 1; i < n; ++i) { // Iterate over each element in the sorted vector
            if (count == 0) {
                candidate = nums[i];  // Update the candidate when count reaches zero
            }

            if (nums[i] == candidate) {
                count++;  // Increment the counter when the current number matches the candidate
            } else {
                count--;  // Decrement the counter when the current number is different from the candidate
            }
        }

        return candidate;
    }
};
