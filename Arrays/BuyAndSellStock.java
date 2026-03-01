class Solution {
    public int maxProfit(int[] prices) {
         int profit = 0;
         int cp = prices[0];
        for(int i = 0; i<prices.length; i++){
           int initialProfit = prices[i] - cp;
           profit = Math.max(initialProfit,profit);
           cp = Math.min(prices[i],cp);
        }
        return profit;
    }
}
