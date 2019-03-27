class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        // initialize and populate the adjacency list
        for(int i = 0; i<numCourses; ++i){ adjList.add(new ArrayList<Integer>());}
        for(int[] edge: prerequisites){ adjList.get(edge[1]).add(edge[0]); }
        // visited status
        int[] status = new int[numCourses];
        LinkedList<Integer> topoSeq = new LinkedList<>();
        for(int i = 0; i<numCourses; ++i){
            // if not visited, do dfs to see if cycle exists
            if(status[i] == 0){
                if(isCycleExisting(topoSeq, adjList, status, i)){
                    return new int[0];
                }
            }
        }
        // return topological sorted list
        int[] ans= new int[topoSeq.size()];
        for(int i = 0; i<numCourses; ++i){
            ans[i] = topoSeq.get(i);
        }
        return ans;
    }
        // visit status: 0 - unvisited, 1 - visiting, 2 - visited
        private boolean isCycleExisting(LinkedList<Integer> topoSeq, List<List<Integer>> adjList,
                                       int[] status, int cur){
            status[cur] = 1;
            // dfs recursion, return true if we run into visited node
            for(Integer succ: adjList.get(cur)){
                if(status[succ]==1){return true;}
                if(status[succ]==0){
                    if(isCycleExisting(topoSeq, adjList, status, succ)){
                        return true;
                    }
                }
            }
            topoSeq.addFirst(cur);
            status[cur] = 2;
            return false;
        }
}
