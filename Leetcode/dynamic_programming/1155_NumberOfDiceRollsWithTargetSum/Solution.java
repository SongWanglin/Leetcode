class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        /*/ // recursive solution, TLE for sure and require memorization
        if(d==0){
            return (target==0)? 1:0;
        }
        long res = 0, modulo = 1_000_000_000+7;
        for(int i = 1; i<f+1; i++){
            res += numRollsToTarget(d-1, f, target-i);
            res %= modulo;
        }
        return (int)res;/*/
        // dynamic programming solution
        long[][] dp = new long[d+1][target+1];
        long modulo = 1_000_000_000+7;
        for(int i = 1; i<=f && i<=target; i++)
            dp[1][i] = 1;
        for(int i = 2; i<=d; i++){
            for(int j = 1; j<=target; j++){
                for(int k = 1; k<j && k<=f; k++)
                    dp[i][j] += dp[i-1][j-k];
                    dp[i][j] %= modulo;
            }
        }
        return (int)(dp[d][target]%modulo);
    }
}
