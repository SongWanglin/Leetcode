class Solution {
    public boolean makesquare(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if( sum==0 || sum%4!=0 )
            return false;
        int[] edges = {sum/4, sum/4, sum/4, sum/4};
        return dfs(nums, nums.length-1, edges);
    }
    private boolean dfs(int[] nums, int index, int[] edges){
        if(index<0)
            return true;
        for(int i = 0; i<4; ++i){
            if(edges[i] >= nums[index]){
                edges[i] -= nums[index];
                if(dfs(nums, index-1, edges)){
                    return true;
                }
                edges[i] += nums[index];
            }
        }
        return false;
    }
}
