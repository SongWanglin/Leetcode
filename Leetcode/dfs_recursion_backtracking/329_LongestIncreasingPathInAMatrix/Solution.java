class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return 0;
        int[][] distance = new int[matrix.length][matrix[0].length];
        int[] res = {Integer.MIN_VALUE};
        for(int i = 0; i<matrix.length; ++i){
            for(int j = 0; j<matrix[i].length; ++j){
                dfs(matrix, distance, Long.MAX_VALUE, res, i, j);
            }
        }
        return res[0];
    }
    private int dfs(int[][] matrix, int[][] distance, long prev,
                   int[] res, int i, int j){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[i].length || matrix[i][j] >= prev){
            return 0;
        }
        if(distance[i][j]==0){
            distance[i][j] = 1 + Math.max(
                Math.max(dfs(matrix, distance, matrix[i][j], res, i-1, j),
                         dfs(matrix, distance, matrix[i][j], res, i+1, j) ),
                Math.max(dfs(matrix, distance, matrix[i][j], res, i, j-1),
                         dfs(matrix, distance, matrix[i][j], res, i, j+1) )
            );
        }
        res[0] = Math.max(res[0], distance[i][j]);
        return distance[i][j];
    }
}
