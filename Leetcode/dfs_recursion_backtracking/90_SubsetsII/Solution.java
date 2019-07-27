class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        if(nums.length==0)
            return res;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        for(int i = 0; i<nums.length; i++){
            dfs(nums, 0, i, used, res, new ArrayList<Integer>() );
            }
        return res;
    }
        private void dfs(int[] nums, int start, int end, boolean[] used,
                        List<List<Integer>> res, List<Integer> preCombine){
            if(start > end){
                for(List l: res){
                    if(l.equals(preCombine))
                        return;
                }
                res.add(new ArrayList<>(preCombine));
                return;
            }
            for(int i = start;  i< nums.length; ++i){
                if(used[i]==true){
                    continue;
                }
                preCombine.add( nums[i]);  used[i] = true;
                dfs(nums, i+1, end, used, res, preCombine);
                preCombine.remove(preCombine.size()-1);  used[i] = false;
            }
        }
}
