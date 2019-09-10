class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        if (r==0 ) return;
        int c = board[0].length;
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if(i*(r-1-i)!=0 && j*(c-1-j)!=0 ) continue;
                if (board[i][j] == 'O')
                    DFS(board, i, j);
            }
        }
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if(board[i][j] == 'X' ) continue;
                board[i][j] = (board[i][j]=='x')? 'O': 'X';
            }
        }
    }
    public int DFS(char[][] grid, int i, int j){
        if ( i<0 || i>=grid.length || j<0 ||j>=grid[0].length ){
            return 0;
        }
        if (grid[i][j] == 'x' || grid[i][j]=='X') return 1;
        grid[i][j] = 'x';
        return DFS(grid, i-1, j)|DFS(grid, i+1, j)| DFS(grid, i, j-1)|DFS(grid, i, j+1);
    }
}
