class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==0)
            return 0;
        if (n==1)
            return nums[0];
        if (n==2)
            return Math.max(nums[0], nums[1]);
        int[] profit1 = new int[n], profit2 = new int[n];
        profit1[0] = 0; profit1[1] = nums[0];
        profit2[0] = 0; profit2[1] = nums[1];
        for (int i = 1; i<n-1; i++){
            profit1[i+1] = Math.max(profit1[i-1]+nums[i], profit1[i]);
            profit2[i+1] = Math.max(profit2[i-1]+nums[i+1], profit2[i]);
        }
        return Math.max(profit1[n-1], profit2[n-1]);
    }


}
