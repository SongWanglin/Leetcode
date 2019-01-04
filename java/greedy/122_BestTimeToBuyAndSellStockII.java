class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, profit = 0, price_dif=0;
        for (int i = 1; i<n; i++){
            price_dif = prices[i]-prices[i-1];
            profit+= (price_dif>0)? price_dif : 0;
        }
        return profit;
    }
}
