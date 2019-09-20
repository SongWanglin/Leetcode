class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        boolean[] res = {true};
        int[] visited = new int[n];
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<n; ++i){
            graph.add(new ArrayList<Integer>());
        }
        for(int[] preq: prerequisites){
            graph.get(preq[0]).add(preq[1]);
        }
        for(int i = 0; i<n; ++i){
            dfs(res, visited, i, graph);
        }
        return res[0];
    }
        private void dfs(boolean[] res, int[] visited, int src,
                         List<ArrayList<Integer>> graph){
            visited[src] = 1;
            for(int dest: graph.get(src)){
                if(visited[dest]==1){
                    res[0] = false;
                }
                if(visited[dest]==0){
                    dfs(res, visited, dest, graph);
                }
            }
            visited[src] = -1;
        }
}
