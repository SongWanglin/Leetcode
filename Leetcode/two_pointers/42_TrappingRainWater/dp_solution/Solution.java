class Solution {
    public int trap(int[] height) {
        if(height.length==0) return 0;
        int n = height.length, left_highest = height[0], right_highest = height[n-1];
        int[] dp = new int[n];  //highest water level allowed
        // left side highest wall
        for(int i = 1; i<height.length; ++i){
            dp[i] = left_highest;
            left_highest = Math.max(height[i], left_highest);
        }
        // right side highest wall
        for(int i = n-1; i>0; --i){
            dp[i] = Math.min(right_highest, dp[i]);
            right_highest = Math.max(height[i], right_highest);
        }
        int res = 0;
        for(int i = 1; i<height.length-1; ++i){
            if(height[i] >= dp[i])
                continue;
            res += dp[i]-height[i];
        }
        return res;
    }
}
