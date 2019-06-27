class Solution {
    public boolean canJump(int[] nums) {
        if (nums==null || nums.length==0)
            return true;
        int len = nums.length, max = nums[0];
        for (int i = 0; i<len; i++){
            if (i<=max && nums[i]+i>=max){
                max = nums[i]+i;
            }
        }
        return max>=len-1;
    }
}
