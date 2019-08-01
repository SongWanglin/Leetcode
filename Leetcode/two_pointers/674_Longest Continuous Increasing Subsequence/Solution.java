class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int res = 1, slow = -1, fast = 0;
        for(fast = 0; fast < nums.length-1; fast++){
            if(nums[fast]<nums[fast+1]){
                continue;
            }
            res = Math.max(fast-slow, res);
            slow = fast;
        }
        return Math.max(res, fast-slow);
    }
}
