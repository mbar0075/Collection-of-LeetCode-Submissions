class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // Looping O(log n)
        while (left <= right) {
            // Calculating the middle
            int mid = left + (right - left) / 2;
            // Target Found and returning value
            if (nums[mid] == target) {
                return mid;
            }
            // Updating relevant pointers
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        // Not Found
        return -1;
    }
}
