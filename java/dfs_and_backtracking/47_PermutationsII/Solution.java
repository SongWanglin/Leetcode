public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        /*/
        List<List<Integer>> res = new ArrayList<>();
        if (nums==null || nums.length==0) { return res; }
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> temp = new ArrayList();
        Arrays.sort(nums);
        dfs(res, temp, used, nums);
        return res;
        /*/
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
        /*/
        private void dfs(List<List<Integer>> res, ArrayList<Integer> temp, boolean[] used, int[] nums){
            if(temp.size() == nums.length){
                res.add(new ArrayList<Integer>(temp));
            }
            for (int i = 0; i<nums.length; i++){
                if(used[i]) continue;
                if(i>0 && nums[i-1]==nums[i] && !used[i-1]) continue;
                used[i] = true; temp.add(nums[i]);
                dfs(res, temp, used, nums);
                used[i] = false;
                temp.remove(temp.size()-1);
            }
        }
        /*/
}
