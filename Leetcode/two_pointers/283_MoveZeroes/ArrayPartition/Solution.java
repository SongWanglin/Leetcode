public class Solution {
    /**
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        int lastSmallerIndex = 0, temp;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]<k){
                temp = nums[lastSmallerIndex];
                nums[lastSmallerIndex] = nums[i];
                nums[i] = temp;
                lastSmallerIndex++;
            }
        }
        return lastSmallerIndex;
    }
}
