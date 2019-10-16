class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i<=nums.length; ++i){
            dfs(res, new LinkedList<Integer>(), nums, 0, i);
        }
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> temp,
                    int[] nums, int start, int k){
        if(k==0){
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i = start; i<nums.length; ++i){
            if(i>start && nums[i-1]==nums[i])
                continue;
            temp.add(nums[i]);
            dfs(res, temp, nums, i+1, k-1);
            temp.pollLast();
        }
    }
}
