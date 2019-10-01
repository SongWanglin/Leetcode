class Solution {
    public int maxProfit(int[] prices) {
        /*/ // brute force
        int res = 0;
        for(int i = 1; i<prices.length; ++i){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<i; ++j){
                min = Math.min(min, prices[j]);
            }
            res = Math.max(res, Math.max(0, prices[i]-min));
        }
        return res;/*/
        int maxSoFar = 0,  maxEndingHere = 0;
        for(int i = 1; i<prices.length; ++i){
            maxEndingHere = Math.max(maxEndingHere+prices[i]-prices[i-1], prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
