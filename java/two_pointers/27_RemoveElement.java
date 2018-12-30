class Solution {
    public int removeElement(int[] nums, int val) {
        int firstValIndex = 0, temp;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=val){
                temp = nums[firstValIndex];
                nums[firstValIndex] = nums[i];
                nums[i] = temp;
                firstValIndex++;
            }
        }
        return firstValIndex;
    }
}

