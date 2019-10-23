class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean res = false;
        for(int i = 0; i<board.length; ++i){
            for(int j = 0; j<board[i].length; ++j){
                if(board[i][j]==word.charAt(0))
                    res |= dfs(board, visited, i, j, word);
            }
        }
        return res;
    }
    private boolean dfs(char[][] board, boolean[][] visited,
                       int i, int j, String pattern){
        if(pattern.length()==0)
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || visited[i][j] || pattern.charAt(0)!=board[i][j])
            return false;
        visited[i][j] = true;
        boolean res = dfs(board, visited, i+1, j, pattern.substring(1)) || dfs(board, visited, i-1, j, pattern.substring(1)) ||
                    dfs(board, visited, i, j+1, pattern.substring(1)) || dfs(board, visited, i, j-1, pattern.substring(1));
        visited[i][j] = false;
        return res;
    }
}
