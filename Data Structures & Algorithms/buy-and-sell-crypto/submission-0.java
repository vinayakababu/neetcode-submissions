class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFor = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length ; i++ )
        {
            minPriceSoFor = Math.min(minPriceSoFor, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minPriceSoFor);

        }

        return maxProfit;

        
    }
}
