class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        int[] dp = new int[2];
        for(int i = n-1; i>=0; i--){
            int temp = dp[0];
            dp[0] = Math.max(nums[i]+dp[1], dp[0]);
            dp[1] = temp;
        }
        return dp[0];
    }
}
