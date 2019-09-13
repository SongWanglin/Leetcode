class Solution {
    public int removeDuplicates(int[] nums) {
        int lastNonDup = 0;
        for(int i = 1; i<nums.length; ++i){
            if(nums[i]==nums[lastNonDup])
                continue;
            nums[++lastNonDup] = nums[i];
        }
        return lastNonDup+1;
    }
}
