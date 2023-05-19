class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Declaring variables
        int firstptr = 0;
        int secondptr = nums.length - 1;
        int[] result = {-1, -1};// Declared to not found case
        
        // Binary Search O(log n)
        while (firstptr <= secondptr) {
            // Calculating mid position
            int mid = firstptr + (secondptr - firstptr) / 2;
            
            //Checking whether target is found
            if (target == nums[mid]) {
                int start = mid;
                int end = mid;
                
                // Finding the leftmost occurrence
                while (start > 0 && nums[start - 1] == target) {
                    start--;
                }
                
                // Finding the rightmost occurrence
                while (end < nums.length - 1 && nums[end + 1] == target) {
                    end++;
                }
                
                // Returning result
                result[0] = start;
                result[1] = end;
                return result;
            // Changing the relevant pointers
            } else if (target < nums[mid]) {
                secondptr = mid - 1;
            } else {
                firstptr = mid + 1;
            }
        }
        
        return result;
    }
}
