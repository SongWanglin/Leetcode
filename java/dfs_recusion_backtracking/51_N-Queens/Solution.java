class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        List<List<String>> res = new ArrayList<List<String>>();
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                board[i][j] = '.';
            }
        }
            backTrack(board, 0, res);
        return res;
    }

        private void backTrack(char[][] board, int row, List<List<String>> res){
            if(row == board.length){
                addSolution(board, res);
                return;
            }
            boolean haveGrid = false;
            for (int i = 0; i<board[0].length; i++){
                if(isSafe(board, row, i)){
                    board[row][i] = 'Q';
                    backTrack(board, row+1, res);
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

        private void addSolution(char[][] board, List<List<String>> res){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i<board.length; i++){
                temp.add( new String(board[i]) );
            }
            res.add(temp);
        }
}
