class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    DFS(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    public int DFS(char[][] grid, int i, int j){
        if ( (i<0) || (i>=grid.length) || (j<0) ||(j>=grid[0].length) || grid[i][j] == 0)
            return 1;
        if ( grid[i][j] == '0') return 0;
        grid[i][j] = '0';
        return DFS(grid, i-1, j)|DFS(grid, i+1, j)| DFS(grid, i, j-1)|DFS(grid, i, j+1);
    }
}
