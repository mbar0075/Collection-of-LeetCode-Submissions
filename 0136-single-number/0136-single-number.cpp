class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int result = 0;
        
        // Iterate through all the numbers in the array
        for (int num : nums) {
            // XOR the current number with the result
            // Duplicate numbers will cancel each other out (XOR with 0)
            // The single number will remain in the result
            result ^= num;
        }
        
        return result;
    }
};
