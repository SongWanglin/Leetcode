class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(res, path, graph, 0);
        return res;
    }
        private void dfs(List<List<Integer>> res, List<Integer> path,
                int[][] graph, int node){
            if(node == graph.length-1){
                res.add(new ArrayList(path));
                return;
            }
            for(int nextNode: graph[node]){
                path.add(nextNode);
                dfs(res, path, graph, nextNode);
                path.remove(path.size()-1);
            }
        }
}
