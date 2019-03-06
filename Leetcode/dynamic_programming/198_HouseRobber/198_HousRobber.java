class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==0)
            return 0;
        if (n==1)
            return nums[0];
        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i<n; i++){
            nums[i] = Math.max(nums[i-2]+nums[i], nums[i-1]);
        }
        return nums[n-1];
        /* without modifying input*/
        /*/
        int[] profit = new int[n+1];
        profit[0] = 0; profit[1] = nums[0];
        for (int i = 1; i<n; i++){
            profit[i+1] = Math.max(profit[i-1]+nums[i], profit[i]);
        }
        return profit[n];
        /*/
    }
}
