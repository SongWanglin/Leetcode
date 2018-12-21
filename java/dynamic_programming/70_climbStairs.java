class Solution {
    public int climbStairs(int n) {
        int fib_dp[] = new int[n];
        fib_dp[0] = 1;
        if (n==1){
            return fib_dp[0];
        }
        fib_dp[1] = 2;  
        for (int i=2; i<n ;i++){
            fib_dp[i] = fib_dp[i-1] + fib_dp[i-2];
        }
        return fib_dp[n-1];
    }
}