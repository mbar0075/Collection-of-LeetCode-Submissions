class Solution {
    public int mySqrt(int x) {
        // Checking Case
        if (x <= 0) {
            return 0;
        }
        
        // Declaring respective pointers
        int left = 1;
        int right = x;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid) {
                // Update the current best answer
                ans = mid;
                
                // Search for a larger value in the right half
                left = mid + 1;
            } else {
                // Search for a smaller value in the left half
                right = mid - 1;
            }
        }
        
        return ans;
    }
}
