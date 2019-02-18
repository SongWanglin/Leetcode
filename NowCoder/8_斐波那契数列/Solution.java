public class Solution {
    public int Fibonacci(int n) {
        if(n < 2){
            return n;
        }
        int temp;
        int[] dp = new int[2]; dp[1] = 1;
        for (int i = 2; i<=n; i++){
            temp = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return dp[1];
    }
}
