class Solution {
    public int removeElement(int[] nums, int val) {
        int firstVal = 0, temp;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=val){
                temp = nums[firstVal];
                nums[firstVal] = nums[i];
                nums[i] = temp;
                firstVal++;
            }
        }
        return firstVal;
    }
}
