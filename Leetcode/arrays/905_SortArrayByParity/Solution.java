class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int firstOddIndex = 0, temp;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]%2==0){
                temp = nums[firstOddIndex];
                nums[firstOddIndex] = nums[i];
                nums[i] = temp;
                firstOddIndex+=1;
            }
        }
        return nums;
    }
}
