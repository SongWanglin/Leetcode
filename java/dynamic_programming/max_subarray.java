class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int maxEndAt = 0;
        for (int i = 0; i<nums.length ; i++){
            maxEndAt = maxEndAt + nums[i];
            if ( maxEndAt > result){
                result = maxEndAt;                                         
            }
            if ( maxEndAt <0){
                maxEndAt = 0;
            }
        }
        return result;
    }
}