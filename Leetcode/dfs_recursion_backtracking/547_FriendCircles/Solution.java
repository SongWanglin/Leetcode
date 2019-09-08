class Solution {
    public int findCircleNum(int[][] M) {
        int res = 0;
        for(int i = 0; i<M.length; ++i){
            if( M[i][i]==1 ){
                dfs(M, i);
                res += 1;
            }
        }
        return res;
    }
        private void dfs(int[][] M, int id){
            if(M[id][id]==-1)
                return;
            M[id][id] = -1;
            for(int i = 0; i<M[id].length; ++i){
                if( M[id][i]==1 )
                    dfs(M, i);
            }
            return;
        }
}
