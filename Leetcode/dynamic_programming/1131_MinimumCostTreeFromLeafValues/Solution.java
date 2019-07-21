class Solution {
    public int mctFromLeafValues(int[] arr) {
        int[][] max = new int[arr.length][arr.length];
        int[][] dp = new int[arr.length][arr.length];
        for(int i = 0; i < arr.length; i ++) {
            int localMax = Integer.MIN_VALUE;
            for(int j = i; j < arr.length; j++) {
                localMax = Math.max(arr[j], localMax);
                max[i][j] = localMax;
            }
        }
      for(int len = 1; len < arr.length; len ++) {
            for(int left = 0; left + len < arr.length; left ++) {
//        for(int left = 0; left<arr.length; left++){
//            for(int len = 1; left+len < arr.length; len++){
                int right = left + len;
                if(len==1){
                    dp[left][right] = arr[left]*arr[right];
                    continue;
                }
                dp[left][right] = Integer.MAX_VALUE;
                for(int k = left; k<right; k++){
                    dp[left][right] = Math.min(dp[left][right], dp[left][k] + dp[k+1][right]
                                              +max[left][k]*max[k+1][right]);
                }
            }
        }
        return dp[0][arr.length-1];
        //return mct(arr, max, 0, arr.length-1);
    }
    /*///recursive solution: time limit exceed
        private int mct(int[] arr, int[][] m, int i, int j){
            if(i-j==0)
                return 0;
            if(j-i==1){
                return arr[j]*arr[i];
            }
            int res = Integer.MAX_VALUE;
            for(int k = i; k<j; k++){
                res = Math.min(res, m[i][k]*m[k+1][j]
                               +mct(arr, m, i, k)+mct(arr, m, k+1, j));
            }
            return res;
        }/*/
}
