class Solution {
    /*/
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        //res.add(new ArrayList<Integer>());
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        for(int i = 0; i<=nums.length; i++){
            dfs(res, new ArrayList<Integer>(), nums, used, 0, i);
        }
        return new ArrayList<>(res);
    }
        private void dfs(Set<List<Integer>> res, List<Integer> temp,
                        int[] nums, boolean[] used, int start, int len){
            if( temp.size()==len ){
                List<Integer> list = new ArrayList<>(temp);
                Collections.sort(list);
                res.add(list);
                return;
            }
            if( start==nums.length && temp.size()<len){
                return;
            }
            for(int i = start; i<nums.length; i++){
                if(used[i]==true){
                    continue;
                }
                temp.add(nums[i]); used[i] = true;
                dfs(res, temp, nums, used, start+1, len);
                temp.remove(temp.size()-1); used[i] = false;
            }
        }/*/
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

        private void backtrack(List<List<Integer>> list , List<Integer> temp, int [] nums, int start){
            list.add(new ArrayList<>(temp));
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtrack(list, temp, nums, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
}
