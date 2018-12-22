class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length, sum = 0;
        Arrays.sort(nums);
        for (int i =0; i<n/2; i++){
            sum +=nums[2*i];
        }
        return sum;
    }
}