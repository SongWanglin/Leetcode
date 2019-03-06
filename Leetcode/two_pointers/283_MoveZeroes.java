class Solution {
    public void moveZeroes(int[] nums) {
        int firstZeroIndex = 0, temp;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=0){
                temp = nums[firstZeroIndex];
                nums[firstZeroIndex] = nums[i];
                nums[i] = temp;
                firstZeroIndex++;
            }
        }
    }
}
