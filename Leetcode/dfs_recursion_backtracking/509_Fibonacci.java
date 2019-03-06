class Solution {
    public int fib(int N) {
        /* recursive, concise but slow */
        /*/
        return (N<2)? N: fib(N-2)+fib(N-1);
        /*/
        /*greedy algorithm, trade space for time complexity*/

        int[] dp = new int[N+1];
        if (N==0)
            return dp[N];
        dp[1] = 1;
        for (int i = 2; i<N+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[N];

        /* formula */
        /*/
        if (N<2)
            return N;
        return  (int)((Math.pow((1+Math.sqrt(5))/2, N)
                  -Math.pow((1-Math.sqrt(5))/2, N))/Math.sqrt(5));
                  /*/
    }
}
