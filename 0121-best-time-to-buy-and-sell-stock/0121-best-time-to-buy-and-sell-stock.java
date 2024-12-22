class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int sellPrice: prices) {
            if (sellPrice > buyPrice) {
                profit = Math.max(profit,sellPrice-buyPrice);
            } else {
                buyPrice = sellPrice;
            }
        }
        return profit;
    }
}