class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        int[] res = new int[n];
        Arrays.fill(res, -1);
        res[0] = 0;  int d = 1;
        boolean[] visited = new boolean[2*n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);   queue.add(null);
        while(!queue.isEmpty()) {
            Integer cur = queue.remove();
            if(cur == null) {
                if(!queue.isEmpty()){
                    queue.add(null);
                    d++;
                }
            }
            else if(visited[cur+n] == false) {
                visited[cur+n] = true;
                if(cur >= 0) {
                    for(int[] r : red_edges) {
                        if(r[0] == cur) {
                            if( res[r[1]] == -1) res[r[1]] = d;
                            queue.add(-r[1]);
                        }
                    }
                }
                if(cur <= 0) {
                    for(int[] b : blue_edges) {
                        if(b[0] == -cur) {
                            if( res[b[1]] == -1) res[b[1]] = d;
                            queue.add(b[1]);
                        }
                    }
                }
            }
        }
        return res;
    }
}
/*/
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        int d = 1;
        boolean[] visited = new boolean[2*n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(null);
        while(!queue.isEmpty()) {
            Integer cur = queue.remove();
            if(cur == null) {
                if(!queue.isEmpty()){
                    queue.add(null);
                    d++;
                }
            }
            else if(visited[cur+n] == false) {
                visited[cur+n] = true;
                if(cur >= 0) {
                    for(int[] r : red_edges) {
                        if(r[0] == cur) {
                            if(ans[r[1]] == -1) ans[r[1]] = d;
                            queue.add(-r[1]);
                        }
                    }
                }
                if(cur <= 0) {
                    for(int[] b : blue_edges) {
                        if(b[0] == -cur) {
                            if(ans[b[1]] == -1) ans[b[1]] = d;
                            queue.add(b[1]);
                        }
                    }
                }
            }
        }
        return ans;
/*/
