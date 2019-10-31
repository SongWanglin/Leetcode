class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] minCuts = new int[n];
        for(int i = n-1; i>=0; --i){
            minCuts[i] = Integer.MAX_VALUE;
            for(int j = i; j<n; ++j){
                dp[i][j] = (s.charAt(i)==s.charAt(j))&&(j-i<3||dp[i+1][j-1]);
                if(dp[i][j]){
                    if(j==n-1){
                        minCuts[i] = 0;
                    }else{
                        minCuts[i] = Math.min(minCuts[i], minCuts[j+1]+1);
                    }
                }
            }
        }
        return minCuts[0];
    }
}
