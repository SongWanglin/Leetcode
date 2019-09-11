class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0)
            return 0;
        int res = 0;
        for(int i = 0; i<grid.length; ++i){
            for(int j = 0; j<grid[i].length; ++j){
                if(grid[i][j]=='0')
                    continue;
                dfsSink(grid, i, j);
                res += 1;
            }
        }
        return res;
    }
        private void dfsSink(char[][] grid,
                             int i, int j){
            if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')
                return;
            grid[i][j] = '0';
            dfsSink(grid, i+1, j);dfsSink(grid, i-1, j);
            dfsSink(grid, i, j+1);dfsSink(grid, i, j-1);
        }
}
