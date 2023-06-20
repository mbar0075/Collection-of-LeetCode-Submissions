class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> avgs(n, 0);
        
        // Check if there are enough elements
        if (n <= 2 * k) {
            for (int i = 0; i < n; i++) {
                avgs[i] = -1;
            }
            return avgs;
        }
        
        long long int sum = 0;  // Use long long int for sum due to overflow
        int count = 0;

        // Calculate the initial sum and count
        for (int i = 0; i <= 2 * k && i < n; i++) {
            sum += nums[i];
            count++;
        }

        // Compute the average for the first element
        avgs[k] = sum / count;

        // Slide the window over the array
        for (int i = k + 1; i < n - k; i++) {
            sum += nums[i + k];  // Include the next element
            sum -= nums[i - k - 1];  // Exclude the previous element
            avgs[i] = sum / count;  // Compute the average
        }

        // Set -1 for elements where there are not enough elements in the subarray
        for (int i = 0; i < k; i++) {
            avgs[i] = -1;
            avgs[n - 1 - i] = -1;
        }

        return avgs;
    }
};
