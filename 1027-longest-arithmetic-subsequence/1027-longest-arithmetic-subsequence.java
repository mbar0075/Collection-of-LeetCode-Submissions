class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        // dp array to store the length of longest arithmetic subsequence ending at each index with a specific difference
        // dp[i][diff] represents the length of the longest arithmetic subsequence ending at index i with a common difference diff
        // We use a HashMap to store the differences and their corresponding lengths
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        int max_length = 0;

        // Iterate over the elements of the input array
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            // Iterate over the elements before nums[i]
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                // If dp[j] already contains diff, update dp[i][diff] as dp[j][diff] + 1
                if (dp[j].containsKey(diff)) {
                    dp[i].put(diff, dp[j].get(diff) + 1);
                } else {
                    // If dp[j] doesn't contain diff, set dp[i][diff] to 2
                    // Since the current element and nums[j] can form an arithmetic subsequence of length 2
                    dp[i].put(diff, 2);
                }
                // Update the maximum length found so far
                max_length = Math.max(max_length, dp[i].get(diff));
            }
        }

        return max_length;
    }
}
