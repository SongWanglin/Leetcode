class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i<prices.length; i++){
            low = prices[i]<low ? prices[i]: low;
            res = prices[i]-low>res ? prices[i]-low: res;
        }
        return res;
    }
}
