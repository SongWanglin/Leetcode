class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        int[] dp = new int[n+1];
        dp[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--)
            dp[i] = Math.max(nums[i]+dp[i+2], dp[i+1]);
        return dp[0];
    }
}
