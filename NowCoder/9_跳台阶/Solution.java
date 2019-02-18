public class Solution {
    public int JumpFloor(int target) {
        if(target < 2){
             return 1;
        }
        int[] dp = new int[2]; dp[1] = 1;
        int temp;
        for (int i = 2; i<=target+1; i++){
            temp = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return dp[1];
    }
}
