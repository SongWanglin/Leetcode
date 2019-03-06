class Solution {
    public int removeDuplicates(int[] nums) {
        int firstValIndex = 0, temp, l=nums.length;

        for (int i = 0; i<l; i++){
            if (nums[i]!=nums[firstValIndex]){
                ++firstValIndex;
                temp = nums[firstValIndex];
                nums[firstValIndex] = nums[i];
                nums[i] = temp;
            }
        }
        return firstValIndex+1;
    }
}
