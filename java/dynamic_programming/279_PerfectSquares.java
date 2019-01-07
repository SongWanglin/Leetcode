class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1; i<n+1; i++){
            dp[i] = i+1;
            for (int j = 1; j<=(int)Math.sqrt(i); j++){
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
