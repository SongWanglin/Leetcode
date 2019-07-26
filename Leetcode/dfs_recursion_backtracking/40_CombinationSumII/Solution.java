class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }
        private void dfs(List<List<Integer>> res, List<Integer> preCombine,
                         int[] candidates, int preSum, int start){
            if(preSum == 0){
                /*/Collections.sort(preCombine);
                for(List l: res){
                    if( preCombine.equals( l ))
                        return;
                }/*/
                res.add( new ArrayList<>(preCombine) );
                return;
            }
            if( preSum < 0 || start==candidates.length){
                return;
            }
            for(int i = start;  i< candidates.length; ++i){
                if(candidates[i]<0){
                    continue;
                }
                if(i!=start && candidates[i]==candidates[i-1]){
                    continue;
                }
                preCombine.add(candidates[i]);
                candidates[i] = -candidates[i];
                dfs(res, preCombine, candidates, preSum+candidates[i], i+1);
                preCombine.remove(preCombine.size()-1);
                candidates[i] = -candidates[i];
            }
        }
}
/*/
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && !visited[i - 1] && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (target < candidates[i]) {
                break;
            }
            visited[i] = true;
            list.add(candidates[i]);
            helper(i + 1, list, candidates, target - candidates[i], res, visited);
            visited[i] = false;
            list.remove(list.size() - 1);
        }/*/
