class Solution {
    public int removeDuplicates(int[] nums) {
        int firstValIndex = 1;
        for (int i = 2; i<nums.length; i++){
            if(nums[firstValIndex-1]==nums[i] && nums[firstValIndex]==nums[i])
                continue;
            firstValIndex+=1;
            nums[firstValIndex] = nums[i];
        }
        return firstValIndex+1;
    }
}
