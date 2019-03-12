public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index==0)
            return 0;
        int[] dp = new int[index];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0, min = 0;
        for(int i = 1; i<index; i++){
            min = Math.min( Math.min(dp[i2]*2, dp[i3]*3), dp[i5]*5);
            i2 += (min==dp[i2]*2)?1:0;
            i3 += (min==dp[i3]*3)?1:0;
            i5 += (min==dp[i5]*5)?1:0;
            dp[i] = min;
        }
        return dp[index-1];
    }
}
