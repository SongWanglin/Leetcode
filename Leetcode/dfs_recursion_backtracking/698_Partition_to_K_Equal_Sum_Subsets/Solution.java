class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num: nums){
            sum += num;
        }
        if (sum%k!=0){
            return false;
        }
        boolean[] visited = new boolean[nums.length];
        return checkSubsetSum(nums, visited, k, 0, 0, sum/k);
    }
        private boolean checkSubsetSum(int[] nums, boolean[] visited, int k, int start, int sum, int target){
            if (k==1) return true;
            if (sum == target) return checkSubsetSum(nums, visited, k-1, 0, 0, target);
            if (sum > target) return false;
            for (int i = start; i<nums.length; i++){
                if(!visited[i]){
                    visited[i] = true;
                    if( checkSubsetSum(nums, visited, k, i+1, sum+nums[i], target) ){
                        return true;
                    }
                    visited[i] = false;
                }
            }
            return false;
        }
}
