/*slow dfs*/
class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        return dfs(nums, 0, 0, S);
    }
        private int dfs(int[] nums, int index, int sum, int S){
            if (index==nums.length){
                return (sum==S)?1:0;
            }
            return dfs(nums, index+1, sum+nums[index], S)+dfs(nums, index+1, sum-nums[index], S);
        }
}

