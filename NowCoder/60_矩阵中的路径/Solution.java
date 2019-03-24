public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] visited = new boolean[rows*cols];
        for(int i = 0; i<rows*cols; i++){
            visited[i] = false;
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(str[0] == matrix[i*cols+j] && search(matrix, visited,
                   rows, cols, str, i, j, 0) )
                    return true;
            }
        }
        return false;
    }
        private boolean search(char[] board, boolean[] visited, int rows, int cols,
                               char[] str, int i, int j, int index){
            if( index==str.length){
                return true;
            }
            if( i<0 || j<0 || i>=rows || j>=cols ||
                str[index]!=board[i*cols+j] ){
                return false;
            }
            if(visited[i*cols+j]==true)
                return false;
            visited[i*cols+j] = true;
            if( search(board, visited, rows, cols, str, i+1, j, index+1) ||
                search(board, visited, rows, cols, str, i-1, j, index+1) ||
                search(board, visited, rows, cols, str, i, j+1, index+1) ||
                search(board, visited, rows, cols, str, i, j-1, index+1) ){
                return true;
            }
            visited[i*cols+j] = false;
            return false;
        }
}
