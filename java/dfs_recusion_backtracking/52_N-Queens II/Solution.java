class Solution {
    private int res = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        int tmp;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                board[i][j] = '.';
            }
        }
        backTrack(board, 0);
        tmp = res; res = 0;
        return tmp;
    }

        private void backTrack(char[][] board, int row){
            if(row == board.length){
                res += 1;
                return;
            }
            boolean haveGrid = false;
            for (int i = 0; i<board[0].length; i++){
                if(isSafe(board, row, i)){
                    board[row][i] = 'Q';
                    backTrack(board, row+1);
                    board[row][i] = '.';
                }
            }
        }

        private boolean isSafe(char[][] board, int row, int col){
            for(int i = 0; i<board.length; i++){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            for(int i = row, j = col; i>=0 && j>=0; i--, j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            for(int i = row, j = col; i>=0 && j<board[0].length; i--, j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
        }

}
