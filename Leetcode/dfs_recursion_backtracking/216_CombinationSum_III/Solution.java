class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>  res = new LinkedList<>();
        dfs(res, new LinkedList<Integer>(), n, k, 1, 0);
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> temp,
                    int n, int k, int start, int total){
        if( total>n || temp.size()>k )
            return;
        if( total==n && temp.size()==k ){
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i = start; i<10; ++i){
            temp.add(i);
            dfs(res, temp, n, k, i+1, total+i);
            temp.pollLast();
        }
    }
}
