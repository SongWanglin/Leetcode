class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        dfs(res, new ArrayList<Integer>(), visited, 1, n, k);
        return res;
    }
        private void dfs(List<List<Integer>> res, List<Integer> temp,
                        boolean[] visited, int start, int n, int k){
            if( k==0 ){
                res.add( new ArrayList<Integer>((temp)) );
                return;
            }
            for(int i = start; i<=n; i++){
                if(visited[i-1])
                    continue;
                temp.add(i);
                visited[i-1]=true;
                dfs(res, temp, visited, i+1, n, k-1);
                temp.remove(temp.size()-1);
                visited[i-1]=false;
            }
        }
}
