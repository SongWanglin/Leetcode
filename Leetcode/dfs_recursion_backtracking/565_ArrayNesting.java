class Solution {
     public int arrayNesting(int[] nums) {
        int tmp = -1, max = 1;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]==i || nums[i]<0)
                continue;
            tmp = dfs(i, nums, i);
            max = Math.max(max, tmp);
        }
        return max;
    }
        private int dfs(int index, int nums[], int start){
            nums[index] = -nums[index];
            if (Math.abs(nums[index])==start){
                return 1;
            }
            return 1+dfs(Math.abs(nums[index]), nums, start);
        }/*/
    /* slow recursion */
    /*/
    public int arrayNesting(int[] nums) {
        int tmp = -1, max = 1;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]==i)
                continue;
            tmp = dfs(i, nums, i);
            max = Math.max(max, tmp);
        }
        return max;
    }
        private int dfs(int index, int nums[], int start){
            if (nums[index]==start){
                return 1;
            }
            return 1+dfs(nums[index], nums, start);
        }/*/
}
