class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                res = Math.max( dfs(grid, i, j), res );
            }
        }
        return res;
    }
        private int dfs(int[][] grid, int i, int j){
            if( i<0 || i>=grid.length || j<0 || j>=grid[i].length){
                return 0;
            }
            if(grid[i][j]==0){
                return 0;
            }
            grid[i][j]=0;
            return 1+dfs(grid, i+1, j)+dfs(grid, i-1, j)
                +dfs(grid, i, j-1)+dfs(grid, i, j+1);
        }
}
