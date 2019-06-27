class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        DFS(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public int DFS(int[][] grid, int i, int j, int oldColor, int newColor){
        if ( (i<0) || (i>=grid.length) || (j<0) ||(j>=grid[0].length) || grid[i][j] !=oldColor)
            return 1;
        if ( grid[i][j] == newColor) return 0;
        grid[i][j] = newColor;
        return DFS(grid, i-1, j, oldColor, newColor) + DFS(grid, i+1, j, oldColor, newColor)
            + DFS(grid, i, j-1, oldColor, newColor) + DFS(grid, i, j+1, oldColor, newColor);
    }
}
