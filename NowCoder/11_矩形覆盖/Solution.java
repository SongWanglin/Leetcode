public class Solution {
    public int RectCover(int target) {
        if(target<2){
            return target;
        }
        int[] dp = new int[2]; dp[1] = 1;
        int tmp;
        for (int i = 2; i<=target+1; i++){
            tmp = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = tmp;
        }
        return dp[1];
    }
}
