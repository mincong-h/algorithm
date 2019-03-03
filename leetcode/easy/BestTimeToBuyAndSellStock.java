class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int lowest = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            int profit = price - lowest;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
            if (lowest > price) {
                lowest = price;
            }
        }
        return maxProfit;
    }
}
