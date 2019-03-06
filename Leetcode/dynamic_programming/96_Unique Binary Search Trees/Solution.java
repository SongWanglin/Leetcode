class Solution {
    public int numTrees(int n) {
        /* dynamic programming, should be faster with memorization */
        int[] dp = new int[n+1];
        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i<=n; i++){
            for (int j = 1; j<=i; j++){
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
    /* simple recursion, slow but work */
    /*/
        if (n==0)
            return 1;
        if (n<=2)
            return n;
        int res = 0;
        for(int i = 1; i<=n; i++){
            res = res + numTrees(i-1)*numTrees(n-i);
        }
        return res;
    }
    /*/
    /* directly apply the catalan number, doesn't work for n>10*/
    /*/
    public int numTrees(int n) {
        long input = n;
        return (int)(fac(2*input)/fac(input+1)/fac(input));
    }
        private long fac(long n){
            return (n<2)? n: n*fac(n-1);
        }
        /*/
}
