class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0; i<n; ++i){ nums[i]=i+1; }
        List<List<Integer>> res = new LinkedList<>();
        dfs(res, new LinkedList<Integer>(), nums, k, 0);
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> temp,
                    int[] nums, int k, int start){
        if(k==0){
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i = start; i<nums.length; ++i){
            temp.add(nums[i]);
            dfs(res, temp, nums, k-1, i+1);
            temp.pollLast();
        }
    }
}
