class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1)
                    return DFS(grid, i, j);
            }
        }
        return 0;
    }

    public int DFS(int[][] grid, int i, int j){
        if ( (i<0) || (i>=grid.length) || (j<0) ||(j>=grid[0].length) || grid[i][j] == 0)
            return 1;
        if ( grid[i][j] ==-1) return 0;
        grid[i][j] = -1;
        return DFS(grid, i-1, j) + DFS(grid, i+1, j) + DFS(grid, i, j-1) + DFS(grid, i, j+1);
    }
}
/*/class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if(grid[i][j]==0)
                    continue;
                res += edgeCount(grid, i, j);
            }
        }
        return res;
    }

    public int edgeCount(int[][] grid, int i, int j){
        int guess = 4*grid[i][j];
        int left = (i==0)?0: grid[i-1][j];
        int right = (i==grid.length-1)? 0:grid[i+1][j];
        int up = (j==0)?0:grid[i][j-1];
        int down = (j==grid[0].length-1)? 0:grid[i][j+1];
        return Math.abs(guess-left-right-up-down)*grid[i][j];
    }
}/*/
