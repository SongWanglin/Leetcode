class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num: nums){
            sum += num;
        }
        if (sum%2!=0){
            return false;
        }
        boolean[] dp = new boolean[sum/2+1];
        dp[0] = true;
        for (int i = 0; i<nums.length; i++){
            for (int j = sum/2; j>=nums[i]; j--){
                dp[j] = dp[j] | dp[j-nums[i]];
            }
        }
        return dp[sum/2];
    }
}
/* 1st attempt, works but time limit exceed */
/*/
        return checkSubsetSum(nums, 0, nums[0], sum/2);
    }
        private boolean checkSubsetSum(int[] nums, int idx, int sum, int target){
            if (sum == target){
                return true;
            }
            boolean res = false;
            for (int i = idx+1; i<nums.length; i++){
                res = res | checkSubsetSum(nums, i, sum+nums[i], target);
            }
            return res;
        }
}
/**********************************************/
