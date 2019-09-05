class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if( image[sr][sc]==newColor )
            return image;
        dfs(image, image[sr][sc], newColor, sr, sc);
        return image;
    }
        private void dfs(int[][] image, int oldColor, int newColor,
                        int i, int j){
            if( i<0 || j<0 || i>=image.length || j>=image[i].length)
                return;
            if( image[i][j]!=oldColor || image[i][j]==newColor )
                return;
            image[i][j] = newColor;
            dfs(image, oldColor, newColor, i+1, j);
            dfs(image, oldColor, newColor, i-1, j);
            dfs(image, oldColor, newColor, i, j+1);
            dfs(image, oldColor, newColor, i, j-1);
        }
}
