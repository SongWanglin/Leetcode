class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1){
            return 0;
        }
        int buy[] = new int[2], sell[] = new int[3];
        buy[0] = -prices[0];
        buy[1] = buy[0];
        for(int i = 1; i<prices.length; i++){
            buy[0] = Math.max(buy[1], sell[2]-prices[i]);
            sell[0] = Math.max(sell[1], buy[1]+prices[i]);
            buy[1]=buy[0]; sell[2]=sell[1]; sell[1]=sell[0];
        }
        return sell[0];
    }
}
