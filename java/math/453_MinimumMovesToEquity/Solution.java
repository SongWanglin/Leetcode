class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length, min=nums[0];
        for (int i=0; i<n; i++){
            min = (nums[i]<min)? nums[i] :min;
        }
        int res = 0;
        for (int i=0; i<n; i++){
            res += nums[i] - min;
        }
        return res;
    }
}
