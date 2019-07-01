class Solution {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int dp[] = new int[A.length+1];
        for(int i = 1; i<=A.length; i++){
            int curMax = Integer.MIN_VALUE;
            for(int k = 1; k <= Math.min(i, K); ++k){
                curMax = Math.max(curMax, A[i-k]);
                dp[i] = Math.max(dp[i], dp[i-k] + curMax * k);
            }
        }
        return dp[A.length];
    }
}
