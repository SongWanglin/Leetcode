class Solution {/*/ //dynamic programming
    public int findTargetSumWays(int[] nums, int S){
        int sum = 0;
        for(int num: nums) sum+=num;
        int[] dp = new int[2*sum+1];

        return dp[sum+S];
    }
    /*///brute force dfs
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
        }
}
