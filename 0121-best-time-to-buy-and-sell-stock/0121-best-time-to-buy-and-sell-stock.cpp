class Solution {
public:
    int maxProfit(std::vector<int>& prices) {
        int minPrice = prices[0]; // Initialize the minimum price as the price on the first day
        int maxProfit = 0; // Initialize the maximum profit as 0

        for (int i = 1; i < prices.size(); i++) {
            int currentPrice = prices[i]; // Get the price on the current day

            if (currentPrice < minPrice) {
                minPrice = currentPrice; // Update the minimum price if the current price is lower
            } else {
                int profit = currentPrice - minPrice; // Calculate the profit by subtracting the minimum price from the current price

                if (profit > maxProfit) {
                    maxProfit = profit; // Update the maximum profit if the calculated profit is higher
                }
            }
        }

        return maxProfit; // Return the maximum profit achieved
    }
};
