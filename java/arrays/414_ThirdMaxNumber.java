class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        if (len==0)
            return Integer.MIN_VALUE;
        long[] temp = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int i = 0; i<len; i++){
            getLargestThree(temp, nums[i]);
        }
        return (temp[2]==Long.MIN_VALUE)? (int)temp[0]: (int)temp[2];
    }
        private void getLargestThree( long[] nums, int x){
            if (x>nums[0]) {
                nums[2] = nums[1];
                nums[1] = nums[0];
                nums[0] = x;
            } else if(nums[0]>x && nums[1]<x){
                nums[2] = nums[1];
                nums[1] = x;
            } else if(nums[1]>x && nums[2]<x){
                nums[2] = x;
            }
        }
}
