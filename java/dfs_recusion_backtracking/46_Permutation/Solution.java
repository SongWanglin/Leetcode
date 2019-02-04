class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0) return res;
        dfs(res, nums, 0);
        return res;
    }
        private void dfs(List<List<Integer>> res, int[] nums, int index){
            if (index==nums.length){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int num: nums){ temp.add(num); }
                res.add(temp);
                return;
            }
            HashSet<Integer> used = new HashSet<>();
            for (int i = index; i<nums.length; ++i){
                if(used.add(nums[i])){
                    swap(nums, index, i);
                    dfs(res, nums, index+1);
                    swap(nums, index, i);
                    }
                }
        }

        private void swap(int[] nums, int i, int j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
}
