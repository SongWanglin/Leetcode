/*class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int[] dp = new int[amount+1];
        for (int i = 0; i<len; i++){
            if(coins[i]<=amount)
                dp[coins[i]]=1;
        }
        for (int i = 1; i<=amount; i++){
            dp[i] = Short.MAX_VALUE;
            for(int j = 0; j<len; j++){
                if(i-coins[j]<0){
                   continue;
                }
                dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
            }
        }
        return dp[amount]==Short.MAX_VALUE? -1: dp[amount];
    }
} first attempt: using short.max_value to mark imporssible amount*/
class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int[] dp = new int[amount+1];
        for (int i = 1; i<=amount; i++){
            dp[i] = amount+1;
            for(int j = 0; j<len; j++){
                if(i-coins[j]<0){
                   continue;
                }
                dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
            }
        }
        return dp[amount]==amount+1? -1: dp[amount];
    }
}
