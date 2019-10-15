class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        for(int i = 0; i<=nums.length; ++i){
            dfs(res, new LinkedList<Integer>(), nums, i, 0);
        }
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> temp,
                    int[]nums, int length, int start){
        if(temp.size()==length){
            res.add(new LinkedList<Integer>(temp));
        }
        for(int i = start; i<nums.length; ++i){
            temp.add(nums[i]);
            dfs(res, temp, nums, length, i+1);
            temp.pollLast();
        }
    }
}
