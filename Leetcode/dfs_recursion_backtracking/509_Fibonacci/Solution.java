class Solution {
    public int fib(int N) {
        if(N<=0) return 0;
        int[] dp = new int[2];
        dp[0] = 0; dp[1] = 1;
        for(int i = 1; i<N; ++i){
            int temp = dp[1];
            dp[1] += dp[0];
            dp[0] = temp;
        }
        return dp[1];
    }
}
