class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }
        private void dfs(List<List<Integer>> res, List<Integer> preCombine,
                         int[] candidates, int preSum, int start){
            if(preSum == 0){
                res.add( new ArrayList<Integer>((preCombine)) );
                return;
            }
            if( preSum < 0 ){
                return;
            }
            for(int i = start;  i< candidates.length; i++){
                preCombine.add(candidates[i]);
                dfs(res, preCombine, candidates, preSum-candidates[i], i);
                preCombine.remove(preCombine.size()-1);
            }
        }
}
