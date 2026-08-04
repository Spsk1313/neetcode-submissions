class Solution {
    public int maxProfit(int[] prices) {
         int maxProfit = 0;
        int minBuyingPrice = prices[0];
        for (int sell = 1; sell < prices.length; sell++) {
            if (prices[sell] < minBuyingPrice) {
                minBuyingPrice = prices[sell];
            } else {
                int profit = prices[sell] - minBuyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
