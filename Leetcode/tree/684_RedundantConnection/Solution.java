class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] pred = new int[2001];
        for(int i = 0; i<2001; ++i) pred[i] = i;
        int[] res = {-1, -1};
        for(int i = 0; i<edges.length; ++i){
            int src = edges[i][0], dest = edges[i][1];
            while(src!=pred[src]) src = pred[src];
            while(dest!=pred[dest]) dest = pred[dest];
            if(src==dest){
                res = edges[i];
            }else{
                pred[dest] = src;
            }
        }
        return res;
    }
}
