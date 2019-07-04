class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int[] dp = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            dp[i+1] = sum(nums, 0, i);
        }
        for(int i = 0; i<nums.length+1; i++){
            for(int j = 0; j<i; j++){
                if(dp[i]-dp[j]==k){res++;}
            }
        }
        return res;
    }
        private int sum(int[] nums, int start, int end){
            int res = 0;
            for(int i = start; i <= end; i++){
                res += nums[i];
            }
            return res;
        }
}
