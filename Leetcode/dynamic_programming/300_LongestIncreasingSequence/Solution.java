class Solution {
    /* O(n^2) DP*/
    public int lengthOfLIS(int[] nums) {
        int len = nums.length, max = 0;
        int[] LIS = new int[len];
        for (int i = 0; i<len; i++){
             LIS[i] = 1;
             for (int j = 0; j<i; j++){
                 LIS[i] = (nums[i]>nums[j] && 1+LIS[j]>LIS[i])? 1+LIS[j]: LIS[i];
             }
            max = Math.max(LIS[i], max);
        }
        return max;
    }
}
/* O(nlogn) DP */
/*/public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
}
/*/
