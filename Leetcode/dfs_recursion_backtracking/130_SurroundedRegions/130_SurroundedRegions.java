class Solution {
    public void solve(char[][] board) {
        if(board==null || board.length==0) return;
        for(int i = 0; i<board.length; ++i){
            if(board[i][0]=='O')
                dfsMarkBorderO(board, i, 0);
            if(board[i][board[i].length-1]=='O')
                dfsMarkBorderO(board, i, board[i].length-1);
        }
        for(int j = 0; j<board[0].length; ++j){
            if(board[0][j]=='O')
                dfsMarkBorderO(board, 0, j);
            if(board[board.length-1][j]=='O')
                dfsMarkBorderO(board, board.length-1, j);
        }
        for(int i = 0; i<board.length; ++i){
            for(int j = 0; j<board[i].length; ++j){
                if( board[i][j]=='X' )
                    continue;
                board[i][j] = (board[i][j]=='O')? 'X': 'O';
            }
        }
    }
        private void dfsMarkBorderO(char[][] board,
                            int i, int j){
            if( i<0 || j<0 || i>=board.length || j>=board[i].length|| board[i][j]!='O'){
                return;
            }
            board[i][j] = 'x';
            dfsMarkBorderO(board, i+1, j);
            dfsMarkBorderO(board, i-1, j);
            dfsMarkBorderO(board, i, j+1);
            dfsMarkBorderO(board, i, j-1);
        }
}
