class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new LinkedList<Integer>(), candidates, 0, target);
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> temp,
                    int[] candidates, int start, int preSum){
        if(preSum<0){
            return;
        }
        else if(preSum==0 && !res.contains(temp)){
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i = start; i<candidates.length; ++i){
            if(preSum-candidates[i]<0)
                break;
            temp.add(candidates[i]);
            dfs(res, temp, candidates, i+1, preSum-candidates[i]);
            temp.pollLast();
            while(i<candidates.length-1 && candidates[i]==candidates[i+1]) ++i;
        }
    }
}
