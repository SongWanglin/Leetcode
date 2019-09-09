class Solution {
    public int findTargetSumWays(int[] nums, int S){
        int sum = 0;
        for(int num: nums) sum+=num;
        if(Math.abs(S)>sum) return 0;
        int[][] dp = new int[nums.length+1][2*sum+1];
        dp[0][sum] = 1;
        for(int i = 0; i<nums.length; ++i){
            for(int j = 0; j<2*sum+1; ++j){
                if(dp[i][j]!=0){
                    dp[i+1][j-nums[i]] += dp[i][j];
                    dp[i+1][j+nums[i]] += dp[i][j];
                }
            }
        }
        return dp[nums.length][S+sum];
    }

    /*/// brute force dfs
    public int findTargetSumWays(int[] nums, int S) {
        int[] res = new int[1];
        dfs(nums, 0, S, res);
        return res[0];
    }
        private void dfs(int[] nums, int index, int S, int[] res){
            if(index>=nums.length){
                if( S==0 )
                    res[0]+=1;
                return;
            }
            dfs(nums, index+1, S-nums[index], res);
            dfs(nums, index+1, S+nums[index], res);
        }/*/
}
