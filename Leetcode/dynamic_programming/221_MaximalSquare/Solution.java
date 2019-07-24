class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        int wide = 0;
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i][j-1])+1;
                    wide = Math.max(wide, dp[i][j]);
                }
            }
        }
        return wide*wide;
    }
}
        /*/
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=cols;c++){
                if(matrix[r-1][c-1]=='1'){
                    dp[r][c]=Math.min(Math.min(dp[r-1][c],dp[r-1][c-1]),dp[r][c-1])+1;
                    result=Math.max(result,dp[r][c]);
                }
            }
        }
        return result*result;/*/
