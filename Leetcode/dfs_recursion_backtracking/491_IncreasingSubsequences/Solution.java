class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        dfs(nums, 0, new LinkedList<>(), res);
        return new LinkedList<>(res);

    }
        private void dfs(int[] nums, int index,List<Integer> temp,
                        Set<List<Integer>> res){
            if(temp.size()>=2)
                res.add(new LinkedList<>(temp));
            for(int i = index; i<nums.length; ++i){
                if(temp.size()==0 || temp.get(temp.size()-1)<=nums[i]){
                    temp.add(nums[i]);
                    dfs(nums, i+1, temp, res);
                    temp.remove(temp.size()-1);
                }
            }
        }
}
